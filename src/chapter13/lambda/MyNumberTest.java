package chapter13.lambda;

public class MyNumberTest {
    public static void main(String[] args) {
        MyNumber maxNum = (x, y) -> (x >= y) ? x : y;
        int max = maxNum.getMaxNumber(10, 20);
        System.out.println(max);

        //원래는 위처럼 구현부만 띡 있는게 아니라
        // 아래처럼 객체로 익명 내부클래스가 선언되었어야함
        /*
        MyNumber aaa = new MyNumber() {
            @Override
            public int getMaxNumber(int num1, int num2) {
                return 0;
            }
        };
        */
    }
}
