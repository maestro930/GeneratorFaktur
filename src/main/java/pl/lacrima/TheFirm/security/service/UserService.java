package pl.lacrima.TheFirm.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.lacrima.TheFirm.database.model.User;
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

    public User registerNewUser(User createUser) {
        if (loginExists(createUser.getLogin())) {
            throw new LoginExistsException(createUser.getLogin());
        }

        User user = new User();
        user.setLogin(createUser.getLogin());
        user.setPassword(passwordEncoder.encode(createUser.getPassword()));

        user.setStreet(createUser.getStreet());
        user.setPostalCode(createUser.getPostalCode());

        user.setPhone(createUser.getPhone());
        user.setNip(createUser.getNip());
        user.setEmail(createUser.getEmail());

        user.setContractorName(createUser.getContractorName());
        user.setCity(createUser.getCity());



        return userRepository.save(user);

    }

    public boolean loginExists(String login) {
        return userRepository.findByLogin(login) != null;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
