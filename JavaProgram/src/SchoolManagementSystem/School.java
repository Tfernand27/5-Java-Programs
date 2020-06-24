package SchoolManagementSystem;

import java.util.List;

public class School {
	
	private List<Teacher> teachers; //list of teachers ensures there are multiple teachers
	private List<Student> students; //list of students ensures there are multiple students
	private static int totalMoneyEarned=0;
	private static int totalMoneySpent=0;
	
	//Implement teacher and students by using ArrayList
	
	//array-multiple numbers-defined
	//ArrayList-you add values dinamically to the arrayList without never sizing it
	
	//go to source-generate constructor with fields
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
	}
	
	//define the getters and setters
	
	//return the list of teachers in the school
	public List<Teacher> getTeachers() {
		return teachers;
	}
	
	//add a teacher to the shcool
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}
	
	//return the list of students in the school
	public List<Student> getStudents() {
		return students;
	}
	
	//add a student to the school
	public void addStudent(Student student) {
		students.add(student);
	}
	
	//return the total money earned by the school
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	//update the totalMoneyEarned by the school
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned+=MoneyEarned;
	}
	
	//returns the total money spent by the school
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	
	//update the money spent by the school given to the teachers
	public static void updateTotalMoneySpent(int MoneySpent) {
		totalMoneyEarned-=MoneySpent;
		}
	
	
	
	

}
