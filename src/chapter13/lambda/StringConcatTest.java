package chapter13.lambda;

public class StringConcatTest {
    public static void main(String[] args) {
        //기존 인터페이스를 구현하는 클래스를 만들어서 활용
        StringConcatImpl sImpl = new StringConcatImpl();
        sImpl.makeString("hello", "java");

        //인터페이스를 단일메서드로 클래스구현없이 람다식에서 바로선언하며 활용
        StringConcat concat = (s1, s2) -> System.out.println(s1 + " " + s2);
        concat.makeString("hello", "lambda");

        //익명내부클래스 활용방법
        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };
        concat2.makeString("hello", "inner");
    }
}
