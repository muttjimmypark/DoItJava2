package chapter10.interfaceEx3;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        customer.buy();
        customer.sell();

        // 선언 시 인스턴스의 메서드가 불리므로
        // 셋 다 같은 결과 - customer에서 오버라이딩한
        buyer.order();
        seller.order();
        customer.order();
    }
}
