package me.sungbin.chapter2.ch02_16;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(employeeLee.getEmployeeName() + " " + employeeLee.getEmployeeId());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() + " " + employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName() + " " + employeeKim.getEmployeeId());
    }
}
