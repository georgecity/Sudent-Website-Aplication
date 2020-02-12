package uk.ac.city.aczh716.StudentWebsite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.city.aczh716.StudentWebsite.entities.LoginHistory;

/**
 * Class to access the database table backing the LoginHistory entity.
 */
@Repository
public interface HistoryRepository extends JpaRepository<LoginHistory, String> {

}