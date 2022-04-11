package chapter13.lambda;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        //함수를 변수처럼 사용
        PrintString lambdaPrint = str -> System.out.println(str);
        lambdaPrint.showString("test");

        showMyString(lambdaPrint);

        PrintString reStr = returnPrint();
        reStr.showString("hello");
    }

    // 변수처럼 선언된 함수가 다른 함수에 변수처럼 넘어들어가는 예시
    private static void showMyString(PrintString lambda) {
        lambda.showString("test2");
    }

    // 반환되는 변수처럼 람다가 넘어오는 예시
    public static PrintString returnPrint() {
        return s -> System.out.println(s + " world");
    }
}
