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
