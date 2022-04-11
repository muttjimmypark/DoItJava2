package chapter12.collection.treeSet;

import chapter12.collection.Member;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    //comparable을 사용하는 경우 - 순환하면서 자신을 기준하여 다른 Member와 비교에 들어간다
    /*
    public MemberTreeSet() {
        treeSet = new TreeSet<>();
    }*/

    //comparator를 사용하는 경우 - 다른 Member를 인자로 받는 TreeSet을 생성한다
    public MemberTreeSet() {
        treeSet = new TreeSet<>(new Member());
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberID) {
        Iterator<Member> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (memberID == member.getMemberID()) {
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();

    }
}
