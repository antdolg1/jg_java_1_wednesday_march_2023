package students.jegors_rutkovskis.lesson_7.level_7.user_repository;

class UserRepositoryDemo {
    public static void main(String[] args) {
        UserRepository repository = new UserRepository();
        UserEntity user1 = new UserEntity("Sanja", "Ivanov", "231199-11234");
        UserEntity user2 = new UserEntity("Pasha", "Pupkin", "110188-10204");
        UserEntity user3 = new UserEntity("Alex", "Zavalnij", "040591-01521");
        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(user3);

        UserEntity[] users = repository.getUsers();
        for (UserEntity user : users) {
            if (user != null) {
                System.out.println(user);
            }
        }
        System.out.println();

        System.out.print("Get user by id 2 ----> ");
        System.out.println(repository.getUserById(2));

        System.out.print("Get user by name Alex ----> ");
        System.out.println(repository.getUserByName("alex"));
    }
}
