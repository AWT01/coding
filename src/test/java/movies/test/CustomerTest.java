package movies.test;

import org.fundation.coding.adrian.Customer;
import org.junit.Test;


public class CustomerTest {

    @Test (expected = RuntimeException.class)
    public void addRental() {
        Customer test = new Customer("test");
        test.addRental(null);
    }

    @Test (expected = RuntimeException.class)
    public void statement() {
        Customer test = new Customer("test");
        test.statement();
    }

    @Test (expected = RuntimeException.class)
    public void stateDebt() {
        Customer test = new Customer("test");
        test.stateDebt();
    }
}