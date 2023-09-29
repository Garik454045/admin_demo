package webdemo.servlets.database;

import webdemo.servlets.model.UsernamePassword;

public class DataSource {

    private static DataSource dataSource;

    private UsernamePassword userNamePassword = null;

    private DataSource() {
    }

    public void setUsernamePassword(UsernamePassword userNamePassword) {
        this.userNamePassword = userNamePassword;
    }

    public static DataSource instance() {
        if (dataSource == null)
            dataSource = new DataSource();

        return dataSource;
    }

    public UsernamePassword getUserNamePassword() {
        return userNamePassword;
    }

    public void setUserNamePassword(UsernamePassword userNamePassword) {
        this.userNamePassword = userNamePassword;
    }
}
