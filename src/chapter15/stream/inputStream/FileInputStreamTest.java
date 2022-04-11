package chapter15.stream.inputStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {

        //바이트단위로 읽어와서 한글 깨지는데 FileReader로 읽어오면됨
        //FileInputStream fis = null;
        FileReader fis = null;
        int i = 0;
        try {
            //fis = new FileInputStream("input.txt");
            fis = new FileReader("input.txt");

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (NullPointerException e) {
                System.out.println(e);
            }
        }
        System.out.println("end");
    }
}
