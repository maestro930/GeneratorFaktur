package pl.lacrima.TheFirm.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lacrima.TheFirm.database.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
}
