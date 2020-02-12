package uk.ac.city.aczh716.StudentWebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.city.aczh716.StudentWebsite.dao.UniversityApplicationRepository;
import uk.ac.city.aczh716.StudentWebsite.entities.UniversityApplication;

/**
 * Class implementing the methods specified in UniversityApplicationService
 */
@Service
public class UniversityApplicationServiceImpl implements UniversityApplicationService {

    /**
     * The UniversityApplicationRepostiory for interacting with the database table backing the
     * UniversityApplication entity.
     */
    private UniversityApplicationRepository universityApplicationRepository;

    /**
     * Constructor based dependency injection of the university repository.
     * @param universityApplicationRepository
     */
    @Autowired
    public UniversityApplicationServiceImpl(UniversityApplicationRepository universityApplicationRepository){
        this.universityApplicationRepository = universityApplicationRepository;
    }

    /**
     * Implemented method using the UniversityApplicationRepostiory to save the universityApplication data.
     *
     * @param universityApplication object that contains the universityApplication data.
     */
    @Override
    public void makeUniversityApplication(UniversityApplication universityApplication) {
        universityApplicationRepository.save(universityApplication);
    }
}
