package chapter12.collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {
    private int memberID;
    private String memberName;

    public Member() {
    }

    public Member(int memberID, String memberName) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberID + "입니다.";
    }

    @Override
    public int hashCode() {
        return memberID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;

            if (this.memberID == member.memberID) {
                return true;
            }
            return false;
        }
        return false;
    }

    //Comparable 인터페이스를 추상상속받으면서 반드시 구현해야하는 파트
    @Override
    public int compareTo(Member member) {
        //memberid를 정렬기준으로 삼는다 했을때
        // 나 자신 빼기 비교대상 해서 음수면 오름차순
        // 나보다 더 큰놈이 들어왔을때 음수가 리턴되는것이 자연스러우니까...?
        // +기본 정렬은 오름차순인게 자연스러우니까...?
        return (this.memberID - member.memberID);

        // string도 compareto로 똑같이 정렬됨
        // return (this.memberName.compareTo(member.memberName));
    }

    //이미 comparable이 구현된 클래스들의 하위작업으로 새로 정의하고 싶을때
    // comparator를 중복적용 Renew할수 있다
    @Override
    public int compare(Member m1, Member m2) {
        return (m1.memberID - m2.memberID);
    }
}
