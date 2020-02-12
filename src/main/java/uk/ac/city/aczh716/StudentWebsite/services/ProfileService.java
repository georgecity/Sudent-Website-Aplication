package uk.ac.city.aczh716.StudentWebsite.services;

import uk.ac.city.aczh716.StudentWebsite.entities.CollatedUser;

/**
 * Profile service interface that specifies a method to return a CollatedUser.
 */
public interface ProfileService {

    CollatedUser getProfile(String email);
}
