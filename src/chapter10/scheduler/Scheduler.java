package chapter10.scheduler;

public interface Scheduler {
    void getNextCall();

    void sendCallToAgent();

    //client는 Scheduler의 인터페이스 구조 만을 보고 설계한다
    // 각각의 스케쥴링 방법을 보지않고, 공통으로 공용되는 스펙이라고 볼수 있다
}
