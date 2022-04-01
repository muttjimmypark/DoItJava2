package chapter12.collection.iterator;

import chapter12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();
        Member memberLee = new Member(101, "LeeSunSin");
        Member memberKim = new Member(102, "KimYouSin");
        Member memberShin = new Member(103, "ShinSaim");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberShin);
        memberArrayList.showAll();

        System.out.println();

        memberArrayList.removeMember(memberKim.getMemberID());
        memberArrayList.showAll();
    }
}
