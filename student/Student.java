package org.student;

import org.department.Department;
public class Student extends Department {
	
	public void studentName(){
        System.out.println("Nadhiya");
    }
    public void studentDept(){
        System.out.println("ComputerScience");
    }
    public void studentId(){
        System.out.println("8985475");
    }

    public static void main(String[] args) {
        Student stu= new Student();
        stu.studentName();
        stu.studentDept();
        stu.studentId();       
        stu.departmentName();
        stu.collegeCode();
        stu.collegeRank();
        stu.collegeName();
    }

}
