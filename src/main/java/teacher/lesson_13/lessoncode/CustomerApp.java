package teacher.lesson_13.lessoncode;

public class CustomerApp {

    public static void main(String[] args) {

        new Customer("john.doe@gmail.com", 20, Gender.MALE);
        new Customer("sarah.sue@gmail.com", 30, Gender.FEMALE);
        new Customer("jim.miller@gmail.com", 45, Gender.MALE);

        System.out.println("All customers:");
        Customer.getAllCustomersFromMap().forEach(System.out::println);
        System.out.println();
        System.out.println("All MALE customers:");
        Customer.getAllCustomersFromMap(Gender.MALE).forEach(System.out::println);
        System.out.println();
        System.out.println("All FEMALE customers:");
        Customer.getAllCustomersFromMap(Gender.FEMALE).forEach(System.out::println);
        System.out.println();
        System.out.println("Total customer amount: " + Customer.getTotalCustomerAmount());
        System.out.println("Total MALE customer amount: " + Customer.getTotalCustomerAmount(Gender.MALE));
        System.out.println("Total FEMALE customer amount: " + Customer.getTotalCustomerAmount(Gender.FEMALE));
        System.out.println();
        System.out.println("Total age: " + Customer.getAllCustomersAge());
        System.out.println("Total MALE age: " + Customer.getAllCustomersAge(Gender.MALE));
        System.out.println("Total FEMALE age: " + Customer.getAllCustomersAge(Gender.FEMALE));

    }

}
