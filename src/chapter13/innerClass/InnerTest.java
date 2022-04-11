package chapter13.innerClass;

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    //멤버변수와 동일한 위치에 선언된 내부 클래스임
    class InClass {
        int inNum = 200;
        //static int sInNum = 100;
        //static void sTest() {}
        //스태틱 변수나 메서드는 인스턴스 생성과 별개로 사용될수 있어야 하는데
        // 당 클래스 자체가 생성에 종속적이기에 선언될 수 없다

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }

    }

    public void usingInTest() {
        inClass.inTest();
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            //new되지 않아도 활용할수있는 정적 메서드가 생겼다

            //new되지 않으면 발생하지 않는 변수이므로 아래 계산은 작성할수 없다
            //num += 10;

            sNum += 10;
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest() {
            System.out.println(sNum);
            //System.out.println(iNum);
            System.out.println(sInNum);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        //아래처럼 선언할수는 있으나
        // 보통 private으로 막아서 쓰는게 일반적이긴함
        outClass.inClass.inTest();

        //이렇게 쓸수도 있지만 잘 쓰이진 않는듯
        OutClass.InClass inClass = outClass.new InClass();
        inClass.inTest();

        //InClass가 private로 보통 막혀있을텐데 굳이 또 쓰겠다면
        // 게터푸터처럼 usingInTest를 만들어 불러낼수는 있겠음
        outClass.usingInTest();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

        // 위에 아무것도 없어도 아래것은 호출될 수 있다
        OutClass.InStaticClass.sTest();
    }
}
