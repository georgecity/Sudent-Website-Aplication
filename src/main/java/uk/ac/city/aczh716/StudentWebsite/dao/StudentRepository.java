package uk.ac.city.aczh716.StudentWebsite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczh716.StudentWebsite.entities.StudentUser;

/**
 * Class to access the database table backing the StudentUser entity.
 */
@Repository
public interface StudentRepository extends JpaRepository<StudentUser, String> {

}