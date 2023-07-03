package students.vladislav_antoniv.lesson_10.level_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {
    private String login;
    private String password;

    void setLogin(String login) {
        this.login = login;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getLogin() {
        return login;
    }

    String getPassword() {
        return password;
    }

    public boolean canLogin(String login, String password) {
        return (login != null) && login.equals("javastar") && (password != null) && password.equals("pass");
    }

}