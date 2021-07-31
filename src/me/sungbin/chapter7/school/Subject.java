package me.sungbin.chapter7.school;

import me.sungbin.chapter7.utils.Define;

import java.util.ArrayList;

public class Subject {

    private int subjectId; // 과목 아이디

    private String subjectName; // 과목 이름

    private int gradeType; // 과목 평가방법 기본은 A,B

    private ArrayList<Student> studentList = new ArrayList<>();

    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.gradeType = Define.AB_TYPE;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
