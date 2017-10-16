package pl.lacrima.TheFirm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lacrima.TheFirm.database.model.User;
import pl.lacrima.TheFirm.repository.UserFirmRepository;

@Service
public class UserFirmService {

    public final UserFirmRepository userFirmRepository;

    @Autowired
    public UserFirmService(UserFirmRepository userRepository) {
        this.userFirmRepository = userRepository;
    }

    public User getUser(){
        return userFirmRepository.findOne(1L);
    }
}
