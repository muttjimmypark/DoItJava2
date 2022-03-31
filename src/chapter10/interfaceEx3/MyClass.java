package chapter10.interfaceEx3;

public class MyClass implements MyInterface{
    // 인터페이스 간 "형 상속" 이 이루어졌으므로 전부 구현해야한다

    @Override
    public void myMethod() {
        System.out.println("myMethod()");

    }

    @Override
    public void x() {
        System.out.println("x()");

    }

    @Override
    public void y() {
        System.out.println("y()");

    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.x();
        myClass.y();
        myClass.myMethod();

        // 사용할수 있는 메서드가 한정적
        X xClass = myClass;
        xClass.x();
    }
}
