package chapter10.interfaceEx;

// 인터페이스는 모든 메서드가 추상메서드로 이루어진 클래스
public interface Calc {
    // 모두 public static final로 상수임
    double PI = 3.14;
    int ERROR = -99999;

    // 모두 public abstract가 된다고 보면 됨
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int devide(int num1, int num2);
}
