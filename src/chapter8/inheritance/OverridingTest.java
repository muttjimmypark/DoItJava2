package chapter8.inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer(100010, "LEE");
        customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo());


        VIPCustomer customerKim = new VIPCustomer(100011, "KIM", 200011);
        customerKim.calcPrice(10000);
        System.out.println(customerKim.showCustomerInfo());

        // 묵시적 형변환으로 인한 가상함수 적용으로 재정의된 메서드가 불러와진다
        // 폴리모피즘 - 다형성
        Customer customerPark = new VIPCustomer(100012, "Park", 200012);
        int price = customerPark.calcPrice(10000);
        System.out.println("지불금액 - " + price);
        System.out.println(customerPark.showCustomerInfo());
    }
}
