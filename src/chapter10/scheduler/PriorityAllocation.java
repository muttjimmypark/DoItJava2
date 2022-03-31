package chapter10.scheduler;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("PA - 등급이 높은 고객의 전화를 먼저 가져옵니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("PA - 업무스킬이 가장 좋은 상담원의 대기열의 앞에 우선 할당합니다.");
    }
}
