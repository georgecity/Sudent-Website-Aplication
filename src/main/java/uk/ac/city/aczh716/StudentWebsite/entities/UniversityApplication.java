package uk.ac.city.aczh716.StudentWebsite.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * An Entity class representing the information required for a given user to apply
 * to any university or course.
 */
@Entity
public class UniversityApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long key;
    private String email;
    private String courseName;
    private String universityName;
    private String statement;

    public UniversityApplication(){}

    public Long getKey() {return key;}

    public void setKey(Long key) { this.key = key; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getUniversityName() { return universityName; }

    public void setUniversityName(String universityName) { this.universityName = universityName; }

    public String getStatement() { return statement; }

    public void setStatement(String statement) { this.statement = statement; }
}