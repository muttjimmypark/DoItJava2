package chapter9.abstractEx;

public class ComputerTest {
    public static void main(String[] args) {

        //abstract class는 단독 생성할 수 없다
        //Computer c1 = new Computer();
        //c1.display();
        //Computer c3 = new NoteBook();

        //만약 Desktop을 abstract 클래스로 정의했을경우
        // abstract 메서드를 안갖고 있어도 여기서 단독 선언할수 없다.
        // 상속으로 사용하기 전용으로 만든 클래스를 구현할때 abstract를 붙임
        Computer c2 = new Desktop();
        Computer c4 = new MyNoteBook();
        c2.display();
        c4.display();

        //변수 선언을 NoteBook으로 해야 보인다
        //c4.aaa();
    }
}
