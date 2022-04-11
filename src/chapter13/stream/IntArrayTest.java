package chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        IntStream stream = Arrays.stream(arr);
        int sum = stream.sum();
        System.out.println(sum);

        //위의 stream을 다시활용할수 없고 (=스트림은 재사용 불가)
        // 스트림 다시 만들어서
        int count = (int) Arrays.stream(arr).count();
        System.out.println(count);
    }
}
