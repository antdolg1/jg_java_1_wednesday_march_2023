package students.jegors_rutkovskis.lesson_12.level_2;

class BankClient {
    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return uid;
    }


    @Override
    public String toString() {
        return "BankClient{" +
                "uid='" + uid + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
