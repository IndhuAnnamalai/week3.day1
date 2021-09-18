package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName(String Studname) {
		// TODO Auto-generated method stub
		System.out.println("The student name is: " +Studname);

	}
	
	public void studentDepartment(String StudDept) {
		System.out.println("The student department is: " + StudDept );
	}
	
	public void studentId(int ID) {
		// TODO Auto-generated method stub
System.out.println("The student ID is: "+ID);
	}
	
	public static void main(String[] args) {
		Student sObj = new Student();
		
		sObj.collegeCode(121);
		sObj.collegeName("SSIET");
		sObj.collegeRank(15);
		sObj.departmentName("ECE");
		sObj.studentId(1548);
		sObj.studentName("Indhu");
		sObj.studentDepartment("EEE");
		
	}
}
