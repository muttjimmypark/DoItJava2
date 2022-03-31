package chapter10.interfaceEx;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        // 구현된걸 가져다 실 사용하는 이 부분을
        // 웹 개발이라 가정했을때 클라이언트 코드 (프론트엔드) 라고 볼수 있다
        Calc calc = new CompleteCalc();

        // 인터페이스, 추상클래스 안됨
        // Calc calc1 = new Calc();
        // Calc calc2 = new Calculator();

        System.out.println(calc.add(num1, num2));

        // 타입이 Calc니까 안됨
        // calc.showInfo();
    }
}
