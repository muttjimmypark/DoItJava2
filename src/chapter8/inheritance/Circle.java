package chapter8.inheritance;

public class Circle {
    // 단순히 사용 변수가 겹친다고 extends Point 해서 사용할순 없음
    // has - a 관계
    private Point point;
    private int radius;

    public Circle() {
        point = new Point();
    }
}
