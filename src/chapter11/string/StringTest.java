package chapter11.string;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        // 주소값 동일여부를 확인
        System.out.println(str1 == str2);

        String str3 = "abc";
        String str4 = "abc";
        // 동일한 상수를 받으니까 동일한 상수영역 메모리 주소를 가리킨다
        System.out.println(str3 == str4);

        // 상수 아닌 생성자를 통해 선언하면
        // 구조 상 final 이라, 생성 이후에 값이 변할수 없다
        String str5 = new String("java");
        String str6 = new String("android");
        System.out.println(System.identityHashCode(str5));
        // 둘을 합치는 동작을 하면
        // 새로운 공간을 만들어서 "javaadnroid"를 넣고, 합친것처럼 보이게 한다
        // 따라서 반복해서 작업할 시, garbage 공간이 많이 발생하게 된다
        str5 = str5.concat(str6);
        System.out.println(str5);
        // 위에거랑 다른 주소값을 가리킨다
        System.out.println(System.identityHashCode(str5));
    }
}
