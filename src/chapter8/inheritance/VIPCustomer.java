package chapter8.inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    private double saleRatio;

    public VIPCustomer() {
        // 컴파일러가 생성자에 super();를 집어넣는다
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

        System.out.println("VIPCustomer() 호출");
    }


    public VIPCustomer(int customerID, String customerName, int agentID) {
        // 부모클래스의 생성자가 꼭 인수를 받을경우
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;

        System.out.println("VIPCustomer(int, String) 호출");
    }

    // 메서드 오버라이딩
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }
}
