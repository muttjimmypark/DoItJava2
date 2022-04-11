package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
/*        FileInputStream fis = null;

        try {
            fis = new FileInputStream("chapter14/exception/a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("finally");
        }

        System.out.println("end");*/

        //java7부터 try-with-resources라고
        // 리소스가 close() 명시 없어도 자동해제된다
        // FileInputStream등 주요 리소스는 auto closeable이 구현되어있다
        try (FileInputStream fis = new FileInputStream("a.txt")){

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
