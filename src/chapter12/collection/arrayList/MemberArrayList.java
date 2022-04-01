package chapter12.collection.arrayList;

import chapter12.collection.Member;

import java.util.ArrayList;
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
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tmpid = member.getMemberID();
            if (memberID == tmpid) {
                arrayList.remove(i);
                return true;
            }
        }

        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for (Member member : arrayList) {
            System.out.println(member);
        }

        //벡터의 toString이 별도 구현되어있어서 Member변수가 줄줄줄 출력된다
        System.out.println(arrayList);
    }
}
