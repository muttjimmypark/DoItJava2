package chapter13.lambda;

@FunctionalInterface
public interface MyNumber {
    int getMaxNumber(int num1, int num2);

    //람다식을 위한 함수형 인터페이스
    // 익명함수와 매개변수만으로 구현된다
    // 어느 메서드를 구현하는지 불분명하기 때문에 하나의 메서드만 선언해야하며
    // @FunctionalInterface 애노테이션 기재 필요
    //int testNumber(int x, int y);
}
