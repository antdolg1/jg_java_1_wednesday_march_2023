package students.jegors_rutkovskis.lesson_10.level_1.login_service;

class JavaStarLoginServiceImpl implements  JavaStarLoginService {
    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
