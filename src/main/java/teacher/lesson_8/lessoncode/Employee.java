package teacher.lesson_8.lessoncode;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private LocalDate hireDate;
    private LocalDateTime endDate;

    public Employee(String firstName, String lastName, double salary, int hireDay, int hireMonth, int hireYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.hireDate = LocalDate.of(hireYear, hireMonth, hireDay);
    }

    public Employee() {

    }

    public boolean isMinimalSalary(double salary) {
        return salary <= 700;
    }

    public void raiseSalary(double percent) {
        double raiseAmount = salary * percent / 100;
        salary = salary + raiseAmount;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " salary is " + salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
}
