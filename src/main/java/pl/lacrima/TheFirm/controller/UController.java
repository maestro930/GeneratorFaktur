package pl.lacrima.TheFirm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.lacrima.TheFirm.database.model.User;
import pl.lacrima.TheFirm.security.service.UserService;

import java.util.List;

@RestController
public class UController {
    private final UserService userService;
    @Autowired
    public UController(UserService userService) {
        this.userService = userService;
    }



    @GetMapping(name = "users", path ="user/users" )
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping("ins")
    public void ins(@RequestBody User user) {
        userService.save(user);
    }
}

