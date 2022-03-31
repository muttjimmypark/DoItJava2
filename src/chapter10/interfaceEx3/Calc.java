package chapter10.interfaceEx3;

public interface Calc {
    double PI = 3.14;
    int ERROR = -99999;

    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times(int num1, int num2);

    int devide(int num1, int num2);

    // 상수나 추상메서드만 작성할 수 있었으나
    // java8 부터 몇가지 구현 메서드를 작성할 수 있다

    // 자체가 뭔가 구현된것이다
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    //인스턴스 생성과 관련없이 이름만으로 호출하여 사용 가용하다
    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }

        myStaticMethod();
        return total;
    }

    // 당장 여기 인터페이스 내부에서만 활용하려 만든 메서드
    // 오버라이딩 할수없다
    private void myMethod(){
        System.out.println("private method 입니다.");
    }
    private static void myStaticMethod(){
        System.out.println("private static method 입니다.");
    }
}
