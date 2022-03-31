package chapter10.interfaceEx3;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("구매합니다.");
    }

    @Override
    public void sell() {
        System.out.println("판매합니다.");
    }

    // 동일한 이름의 디폴트 메서드가 주어진 경우 오버라이딩 할수 있다

    @Override
    public void order() {
        System.out.println("고객 판매 주문합니다.");
    }
}
