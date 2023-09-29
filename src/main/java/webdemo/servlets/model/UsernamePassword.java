package webdemo.servlets.model;

import java.util.Objects;

public class UsernamePassword {

    private final String username;
    private final String password;


    public UsernamePassword(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsernamePassword that)) return false;

        if (!Objects.equals(username, that.username)) return false;
        return Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UsernamePassword{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
