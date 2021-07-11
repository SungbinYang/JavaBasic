package me.sungbin.chapter4.ch04_02;

public class Student implements Cloneable {

    private int studentNumber;
    private String studentName;

    public Student(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return studentNumber + ", " + studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student std = (Student) o;
            return this.studentNumber == std.studentNumber;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
