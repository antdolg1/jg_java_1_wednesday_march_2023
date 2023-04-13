package students.igors_gergeleziu.lesson_3.level_7.task_29;

class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Apple", "Iphone 11",
                "Black", 6.1, 828, 1792, 128);
        phone1.phoneInformation();
        phone1.call("Mom");
        phone1.message("Hi mum, busy working. Call you back later.");
        Phone phone2 = new Phone("Samsung", "Galaxy A33",
                "White", 6.4, 1080, 2040, 128);
        phone2.phoneInformation();
    }
}
