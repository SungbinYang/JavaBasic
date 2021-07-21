# 10. 순차적으로 자료를 관리하는 List 인터페이스를 구현한 클래스와 그 활용

## 멤버십 관리하기

- Member 클래스를 만들고, 아이디와 이름을 멤버 변수로 선언

- Member 클래스로 생성된 인스턴스들을 관리하는 클래스를 컬렉션 프레임워크 클래스들을 활용하여 구현한다.


## ArrayList 활용하기

- 멤버를 순차적으로 관리함

Member.java
``` java
package me.sungbin.chapter5.ch05_10;

public class Member {

    private int memberId; // 회원 아이디
    private String memberName; // 회원 이름

    public Member(int memberId, String memberName) { // 생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() { // toString 메소드 오버로딩
        return memberName +  "회원님의 아이디는 " + memberId + "입니다.";
    }
}

```

MemberArrayList.java
``` java
package me.sungbin.chapter5.ch05_10;

import java.util.ArrayList;

public class MemberArrayList {

    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        for (int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}

```
MemberArrayListTest.java
``` java
package me.sungbin.chapter5.ch05_10;

public class MemberArrayListTest {
    public static void main(String[] args) {

        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberHong = new Member(1004, "홍길동");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberKim);
        memberArrayList.addMember(memberKang);
        memberArrayList.addMember(memberHong);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberKim.getMemberId());
        System.out.println("=================================");
        memberArrayList.showAllMember();
    }
}

```
