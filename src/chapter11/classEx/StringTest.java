package chapter11.classEx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class strClass = Class.forName("java.lang.String");

        // String의 생성자 정보 가져오기
        Constructor[] cons = strClass.getConstructors();
        for (Constructor c : cons) {
            System.out.println(c);
        }

        // String의 필드 정보 가져오기
        Field[] fields = strClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        // String의 메서드 정보 가져오기
        Method[] methods = strClass.getMethods();
        for (Method m : methods){
            System.out.println(m);
        }
    }
}
