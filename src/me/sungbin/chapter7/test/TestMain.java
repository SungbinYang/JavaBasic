package me.sungbin.chapter7.test;

import me.sungbin.chapter7.school.School;
import me.sungbin.chapter7.school.Score;
import me.sungbin.chapter7.school.Student;
import me.sungbin.chapter7.school.Subject;
import me.sungbin.chapter7.school.report.GenerateGradeReport;
import me.sungbin.chapter7.utils.Define;

public class TestMain {

    School goodSchool = School.getInstance();
    Subject korean;
    Subject math;
    Subject dance;

    GenerateGradeReport gradeReport = new GenerateGradeReport();


    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();
        test.createStudent();

        String report = test.gradeReport.getReport();
        System.out.println(report);
    }

    // 테스트 과목 생성
    public void createSubject() {
        korean = new Subject(Define.KOREAN, "국어");
        math = new Subject(Define.MATH, "수학");
        dance = new Subject(Define.DANCE, "방송댄스");

        goodSchool.registerSubject(korean);
        goodSchool.registerSubject(math);
        goodSchool.registerSubject(dance);
    }

    // 테스트 학생 생성
    public void createStudent() {
        Student student1 = new Student(211213, "강감찬", korean, math);
        Student student2 = new Student(212330, "김유신", math, korean);
        Student student3 = new Student(201518, "신사임당", korean, math);
        Student student4 = new Student(202360, "이순신", korean, math);
        Student student5 = new Student(201290, "홍길동", math, korean);

        goodSchool.registerStudent(student1);
        goodSchool.registerStudent(student2);
        goodSchool.registerStudent(student3);
        goodSchool.registerStudent(student4);
        goodSchool.registerStudent(student5);

        korean.addStudent(student1);
        korean.addStudent(student2);
        korean.addStudent(student3);
        korean.addStudent(student4);
        korean.addStudent(student5);

        math.addStudent(student1);
        math.addStudent(student2);
        math.addStudent(student3);
        math.addStudent(student4);
        math.addStudent(student5);

        dance.addStudent(student1);
        dance.addStudent(student2);
        dance.addStudent(student3);

        addScoreForStudent(student1, korean, 95);
        addScoreForStudent(student1, math, 56);
        addScoreForStudent(student1, dance, 95);

        addScoreForStudent(student2, korean, 95);
        addScoreForStudent(student2, math, 95);
        addScoreForStudent(student2, dance, 85);

        addScoreForStudent(student3, korean, 100);
        addScoreForStudent(student3, math, 88);
        addScoreForStudent(student3, dance, 55);

        addScoreForStudent(student4, korean, 89);
        addScoreForStudent(student4, math, 95);

        addScoreForStudent(student5, korean, 85);
        addScoreForStudent(student5, math, 56);

    }

    public void addScoreForStudent(Student student, Subject subject, int point) {
        Score score = new Score(student.getStudentId(), subject, point);

        student.addSubjectScore(score);
    }
}
