package chapter9.abstractEx;

public class Desktop extends Computer{
    //상속받고도 구현안하려면 여기도 abstract class로 정의할 수 있다.

    @Override
    public void display() {
        System.out.println("Desktop display()");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing()");
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop turnOn()");
    }
}
