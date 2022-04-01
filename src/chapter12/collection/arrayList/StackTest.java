package chapter12.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

class MyStack {
    private List<String> arrayStack = new ArrayList<>();

    public void push(String data) {
        arrayStack.add(data);
    }

    public String pop() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }

        return arrayStack.remove(len - 1);
    }

    public String peek() {
        int len = arrayStack.size();
        if (len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }

        return arrayStack.get(len - 1);
    }
}

public class StackTest {
    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
