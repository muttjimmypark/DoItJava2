package chapter9.template;

public class ManualCar extends Car {
    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
        System.out.println("사람이 핸들을 조작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("사람이 브레이크를 밟습니다.");
    }

    // 상위의 final 메서드는 재정의 할수없드
    /*
    public void run(){

    }*/

    @Override
    public void wiper() {
        System.out.println("직접 와이퍼를 켭니다.");
    }
}
