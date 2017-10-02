package pl.lacrima.TheFirm.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.lacrima.TheFirm.database.model.User;
import pl.lacrima.TheFirm.security.command.CreateUserCommand;
import pl.lacrima.TheFirm.security.model.LoginExistsException;
import pl.lacrima.TheFirm.security.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User registerNewUser(CreateUserCommand command) {
        if (loginExists(command.getUsername())) {
            throw new LoginExistsException(command.getUsername());
        }

        User user = new User();
        user.setLogin(command.getUsername());
        user.setPassword(passwordEncoder.encode(command.getPassword()));

        return userRepository.save(user);

    }

    private boolean loginExists(String login) {
        return userRepository.findByLogin(login) != null;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
