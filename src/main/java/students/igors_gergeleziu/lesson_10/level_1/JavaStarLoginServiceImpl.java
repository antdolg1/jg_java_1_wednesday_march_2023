package students.igors_gergeleziu.lesson_10.level_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService {
    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
