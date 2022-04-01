package chapter12.collection.hashSet;

import chapter12.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberID) {
        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Member member = iterator.next();
            if (memberID == member.getMemberID()) {
                hashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberID + "가 존재하지 않습니다.");
        return false;
    }

    public void showAll() {
        //1
        //System.out.println(hashSet);

        //2
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();

        // 3?
        /*
        Iterator<Member> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

    }
}
