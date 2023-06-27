package students.andrej_mihailicenko.lesson_12.level_2;

class BankClient {

    private String uid;      // уникальный идентификатор клиента
    private String fullName; // полное имя клиента

    public BankClient(String uid, String fullName) {
        this.fullName = fullName;
        this.uid = uid;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUid() {
        return uid;
    }
}
