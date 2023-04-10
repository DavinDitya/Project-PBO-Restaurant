package Project;

public class Login1 {
    private String username_user, password_user, username_admin, password_admin;
    public void login1() {
        username_user = "usernameaku";
        password_user = "passwordaku";
        username_admin = "adminaku";
        password_admin = "passwordadmin";
    }

    public String getUsername_user() {
        setUsername_user(username_user);
        return username_user;
    }

    public void setUsername_user(String username_user) {
        this.username_user = username_user;
    }

    public String getPassword_user() {
        setPassword_user(password_user);
        return password_user;
    }

    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }

    public String getUsername_admin() {
        setUsername_admin(username_admin);
        return username_admin;
    }

    public void setUsername_admin(String username_admin) {
        this.username_admin = username_admin;
    }

    public String getPassword_admin() {
        setPassword_admin(password_admin);
        return password_admin;
    }

    public void setPassword_admin(String password_admin) {
        this.password_admin = password_admin;
    }
}