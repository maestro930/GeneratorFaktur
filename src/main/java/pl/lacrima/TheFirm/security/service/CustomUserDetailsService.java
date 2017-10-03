package pl.lacrima.TheFirm.security.service;

import org.springframework.security.core.authority.AuthorityUtils;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.lacrima.TheFirm.security.repository.UserRepository;


import javax.transaction.Transactional;

@Service("userDetailsService")
@Transactional
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        pl.lacrima.TheFirm.database.model.User user = userRepository.findByLogin(login);
        if (user == null){
            throw new UsernameNotFoundException("No account found with login: " + login);
        }

        return new User(user.getLogin(), user.getPassword(),
                true, true, true, true,
                AuthorityUtils.createAuthorityList("USER"));
    }
}
