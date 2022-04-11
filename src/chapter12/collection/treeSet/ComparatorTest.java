package chapter12.collection.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2) * (-1);
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        // 그냥 아래대로 일반적인 생성을 하면 원래 treeset이 가진 comparable이 적용되고
        // TreeSet<String> tree = new TreeSet<>();

        // MyCompare를 활용하면 위 클래스에서 구현한 내림차순이 적용됨을 알수있다
        TreeSet<String> tree = new TreeSet<>(new MyCompare());
        tree.add("aaa");
        tree.add("ccc");
        tree.add("bbb");

        System.out.println(tree);
    }
}
