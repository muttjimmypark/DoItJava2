package chapter15.stream.inputStream;

import java.io.IOException;

public class SystemInTest {
    public static void main(String[] args) {
        /*
        System.out.print("알파벳 하나를 쓰고 엔터를 누르세요 : ");
        int i = 0;
        try {
            i = System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println((char) i);
        System.out.println("***");*/

        System.out.print("알파벳 여러개를 쓰고 엔터를 누르세요 : ");
        int i = 0;
        try {
            while ((i = System.in.read()) != '\n') {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
