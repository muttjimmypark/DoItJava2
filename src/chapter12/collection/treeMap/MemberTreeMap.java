package chapter12.collection.treeMap;

import chapter12.collection.Member;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<>();
    }

    public void addMember(Member member) {
        //Map에서 넣는 함수 put
        treeMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID) {
        if (treeMap.containsKey(memberID)) {
            //get은 꺼내기, remove는 꺼내지우기
            treeMap.remove(memberID);
            return true;
        }

        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        //key를 기준으로 iterator 활용하여 중복없이 전체 출력
        Iterator<Integer> ir = treeMap.keySet().iterator();

        while (ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
    }
}
