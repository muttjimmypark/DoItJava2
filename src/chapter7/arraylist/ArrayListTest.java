package chapter7.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>();
        test.add("aaa");
        test.add("bbb");
        test.add("ccc");

        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
        for (String s : test) {
            System.out.println(s);
        }
    }
}
