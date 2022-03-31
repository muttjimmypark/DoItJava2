package chapter9.abstractEx;

public abstract class Computer {

    //메서드를 선언만 함 (=바디가 없다)
    //abstract 메서드를 가진 클래스는 abstract 클래스다
    //상속받는 클래스에서 오버라이딩 구현하도록 남겨놓는것임
    // 하위클래스에 위임시켰다 <-> (상속받은) 구현에 책임이 있다
    public abstract void display();

    public abstract void typing();

    //public abstract int add(int x, int y);

    //추상클래스는 추상 아닌 일반 메서드도 보유할 수 있음
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
