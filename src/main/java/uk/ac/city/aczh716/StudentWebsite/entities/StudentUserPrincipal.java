package uk.ac.city.aczh716.StudentWebsite.entities;

import java.nio.file.attribute.UserPrincipal;

/**
 * An StudentUserPricipal represents the current user in the user details service.
 */
public class StudentUserPrincipal implements UserPrincipal {

    private StudentUser studentUser;

    public StudentUserPrincipal(StudentUser studentUser){
        this.studentUser = studentUser;
    }

    @Override
    public String getName() {
        return studentUser.getEmail();
    }


}
