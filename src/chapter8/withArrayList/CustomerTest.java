package chapter8.withArrayList;

import java.util.ArrayList;
import java.util.List;

public class CustomerTest {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10011, "신사임당");
        GoldCustomer customerHong = new GoldCustomer(10012, "홍길동");
        GoldCustomer customerYul = new GoldCustomer(10013, "이율곡");
        VIPCustomer customerKim = new VIPCustomer(10014, "김유신", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("****** 고객정보출력 ******");
        for (Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }


        System.out.println();
        System.out.println("****** 할인율, 보너스포인트 ******");
        int price = 10000;
        for (Customer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불하셨습니다.");
            System.out.println(customer.showCustomerInfo());
        }
    }
}
