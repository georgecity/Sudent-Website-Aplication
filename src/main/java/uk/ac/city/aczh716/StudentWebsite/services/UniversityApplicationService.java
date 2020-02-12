package uk.ac.city.aczh716.StudentWebsite.services;

import uk.ac.city.aczh716.StudentWebsite.entities.UniversityApplication;

/**
 * A service interface containing methods used by the controllers
 * to record and retrieve application information.
 */
public interface UniversityApplicationService {

    void makeUniversityApplication(UniversityApplication universityApplication);
}
