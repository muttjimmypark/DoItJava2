package chapter7.array;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArr = {"Java", "Android", "C"};
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        System.out.println();

        for (String s : strArr){
            System.out.println(s);
        }
    }
}
