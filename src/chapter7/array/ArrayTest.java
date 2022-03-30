package chapter7.array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        double[] studentIDs = new double[5];
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println(studentIDs[i]);
        }
    }
}
