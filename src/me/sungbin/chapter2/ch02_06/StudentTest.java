package me.sungbin.chapter2.ch02_06;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.grade = 1;
        studentLee.studentName = "Robert";
        studentLee.studentNumber= 123;

        System.out.println(studentLee.showStudentInfo());

        Student studentKim = new Student(123456, "Kim", 3);
        System.out.println(studentKim.showStudentInfo());
    }
}
