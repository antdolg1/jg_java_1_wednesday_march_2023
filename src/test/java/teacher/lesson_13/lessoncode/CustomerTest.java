package teacher.lesson_13.lessoncode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {

    private Customer customer1;
    private Customer customer2;
    private Customer customer3;

    @Before
    public void initialize() {
        customer1 = new Customer("john.doe@inbox.lv", 20, Gender.MALE);
        customer2 = new Customer("sarah.sue@inbox.lv", 30, Gender.FEMALE);
        customer3 = new Customer("jim.button@inbox.lv", 45, Gender.MALE);
    }

    @Test
    public void getAllCustomersFromMap() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap();
        List<Customer> expectedCustomerList = new ArrayList<>();
        expectedCustomerList.add(customer1);
        expectedCustomerList.add(customer2);
        expectedCustomerList.add(customer3);

        Assert.assertEquals(expectedCustomerList, actualCustomerList);
    }

    @Test
    public void getAllCustomersFromMapNotNull() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap();
        Assert.assertNotNull(actualCustomerList);
    }

    @Test
    public void getAllMaleCustomersFromMap() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap(Gender.MALE);

        List<Customer> expectedCustomerList = new ArrayList<>();
        expectedCustomerList.add(customer1);
        expectedCustomerList.add(customer3);

        Assert.assertEquals(expectedCustomerList, actualCustomerList);
    }

    @Test
    public void getAllMaleCustomersFromMapNotNull() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap(Gender.MALE);
        Assert.assertNotNull(actualCustomerList);
    }

    @Test
    public void getAllFemaleCustomersFromMap() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap(Gender.FEMALE);

        List<Customer> expectedCustomerList = new ArrayList<>();
        expectedCustomerList.add(customer2);

        Assert.assertEquals(expectedCustomerList, actualCustomerList);
    }

    @Test
    public void getAllFemaleCustomersFromMapNotNull() {
        List<Customer> actualCustomerList = Customer.getAllCustomersFromMap(Gender.FEMALE);
        Assert.assertNotNull(actualCustomerList);
    }

    @Test
    public void getHowManyCustomers() {
        int actualCustomerAmount = Customer.getTotalCustomerAmount();
        int expectedCustomerAmount = 3;

        Assert.assertEquals(actualCustomerAmount, expectedCustomerAmount);
    }

    @Test
    public void getHowManyMaleCustomers() {
        int actualCustomerAmount = Customer.getTotalCustomerAmount(Gender.MALE);
        int expectedCustomerAmount = 2;

        Assert.assertEquals(actualCustomerAmount, expectedCustomerAmount);
    }

    @Test
    public void getHowManyFemaleCustomers() {
        int actualCustomerAmount = Customer.getTotalCustomerAmount(Gender.FEMALE);
        int expectedCustomerAmount = 1;

        Assert.assertEquals(actualCustomerAmount, expectedCustomerAmount);
    }

    @Test
    public void shouldReturnTotalCustomersAge() {
        int actualTotalCustomersAge = Customer.getAllCustomersAge();
        int expectedTotalCustomersAge = 95;

        Assert.assertEquals(actualTotalCustomersAge, expectedTotalCustomersAge);
    }

    @Test
    public void shouldReturnTotalMaleCustomersAge() {
        int actualTotalCustomersAge = Customer.getAllCustomersAge(Gender.MALE);
        int expectedTotalCustomersAge = 65;

        Assert.assertEquals(actualTotalCustomersAge, expectedTotalCustomersAge);
    }

    @Test
    public void shouldReturnTotalFemaleCustomersAge() {
        int actualTotalCustomersAge = Customer.getAllCustomersAge(Gender.FEMALE);
        int expectedTotalCustomersAge = 30;

        Assert.assertEquals(actualTotalCustomersAge, expectedTotalCustomersAge);
    }
}