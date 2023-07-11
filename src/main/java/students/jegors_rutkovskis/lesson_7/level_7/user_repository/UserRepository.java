package students.jegors_rutkovskis.lesson_7.level_7.user_repository;

class UserRepository {
    private UserEntity[] users = new UserEntity[1000];
    private int index = 0;
    public void addUser(UserEntity user) {
        users[index] = user;
        index++;
    }
    public UserEntity getUserById(int id) {
        for (UserEntity user : users) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null;
    }
    public UserEntity getUserByName(String name) {
        for (UserEntity user : users) {
            if (name.equalsIgnoreCase(user.getName())) {
                return user;
            }
        }
        return null;
    }
    public UserEntity[] getUsers() {
        return users;
    }

}
