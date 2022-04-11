package chapter15.stream.decorator;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) {
        long milliseconds = 0;
        int len = 0;

        //버퍼를 사용하여 166ms -->> 5ms 로 소요시간 단축됨
        try (FileInputStream fis = new FileInputStream("a.jpeg");
             FileOutputStream fos = new FileOutputStream("b.jpeg");
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            milliseconds = System.currentTimeMillis();

            int i;
            while ( (i = bis.read()) != -1) {
                bos.write(i);
                len++;
            }

            milliseconds = System.currentTimeMillis() - milliseconds;
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(len);
        System.out.println(milliseconds);
    }
}
