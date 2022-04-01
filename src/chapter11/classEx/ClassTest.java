package chapter11.classEx;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //Class클래스는 컴파일된 .class파일에서 객체의 정보를 가져오는 클래스다
        //로컬 메모리에 객체가 없어서 객체의 데이터타입을 직접 알수 없는경우에
        // 객체 정보만을 이용해서 프로그래밍 할수있게 도와준다
        //Class클래스는 주로 java.lang.reflect 패키지의 클래스들과 함께 사용된다

        // 리플렉션 프로그래밍 : Class클래스를 이용하여 클래스 정보(생성자, 멤버변수, 메서드 등) 를 가져오고
        //                  이를 활용하여 인스턴스 생성, 메서드 호출 등을 한다

        Person person = new Person();

        //생성된 인스턴스에 대해 Obj메소드인 getClass()를 이용해서 가져올수 있다
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());

        // 생성될 클래스를 직결하는 방법
        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        // 클래스 이름을 가지고 때려맞추는 방법
        Class pClass3 = Class.forName("chapter11.classEx.Person");
        System.out.println(pClass3.getName());

        // 3번 방법은 동적 로딩이다 <->정적로딩
        Class pClass4 = Class.forName("java.lang.String");
        System.out.println(pClass4.getName());

        System.out.println();

        //Class클래스를 가져왔으므로 Object 클래스의 newInstance()라는
        // 원시 방법에 직접 접근하여 Person을 생성할 수 있다
        // 다만 곧 지원중단될거라 에디터에서 취소선을 그었다
        Person p2 = (Person) pClass3.newInstance();
        System.out.println(person);
        System.out.println(p2);
    }
}
