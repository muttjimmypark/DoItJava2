package chapter10.scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.print("전화 상담 배분 방식을 선택하세요 (R, L, P) : ");
        int ch = System.in.read();
        Scheduler scheduler = null;

        if (ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastJob();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("지원하지 않는 기능입니다.");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();

        // 인터페이스 명세 기반 예시 : JDBC - DB를 다루는
        // Connection 등 인터페이스로 구현되어, 오라클,mssql,mysql 등에서
        // 실제 기능을 구현한 jar를 넘겨받아 실행된다
    }
}
