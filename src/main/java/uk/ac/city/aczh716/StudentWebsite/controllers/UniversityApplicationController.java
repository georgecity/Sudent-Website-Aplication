package uk.ac.city.aczh716.StudentWebsite.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import uk.ac.city.aczh716.StudentWebsite.entities.UniversityApplication;
import uk.ac.city.aczh716.StudentWebsite.services.UniversityApplicationService;

@Controller
public class UniversityApplicationController {

    /**
     * The appliying service which is used to save uni applications to the
     * database.
     */
    private UniversityApplicationService universityApplicationService;

    /**
     * Constructor based dependency injection of the applying service
     *
     * @param universityApplicationService
     */
    @Autowired
    public UniversityApplicationController(UniversityApplicationService universityApplicationService){
        this.universityApplicationService = universityApplicationService;
    }

    /**
     * Controller method to handle a get request to the /apply endpoint
     *
     * @return ModelAndView an object that combines the apply.html page with a UniversityApplication
     * object that can be filled out with application data to be saved to the database.
     */
    @RequestMapping(value = "apply", method = RequestMethod.GET)
    public ModelAndView showApplication(){
        UniversityApplication universityApplication = new UniversityApplication();
        return new ModelAndView("apply", "universityApplication", universityApplication);
    }

    /**
     * Controller method to handle a post request to the /apply endpoint
     *
     * @param universityApplication the universityApplication object that contains the the information to
     *                be saved to the database.
     * @return String a redirect to the profile page.
     */
    @RequestMapping (value = "apply", method = RequestMethod.POST)
    public String processApplication(UniversityApplication universityApplication){
        //Retrieves the email address of the currently logged in user.
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        universityApplication.setEmail(email);

        universityApplicationService.makeUniversityApplication(universityApplication);
        return "redirect:/profile";
    }

}