package chapter12.collection.treeSet;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //TreeSet은 내부적으로 BST로 구현되어있음
        //String은 Comparable과 그 안에 compareTo 메서드가 구현되어 있어서 오버라이딩 필요x
        TreeSet<String> tree = new TreeSet<>();

        tree.add("aaa");
        tree.add("ccc");
        tree.add("bbb");

        System.out.println(tree);
    }
}
