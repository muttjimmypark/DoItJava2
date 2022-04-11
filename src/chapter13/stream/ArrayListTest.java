package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("James");
        sList.add("Edward");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));
        //스트림에서 for문을 태우는 방법 : forEach

        //스트림 만들고 정렬시키고 포이치까지
        sList.stream().sorted().forEach(s -> System.out.println(s));
    }
}
