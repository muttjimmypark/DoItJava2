package chapter14.exception;

public class ArrayExceptionTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            return;
        } finally {
            //try가 수행되면 반드시 마지막에 수행될 부분
            // catch에 return이 있더라도
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
