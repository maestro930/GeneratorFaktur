package pl.lacrima.TheFirm.security.model;

public class UsernameExistsException extends RuntimeException {
    public UsernameExistsException(String username) {
        super("There is an account with that username: " + username);
    }
}
