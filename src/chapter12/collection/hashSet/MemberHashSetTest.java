package chapter12.collection.hashSet;

import chapter12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(101, "LeeSunSin");
        Member memberKim = new Member(102, "KimYouSin");
        Member memberShin = new Member(103, "ShinSaim");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberShin);

        memberHashSet.showAll();

        //memberID가 동일하지 않게 설계하는 방법
        // Member원소에 equals 오버라이딩 구현 (멤버아이디가 같으면 같은 멤버라고)
        // +hashCode 오버라이딩 구현 (멤버아이디 자체가 코드가 되도록)
        Member memberMong= new Member(101, "LeeMong");
        memberHashSet.addMember(memberMong);
        memberHashSet.showAll();
        //equals, hashcode 구현 전에는 그냥 추가됐었는데
        // 구현 후에는 hashset에 추가되지 않음을 확인
    }
}
