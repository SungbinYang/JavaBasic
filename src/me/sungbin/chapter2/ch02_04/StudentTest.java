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
        System.out.println(studentKim);
        System.out.println(studentYang);
    }
}
