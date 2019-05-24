package op.task8;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Pavlov", "Igor", "Petrovich", "Gagarina 8", 5689425663100057L, 56451983563845L);
        Customer customer2 = new Customer(2, "Ivanov", "Aleksandr", "Anantolyevich", "Pushkina 14/2", 1212657801016978L, 45737983243L);
        Customer customer3 = new Customer(3, "Petrov", "Aleksey", "Yurevich", "Kosmonavtov 146", 7415689730005741L, 1465477832541L);
        Customer customer4 = new Customer(4, "Malahov", "Georgiy", "Pavlovich", "Belye rosy 11", 8738909683347092L, 1513465478261L);
        Customer customer5 = new Customer(5, "Luka", "Piotr", "Vasilyevich", "Vechernyaya 24", 8090924777511846L, 13251346787325L);

        CustomerList customerList = new CustomerList();
        customerList.addCustomer(customer1);
        customerList.addCustomer(customer2);
        customerList.addCustomer(customer3);
        customerList.addCustomer(customer4);
        customerList.addCustomer(customer5);

        CustomerListLogic customerListLogic = new CustomerListLogic();
        customerListLogic.sortBySurname(customerList);
        System.out.println();
        customerListLogic.sortByCreditNumber(customerList, 5689425663100057L, 8090924777511846L);
    }
}
