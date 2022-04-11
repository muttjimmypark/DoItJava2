package chapter15.stream.serialization;

import java.io.*;

//표시(마커)인터페이스 - 직렬화 가능한 객체
class Person implements Serializable {
//객체를 어떻게 RW 할건지 오버라이딩하여 직접 정의하는 인터페이스 - Externalizable
//class Person implements Externalizable {
    String name;
    String title;
    // 직렬화할때 저장하지않을 변수를 지정할수 잇슴
    transient String title2;

    public Person() {
    }

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String toString() {
        return name + ", " + title;
    }
}

public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person personLee = new Person("Lee", "Manager");

        try (FileOutputStream fos = new FileOutputStream("serial.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personLee);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fis = new FileInputStream("serial.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object obj = ois.readObject();
            if (obj instanceof Person) {
                Person p = (Person) obj;
                System.out.println(p);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
