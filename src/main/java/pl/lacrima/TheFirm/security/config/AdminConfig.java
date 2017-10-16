package pl.lacrima.TheFirm.security.config;

import org.springframework.context.annotation.Configuration;
import pl.lacrima.TheFirm.security.service.UserService;

@Configuration
public class AdminConfig {
    private final UserService userService;

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
