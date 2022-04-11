package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className)
            throws FileNotFoundException, ClassNotFoundException {
        //파일 낫파운드 핸들링
        FileInputStream fis = new FileInputStream(fileName);
        //클래스 낫파운드 핸들링
        Class c = Class.forName(className);
        return c;
    }
    //위에서 던져버리면 실활용하는 부분에서 처리를 해줘야함

    public static void main(String[] args) {
        ThrowsException ex = new ThrowsException();
        try {
            ex.loadClass("b.txt", "java.lang.string");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("end");
    }
}
