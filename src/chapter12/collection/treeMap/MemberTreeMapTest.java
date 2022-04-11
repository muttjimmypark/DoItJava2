package chapter12.collection.treeMap;

import chapter12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(102, "LeeSunSin");
        Member memberKim = new Member(101, "KimYouSin");
        Member memberShin = new Member(103, "ShinSaim");

        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberShin);
        memberTreeMap.showAllMember();
        //map에서 put 받을때 key값은 Integer로 들어가졌기 때문에
        // Integer 안에 comparable이 구현되어있으므로
        // 멤버 클래스 키값에 대한 클래스 정의 단에서 구현할 필요가 없어짐
    }
}
