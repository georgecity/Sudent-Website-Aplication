package uk.ac.city.aczh716.StudentWebsite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczh716.StudentWebsite.entities.UniversityApplication;

/**
 * Class to access the database table backing the UniversityApplication entity.
 */
@Repository
public interface UniversityApplicationRepository extends JpaRepository<UniversityApplication, String> {
}
