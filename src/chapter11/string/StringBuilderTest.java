package chapter11.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str1 = new String("java");
        System.out.println(System.identityHashCode(str1));

        StringBuilder buffer = new StringBuilder(str1);
        System.out.println(System.identityHashCode(buffer));

        //StringBuilder는 아무리 첨가해도 같은 주소값 내에서 내용물이 바뀌는것뿐이다
        buffer.append(" and");
        buffer.append(" android");
        System.out.println(System.identityHashCode(buffer));
        //두어개 정도 간단히 연결하는건 그냥 String에서 해결해도 큰 낭비가 아니지만
        //문장을 줄지어 연결하는게 목적인 구현을 할때는 StringBuilder를 사용하자

        String str2 = buffer.toString();
        System.out.println(str2);

        // wrapper 클래스에서
        // 생성자를 통한 정의가 곧 없어질거임
        //Integer i = new Integer(100);
    }
}

