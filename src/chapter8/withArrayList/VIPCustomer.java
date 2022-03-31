package chapter8.withArrayList;

public class VIPCustomer extends Customer {
    private int agentID;
    private double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }


    public VIPCustomer(int customerID, String customerName, int agentID) {
        // 부모클래스의 생성자가 꼭 인수를 받을경우
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    // 메서드 오버라이딩
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * saleRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
    }
    // 한 함수 안에서 모든 기능을 구현했을때, 회원등급별 개별 구현해야하는 것들을 if문을 많이 돌렸어야 했을 것이다.
    // is-a 관계 (포유류 - 사람) / has-a 관계 (과목 - 학생)
}
