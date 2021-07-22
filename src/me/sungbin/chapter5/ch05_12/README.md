# 12. 중복되지 않게 자료를 관리하는 Set 인터페이스를 구현한 클래스와 그 활용

## HashSet 클래스

- Set 인터페이스를 구현한 클래스와

- 멤버의 중복 여부를 체크하기 위해 인스턴스의 동일성을 확인해야 함

- 동일성 구현을 위해 필요에 따라 equals()와 hashCode()메서드를 재정의함


HashSetTest.java
``` java
public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("김유신"));
		hashSet.add(new String("이순신"));
		hashSet.add(new String("홍연의"));
		hashSet.add(new String("강감찬"));
		hashSet.add(new String("강감찬"));
		
		System.out.println(hashSet);
	}
}
```

MemberHashSet.java
``` java
package me.sungbin.chapter5.ch05_12;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashset {

    private HashSet<Member> hashSet;

    public MemberHashset() {
        hashSet = new HashSet<>();
    }

    public MemberHashset(int size) {
        hashSet = new HashSet<>(size);
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public boolean removeMember(int memberId) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//
//            int tempId = member.getMemberId();
//            if (tempId == memberId) {
//                arrayList.remove(i);
//                return true;
//            }
//        }
        Iterator<Member> ir = hashSet.iterator();

        while (ir.hasNext()) {
            Member member = ir.next();
            int tempId = member.getMemberId();
            if(tempId == memberId){            // 멤버아이디가 매개변수와 일치하면
                hashSet.remove(member);           // 해당 멤버를 삭제
                return true;                   // true 반환
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}

```

MemberHashSetTest.java
``` java
package me.sungbin.chapter5.ch05_12;

public class MemberHashsetTest {
    public static void main(String[] args) {

        MemberHashset memberHashset = new MemberHashset();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashset.addMember(memberLee);
        memberHashset.addMember(memberKim);
        memberHashset.addMember(memberKang);

        memberHashset.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberHashset.addMember(memberHong);

        memberHashset.showAllMember();
    }
}

```

- 아이디가 동일한 경우 같은 멤버이므로 중복되지 않도록 Member 클래스의 equals()와 hashCode()메서드를 재정의함

Member.java
``` java
package me.sungbin.chapter5.ch05_12;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o instanceof Member) {
            Member member = (Member) o;
            return this.memberId == member.memberId;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }
}

```
