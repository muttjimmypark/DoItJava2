package chapter9.gameLevel;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프를 아직 배우지 못했습니다.");
    }

    @Override
    public void turn() {
        System.out.println("턴을 아직 배우지 못했습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*** 비기너 레벨이 되었습니다.");
    }
}
