package chapter10.interfaceEx;

//인터페이스 - 추상 클래스 - 컴플릿 클래스 순으로 구현
public abstract class Calculator implements Calc{
    //extends 대신 implements
    //구체화, 타입상속 이라고 부른다
    //implements Calc, Runnable 등 여러개를 참조할수 있다
    // = 구현코드가 없는 인터페이스는 여러개를 상속받을 수 있다

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
