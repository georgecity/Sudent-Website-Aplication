package uk.ac.city.aczh716.StudentWebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.city.aczh716.StudentWebsite.dao.StudentRepository;
import uk.ac.city.aczh716.StudentWebsite.entities.StudentUser;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    /**
     * The repository for student user data.
     */
    private StudentRepository studentRepository;

    /**
     * Constructor based dependency injection
     *
     * @param studentRepository the student user repo.
     */
    @Autowired
    public RegistrationServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    /**
     * Saves an student user to the database.
     *
     * @param studentUser the student user to be saved.
     */
    @Override
    public void registerUser(StudentUser studentUser) {
        studentRepository.save(studentUser);
    }
}

