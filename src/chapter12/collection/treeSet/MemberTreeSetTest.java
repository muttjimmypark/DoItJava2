package chapter12.collection.treeSet;

import chapter12.collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        //chapter12.collection.Member cannot be cast to class java.lang.Comparable
        // Member에서 트리셋 입력시 Comparable에 대한것을 구현하지 않아서
        // 이름만 바꿔서는 add쪽에서 에러가 난다
        // TreeSetTest에서는 String이 comparable을 구현해놧기때문에 에러x

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberLee = new Member(102, "LeeSunSin");
        Member memberKim = new Member(101, "KimYouSin");
        Member memberShin = new Member(103, "ShinSaim");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberShin);
        memberTreeSet.showAll();
        //무작위로 넣어도 순서대로 출력됨을 확인할 수 있다
    }
}
