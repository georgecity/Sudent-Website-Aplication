package uk.ac.city.aczh716.StudentWebsite.services;

import uk.ac.city.aczh716.StudentWebsite.entities.StudentUser;

/**
 * Registration service interface that specifies a method to save user information to the database.
 */
public interface RegistrationService {

    void registerUser(StudentUser studentUser);
}
