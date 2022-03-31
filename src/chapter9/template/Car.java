package chapter9.template;

public abstract class Car {
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public abstract void drive();

    public abstract void stop();


    //하위 클래스에서 재정의할수 없게 final
    //시나리오 작성에 주로 쓰임
    // = 템플릿 메서드
    //프레임워크에서 많이 사용되는 설계 패턴
    public final void run() {
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }

    public abstract void wiper();

    public void washCar() {
    }

    // final 예약어는 템플릿 메서드 외에
    // 상수 정의할때도 쓰임
    // 외부 클래스에서 println(Car.PI) 같은 형태로 참조가능
    public static final double PI = 3.14;
}
