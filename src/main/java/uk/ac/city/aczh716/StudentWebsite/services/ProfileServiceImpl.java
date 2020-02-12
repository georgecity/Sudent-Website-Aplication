package uk.ac.city.aczh716.StudentWebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uk.ac.city.aczh716.StudentWebsite.dao.UniversityApplicationRepository;
import uk.ac.city.aczh716.StudentWebsite.dao.HistoryRepository;
import uk.ac.city.aczh716.StudentWebsite.dao.StudentRepository;
import uk.ac.city.aczh716.StudentWebsite.entities.UniversityApplication;
import uk.ac.city.aczh716.StudentWebsite.entities.CollatedUser;
import uk.ac.city.aczh716.StudentWebsite.entities.LoginHistory;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProfileServiceImpl implements ProfileService {


    /**
     * The repository for student user data.
     */
    private StudentRepository studentRepository;
    /**
     * The repository for application data.
     */
    private UniversityApplicationRepository universityApplicationRepository;
    /**
     * The repository for login history.
     */
    private HistoryRepository historyRepository;


    /**
     *
     * Constructor based dependency injection of repositories.
     *
     * @param studentRepository the student user repo
     * @param universityApplicationRepository the application repo
     * @param historyRepository the login history repo
     */
    @Autowired
    public ProfileServiceImpl(StudentRepository studentRepository,
                              UniversityApplicationRepository universityApplicationRepository,
                              HistoryRepository historyRepository){
        this.studentRepository = studentRepository;
        this.universityApplicationRepository = universityApplicationRepository;
        this.historyRepository = historyRepository;
    }

    /**
     * The implemented method that collates all the current users information
     * into a single object that will back the profile.html view
     *
     * @param email the current user's email
     * @return CollatedUser a object that aggregates all the user's data.
     */
    @Override
    public CollatedUser getProfile(String email) {
        CollatedUser user = new CollatedUser();
        user.setStudentUser(studentRepository.findById(email).orElseThrow(()-> new UsernameNotFoundException("No matching user found.")));
        List<UniversityApplication> universityApplications = universityApplicationRepository.findAll()
                .stream().filter(universityApplication -> universityApplication.getEmail().equals(email))
                .collect(Collectors.toList());
        user.setUniversityApplications(universityApplications);
        List<LoginHistory> history = historyRepository.findAll()
                .stream().filter(loginHistory -> loginHistory.getEmail().equals(email))
                .collect(Collectors.toList());
        user.setLogins(history);
        return user;
    }
}
