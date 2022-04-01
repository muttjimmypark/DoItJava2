package chapter12.collection.iterator;

import chapter12.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberArrayList {

    private List<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberID) {
        //for문 돌리던 것을 Iterator 활용으로 바꿨다
        // List보다 원소간 순서가 없는 Set에서 활용도가 높아진다
        Iterator<Member> iterator = arrayList.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();

            int tmpID = member.getMemberID();
            if(memberID == tmpID) {
                arrayList.remove(member);
                return true;
            }
        }

        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll(){
        for (Member member : arrayList) {
            System.out.println(member);
        }

        //벡터의 toString이 별도 구현되어있어서 Member변수가 줄줄줄 출력된다
        System.out.println(arrayList);
    }
}
