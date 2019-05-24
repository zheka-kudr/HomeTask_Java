package op.task8;

import java.util.Comparator;
import java.util.List;

class CustomerListLogic {
    void sortBySurname(CustomerList customerList) {
        List<Customer> customers;
        customers = customerList.getCustomers();
        if (!customers.isEmpty()) {
            customers.sort(Comparator.comparing(Customer::getSurname));
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
    }

    void sortByCreditNumber(CustomerList customerList, long min, long max) {
        List<Customer> customers;
        customers = customerList.getCustomers();
        if (!customers.isEmpty()) {
            customers.sort(Comparator.comparing(Customer::getCreditCardNumber));
            for (Customer customer : customers) {
                if (customer.getCreditCardNumber() >= min && customer.getCreditCardNumber() <= max)
                    System.out.println(customer);
            }
        }
    }
}
