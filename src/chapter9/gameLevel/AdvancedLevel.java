package chapter9.gameLevel;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("1 높이 점프합니다.");
    }

    @Override
    public void turn() {
        System.out.println("턴을 아직 배우지 못했습니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("*** 중급자 레벨이 되었습니다.");
    }
}
