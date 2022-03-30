package chapter8.inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(10100);
        customerLee.setCustomerName("Lee");

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerID(10101);
        customerKim.setCustomerName("Kim");

        VIPCustomer customerPark = new VIPCustomer(10102, "Park", 200);

        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerPark.showCustomerInfo());
    }
}
