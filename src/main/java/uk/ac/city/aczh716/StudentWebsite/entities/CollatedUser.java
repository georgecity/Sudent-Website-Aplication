package uk.ac.city.aczh716.StudentWebsite.entities;

import java.util.List;
/**
 * An Entity class representing all of the information relevant to a specific studen user including
 * their university applications and login history.
 *
 * */
public class CollatedUser{

    private StudentUser studentUser;
    private List<UniversityApplication> universityApplications;
    private List<LoginHistory> logins;

    public StudentUser getStudentUser() {
        return studentUser;
    }

    public void setStudentUser(StudentUser studentUser) {
        this.studentUser = studentUser;
    }

    public List<UniversityApplication> getUniversityApplications() {
        return universityApplications;
    }

    public void setUniversityApplications(List<UniversityApplication> universityApplications) {
        this.universityApplications = universityApplications;
    }

    public List<LoginHistory> getLogins() {
        return logins;
    }

    public void setLogins(List<LoginHistory> logins) {
        this.logins = logins;
    }
}
