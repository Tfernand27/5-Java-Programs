package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	
	//declare the variables
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses=null;
	private int tuitionBalance=0	;
	private static int costOfCourse=600; //property is true for all objects
	private static int id=1000; //property is true for all objects
	

	//constructor prompt user name and year-user input
	public Student() {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName=in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName=in.nextLine();
		
		System.out.println("1-Freshman\n2-junior\n3-senior\nEnter student class level: ");
		this.gradeYear=in.nextInt();
		
		setStudentID();
		
		//System.out.println(firstName + " " + lastName +" " +gradeYear +studentID);
		
		
		
	}
	
	//generate an ID
	
	private void setStudentID() {
		
		//Grade level + ID
		id++; //everytime we create a new student the id is incremented by 1
		this.studentID= gradeYear + "" + id;
	}
	
	
	//enroll in courses
	
	public void enroll() {
		
		do {
			System.out.println("enter course to enroll (0 to quit): ");
			Scanner in=new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q")) { //equals is better for strings rather than !=
				courses=courses + "\n " +course;
				tuitionBalance=tuitionBalance+costOfCourse;
			}
			
			else {
				//System.out.println("break");
				break;
				
			}
		} while(1!=0);
			
		
		//System.out.println("ENROLLED IN: " +courses);
		System.out.println("TUITION BALANCE: "+tuitionBalance);
		
	}
	
	//view balance
	
	public void viewBalance() {
		
		System.out.println("your balance is: $ " +tuitionBalance);
	}
	
	//pay tuition
	
	public void payTuition() { //prompt the user the payment instead add the parameter
		viewBalance();
		System.out.println("Enter your payment: $ ");
		Scanner in=new Scanner(System.in);
		int payment=in.nextInt();
		
		tuitionBalance=tuitionBalance - payment;
		System.out.println("Thank you for your payment of: "+payment);
		viewBalance();
		
		
			
	}
	
	//show status
	
	public String toString() {
		
		return "Name " +firstName + " " +lastName +
				"\nStudentID: " +  studentID +
				"\nCourses Enrolled: " +courses +
				"\nBalance: $" +tuitionBalance;
	}
		
}
