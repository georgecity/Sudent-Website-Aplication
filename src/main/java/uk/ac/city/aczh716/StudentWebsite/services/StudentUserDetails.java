package uk.ac.city.aczh716.StudentWebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import uk.ac.city.aczh716.StudentWebsite.dao.HistoryRepository;
import uk.ac.city.aczh716.StudentWebsite.dao.StudentRepository;
import uk.ac.city.aczh716.StudentWebsite.entities.LoginHistory;
import uk.ac.city.aczh716.StudentWebsite.entities.StudentUser;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Custom authentication service which includes recording login history
 * each time a user is authenticated.
 */
@Service
public class StudentUserDetails implements UserDetailsService {


    /**
     * The repository for student user data.
     */
    private StudentRepository studentRepository;
    /**
     * The repository for login history
     */
    private HistoryRepository historyRepository;

    /**
     * Constructor based dependency injection of repositories.
     *
     * @param studentRepository the student user repo
     * @param historyRepository the login history repo
     */
    @Autowired
    public StudentUserDetails(StudentRepository studentRepository, HistoryRepository historyRepository){
        this.studentRepository = studentRepository;
        this.historyRepository = historyRepository;
    }

    /**
     * The override fo the UserDetailsService method that validates a user. The methods finds the
     * user in the database based on the String s provided by the users login credentials (their email
     * address)
     *
     * @param s user's email address provided when logging in.
     * @return UserDetails an object representing the user including their password, account status and roles
     * @throws UsernameNotFoundException if the user cannot be found in the database
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        StudentUser studentUser = studentRepository.findById(s).orElseThrow(()-> new UsernameNotFoundException("No matching user."));
        //if the first line does not throw the exception the login history
        //object will be constructed and saved to the database.
        LoginHistory loginHistory = new LoginHistory();
        loginHistory.setEmail(studentUser.getEmail());
        loginHistory.setTime(LocalDateTime.now());
        historyRepository.save(loginHistory);
        //and a UserDetails object will be constructed and returned.
        ArrayList<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(studentUser.getAuthoritiy()));
        return new User
                (studentUser.getEmail(), studentUser.getPassword(), studentUser.getEnabled(),
                        true, true, true, authorities);

    }
}