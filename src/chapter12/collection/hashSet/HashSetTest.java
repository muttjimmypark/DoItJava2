package chapter12.collection.hashSet;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        boolean b1 = set.add("aaa");
        System.out.println(b1);
        set.add("bbb");
        set.add("ccc");
        System.out.println(set);

        // 중복원소가 없음 - 입력하려는 단계에서 false를 반환
        boolean b2 = set.add("aaa");
        System.out.println(b2);
        System.out.println(set);
    }
}
