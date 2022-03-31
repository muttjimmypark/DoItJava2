package chapter11.object;

class Student {
    int studentID;
    String studentName;

    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        //다운캐스팅부터
        if (obj instanceof Student) {
            Student std = (Student) obj;

            return studentID == std.studentID;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentID;
    }
}

public class EqualsEx {
    public static void main(String[] args) {
        String str1 = new String("test");
        String str2 = new String("test");

        // 원래 equals는 같은 주소값을 갖는지 확인하므로 밑에거와 같은 결과물이 나와야하는데
        System.out.println(str1 == str2);
        // String에서는 내용물이 같은지 오버라이딩이 된것
        System.out.println(str1.equals(str2));

        Student std1 = new Student(10001, "Tomas");
        Student std2 = new Student(10001, "Tomas");
        System.out.println(std1 == std2);
        System.out.println(std1.equals(std2));

        // 해쉬는 값을 힙메모리에 저장할 그 주소값을 산출해내는 규칙
        // 인덱스할때 빠른 접근이 가능해진다 : 내용물 - 주소값 간 규칙이 있기 때문?
        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());
        System.out.println(System.identityHashCode(std2));
        // 원래는 주소값이 나오지만 재정의 되어 학번을 출력

        //위는 hashcode()와 identify...()가 같은데
        // 아래가 다른 - String에서 해시코드가 재정의 되었기 때문
        // 물리적으로 동일하지 않아도, 논리적으로 동일하면 동일값을 반환하도록 재정의 된
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
