package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//only this requires main to execute the code
		//it's not maintainable and best practise to add multiple objects
		
				
		//how many new students we want to add
		
		System.out.println("Enter number of new students to enroll: ");
		Scanner in=new Scanner(System.in);
		
		//create an array of objects
		int numOfStudents=in.nextInt();
		Student[] students=new Student[numOfStudents]; //size of array number of elements
		
		
		//create n number of new students
		
		for(int n=0;n<numOfStudents;n++) {
			
			students[n] =new Student();
			students[n].enroll();
			students[n].payTuition();
		
		}
		
		for(int n=0;n<numOfStudents;n++) {
			
			System.out.println(students[n].toString());
						
		}
			
		
	}

}
