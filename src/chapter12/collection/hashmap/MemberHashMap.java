package chapter12.collection.hashmap;

import chapter12.collection.Member;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        //Map에서 넣는 함수 put
        hashMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID) {
        if (hashMap.containsKey(memberID)) {
            //get은 꺼내기, remove는 꺼내지우기
            hashMap.remove(memberID);
            return true;
        }

        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        //key를 기준으로 iterator 활용하여 중복없이 전체 출력
        Iterator<Integer> ir = hashMap.keySet().iterator();

        while (ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
    }
}
