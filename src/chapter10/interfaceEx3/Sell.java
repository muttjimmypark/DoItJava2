package chapter10.interfaceEx3;

public interface Sell {
    void sell();

    default void order(){
        System.out.println("판매 주문합니다.");
    }
}
