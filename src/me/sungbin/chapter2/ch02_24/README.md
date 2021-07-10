# 24. ArrayList를 활용한 간단한 성적 산출 프로그램

## 예제 시나리오

    1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다. 
    Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3 과목을 수강하였습니다.
    Lee 학생은 국어 100점, 수학 50점입니다. 
    Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다. 
    Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요

## Student 클래스
``` java
package me.sungbin.chapter2.ch02_24;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String studentName;
    ArrayList<Subject> subjects = new ArrayList<>();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void addSubject(String subjectName, int score) {
        subjects.add(new Subject(subjectName, score));
    }

    public void showStudentInfo() {
        int total = 0;
        for (Subject value : subjects) {
            total += value.getScore();
            System.out.println("학생 " + studentName + "의 " + value.getSubjectName() + " 과목 성적은 " + value.getScore() + "입니다.");
        }
        System.out.println("학생 " + studentName + "의 총점은 " + total + "입니다.");
    }
}

```

## Subject 클래스
``` java
package me.sungbin.chapter2.ch02_24;

public class Subject {

    private String subjectName;
    private int score;

    public Subject(String subjectName, int score) {
        this.subjectName = subjectName;
        this.score = score;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

```

## 실행하기
``` java
public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showStudentInfo();
		System.out.println("======================================");
		studentKim.showStudentInfo();
	}
}
```
