# 04. 객체의 속성은 멤버 변수로, 객체의 기능은 메서드로 구현한다

## 학생 클래스를 정의 하고 이를 사용해 보자

- 학생 클래스의 속성을 멤버 변수로 선언하고 메서드를 구현한다

``` java
package me.sungbin.chapter2.ch02_04;

public class Student {

    public int studentId;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentId + "학번의 이름은 " + studentName + "이고, 주소는 " + address + "입니다.");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}

```

- 학생 클래스를 생성하여 생성된 객체(인스턴스)에 각각 다른 이름과 주소를 대입한다
``` java
package me.sungbin.chapter2.ch02_04;

public class StudentTest {
    public static void main(String[] args) {

        Student studentYang = new Student();

        studentYang.studentId = 12345;
        studentYang.setStudentName("Robert");
        studentYang.address = "시흥";

        studentYang.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentId = 54321;
        studentKim.studentName = "김철수";
        studentKim.address = "판교";

        studentKim.showStudentInfo();
    }
}

```
