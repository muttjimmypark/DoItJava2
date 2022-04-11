package chapter13.innerClass;

class Outer {
    int outNum = 100;
    static int sNum = 200;

    //쓰레드를 생성하는 인터페이스 Runnable
    // 이것이 지역 내부 클래스
    Runnable getRunnable(int i) {
        int localNum = 100;

        //변수 형태에 대입해서 익명 클래스를 개설할수있다
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
            }
        };

        class MyRunnable implements Runnable {
            @Override
            public void run() {
                //내부클래스의 지역변수(+인풋포함)는
                // 활용할수는 있어도 변화시킬수는 없다
                // 컴파일러가 final을 앞에 붙여준다
                //localNum += 100;
                //i += 200;
                outNum += 10;

                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
                System.out.println(i);
            }
        }

        //위에 구현생성해서 아래처럼 배출해낸다
        return new MyRunnable();
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(20);
        runnable.run();
    }
}
