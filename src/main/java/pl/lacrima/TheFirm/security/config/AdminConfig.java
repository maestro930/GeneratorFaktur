package pl.lacrima.TheFirm.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import pl.lacrima.TheFirm.security.command.CreateUserCommand;
import pl.lacrima.TheFirm.security.service.UserService;

import javax.annotation.PostConstruct;

@Configuration
public class AdminConfig {
    private final UserService userService;

    @Autowired
    public AdminConfig(UserService userService) {
        this.userService = userService;
    }

//    @PostConstruct
//    private void registerAdmin() {
//        CreateUserCommand admin = new CreateUserCommand();
//        admin.setLogin("admin");
//        admin.setPassword("password");
//        userService.registerNewUser(admin);
//    }
}
