package teacher.lesson_13.lessoncode;

import java.util.*;

public class Customer {

    private static Map<Integer, Customer> customerMap = new HashMap<>();
    private static int idCounter = 0;

    private int id;
    private String email;
    private int age;
    private Gender gender;

    public Customer(String email, int age, Gender gender) {
        this.email = email;
        this.age = age;
        this.gender = gender;

        if (!customerIsAlreadyPresent()) {
            idCounter++;
            this.id = idCounter;
            customerMap.put(id, this);
        }
    }

    private boolean customerIsAlreadyPresent() {
        for (Customer customer : customerMap.values()) {
            if (customer.equals(this) && customer.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }

    public static List<Customer> getAllCustomersFromMap() {
        return new ArrayList<>(customerMap.values());
    }

    public static List<Customer> getAllCustomersFromMap(Gender gender) {
        List<Customer> customerList = new ArrayList<>();
        for (Customer customer : customerMap.values()) {
            if (customer.gender == gender) {
                customerList.add(customer);
            }
        }
        return customerList;
    }

    public static int getTotalCustomerAmount() {
        return customerMap.size();
    }

    public static int getTotalCustomerAmount(Gender gender) {
        return getAllCustomersFromMap(gender).size();
    }

    public static int getAllCustomersAge() {
        int totalCustomersAge = 0;
        for (Customer customer : customerMap.values()) {
            totalCustomersAge += customer.age; //totalCustomersAge = totalCustomerAge + customer.age;
        }
        return totalCustomersAge;
    }

    public static int getAllCustomersAge(Gender gender) {
        int totalCustomersAge = 0;
        for (Customer customer : getAllCustomersFromMap(gender)) {
            totalCustomersAge += customer.age;
        }
        return totalCustomersAge;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(email, customer.email) && gender == customer.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, age, gender);
    }
}
