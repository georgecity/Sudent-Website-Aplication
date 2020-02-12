package uk.ac.city.aczh716.StudentWebsite.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * A controller to handle GET requests to the home and Student pages
 *
 */
@Controller
public class StudentController {


    /**
     * Controller method to handle a GET request to the / endpoint (homepage)
     *
     * @return ModelAndView returns a view constructed from index.html (no model required)
     */
    @RequestMapping (value = "/index")
    public ModelAndView showHome(){
        return new ModelAndView("index");
    }

    /**
     * Controller method to handle a GET request to the  /endpoint
     *
     * @return ModelAndView returns a view constructed from maths.html (no model required)
     */
    @RequestMapping(value = "/maths") public ModelAndView showMaths(){ return new ModelAndView("maths"); }

    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from physics.html (no model required)
     */
    @RequestMapping(value = "/physics") public ModelAndView showPhysics(){ return new ModelAndView("physics"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from mechaelectrical.html (no model required)
     */
    @RequestMapping(value = "/mechaelectrical") public ModelAndView showMechaelectrical(){ return new ModelAndView("mechaelectrical"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from medicine.html (no model required)
     */
    @RequestMapping(value = "/medicine") public ModelAndView showMedicine(){ return new ModelAndView("medicine"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from mechanical.html (no model required)
     */
    @RequestMapping(value = "/mechanical") public ModelAndView showMechanical(){ return new ModelAndView("mechanical"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from chemistry.html (no model required)
     */
    @RequestMapping(value = "/chemistry") public ModelAndView showChemistry(){ return new ModelAndView("chemistry"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from compscience.html (no model required)
     */
    @RequestMapping(value = "/compscience") public ModelAndView showCompscience(){ return new ModelAndView("compscience"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from law.html (no model required)
     */
    @RequestMapping(value = "/law") public ModelAndView showLaw(){ return new ModelAndView("law"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from economics.html (no model required)
     */
    @RequestMapping(value = "/economics") public ModelAndView showEconomics(){ return new ModelAndView("economics"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from biology.html (no model required)
     */
    @RequestMapping(value = "/biology") public ModelAndView showBiology(){ return new ModelAndView("biology"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from neuroscience.html (no model required)
     */
    @RequestMapping(value = "/neuroscience") public ModelAndView showNeuroscience(){ return new ModelAndView("neuroscience"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from politics.html (no model required)
     */
    @RequestMapping(value = "/politics") public ModelAndView showPolitics(){ return new ModelAndView("politics"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from biomedical.html (no model required)
     */
    @RequestMapping(value = "/biomedical") public ModelAndView showBiomedical(){ return new ModelAndView("biomedical"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from nutrition.html (no model required)
     */
    @RequestMapping(value = "/nutrition") public ModelAndView showNutrition(){ return new ModelAndView("nutrition"); }
    /**
     * Controller method to handle a GET request to the / endpoint
     *
     * @return ModelAndView returns a view constructed from molecular.html (no model required)
     */
    @RequestMapping(value = "/moleculargen") public ModelAndView showMoleculargen(){ return new ModelAndView("moleculargen"); }

    /**
     * Controller method to handle a GET request to the / endpoint (homepage)
     *
     * @return ModelAndView returns a view constructed from aberdeen.html (no model required)
     */
    @RequestMapping (value = "/aberdeen")
    public ModelAndView showAberdeen(){
        return new ModelAndView("aberdeen");
    }

    /**
     * Controller method to handle a GET request to the / endpoint (homepage)
     *
     * @return ModelAndView returns a view constructed from kings.html (no model required)
     */
    @RequestMapping (value = "/kings")
    public ModelAndView showKings(){
        return new ModelAndView("kings");
    }

    /**
     * Controller method to handle a GET request to the / endpoint (homepage)
     *
     * @return ModelAndView returns a view constructed from oxford.html (no model required)
     */
    @RequestMapping (value = "/oxford")
    public ModelAndView showOxford(){
        return new ModelAndView("oxford");
    }
}
