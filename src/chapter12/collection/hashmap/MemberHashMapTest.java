package chapter12.collection.hashmap;

import chapter12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(102, "LeeSunSin");
        Member memberKim = new Member(101, "KimYouSin");
        Member memberShin = new Member(103, "ShinSaim");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberShin);
        memberHashMap.showAllMember();

        System.out.println();

        memberHashMap.removeMember(102);
        memberHashMap.showAllMember();
    }
}
