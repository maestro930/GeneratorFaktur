package pl.lacrima.TheFirm.security.command;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class CreateUserCommand {
    @NotBlank
    @Length(min = 6, max = 20)
    private String login;

    @NotBlank
    @Length(min = 6, max = 20)
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String username) {
        this.login = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}