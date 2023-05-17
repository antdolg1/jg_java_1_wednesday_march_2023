package teacher.lesson_8.lessoncode;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Vasja", "Pupkin", 1000.0, 12, 10, 2022);
        Employee employee2 = new Employee("Jelena", "Petrova", 1500.0, 22, 8, 2021);
        Employee employee3 = new Employee();
        employee3.setFirstName("Julija");
        employee3.setLastName("Ozolina");
        employee3.setSalary(500.0);
//        employee3.setHireDate(LocalDate.of(2023, 5, 17));
        employee3.setHireDate(LocalDate.now());

        Employee[] employees = new Employee[3];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;

//        System.out.println(employee1);
        printEmployeesInfo(employees);
        System.out.println();

        System.out.println("employee1 hire date was: " + employee1.getHireDate());
        System.out.println("employee3 hire date was: " + employee3.getHireDate());

        System.out.println("employee3 hire day was: " + employee3.getHireDate().getDayOfMonth());
        System.out.println("employee3 hire month was: " + employee3.getHireDate().getMonth());
        System.out.println("employee3 hire year was: " + employee3.getHireDate().getYear());
        System.out.println("employee3 hire day of the year was: " + employee3.getHireDate().getDayOfYear());
        System.out.println("employee3 hire day of the week was: " + employee3.getHireDate().getDayOfWeek());
        System.out.println();
        System.out.println(employee2.getHireDate());
        employee2.setHireDate(employee2.getHireDate().minusDays(3));
        System.out.println(employee2.getHireDate());
        employee2.setHireDate(employee2.getHireDate().plusWeeks(2));
        System.out.println(employee2.getHireDate());
        System.out.println("____");
        System.out.println(employee1);
        employee1.raiseSalary(20.0);
        System.out.println(employee1);
        System.out.println("____");
        System.out.println(employee3);
        if (employee3.isMinimalSalary(employee3.getSalary())) {
            employee3.raiseSalary(50.0);
        }
        System.out.println(employee3);

        employee1.setEndDate(LocalDateTime.now());

        System.out.println("employee1 end date is: " + employee1.getEndDate());

    }

    private static void printEmployeesInfo(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
