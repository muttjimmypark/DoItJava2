package chapter10.interfaceEx3;

public interface Buy {
    void buy();

    default void order(){
        System.out.println("구매 주문합니다.");
    }
}
