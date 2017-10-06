package pl.lacrima.TheFirm.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import pl.lacrima.TheFirm.database.model.User;
import pl.lacrima.TheFirm.security.service.UserService;

import javax.annotation.PostConstruct;

@Configuration
public class AdminConfig {
    private final UserService userService;

    @Autowired
    public AdminConfig(UserService userService) {
        this.userService = userService;
    }

     //tworzenie admina - trzeba zakomentowac w klasie "user" validatory email, nip, phone - tylko raz - przy utworzeniu bazy potem zakomentowac ponownie
//    @PostConstruct
//    private void registerAdmin() {
//
//
//        User admin = new User();
//        admin.setLogin("admin");
//        admin.setPassword("admin");
//
//
//        userService.registerNewUser(admin);
//
//    }
}
