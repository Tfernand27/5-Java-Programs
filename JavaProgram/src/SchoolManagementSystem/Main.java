package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a new teacher object
		
		Teacher Liz=new Teacher(1, "Liz", 800);
		Teacher Mel=new Teacher(2, "Mel", 1200);
		Teacher Bob=new Teacher(2, "Bob", 1500);
		
		List<Teacher> teacherList=new ArrayList<>();
		teacherList.add(Liz); //does not require double quotes
		teacherList.add(Mel); 
		teacherList.add(Bob);
		
		
		Student Tisha=new Student(1,"Tisha", 4);
		Student Rajat=new Student(2,"Rajat", 10);
		Student Mark=new Student(1,"Mark", 7);
		
		List<Student>studentList=new ArrayList<>();
		studentList.add(Tisha);
		studentList.add(Rajat);
		studentList.add(Mark);
		
		//use command CTRL+space to see which arguments it accepts
		School hps=new School(teacherList, studentList);
		
		
		Teacher megie=new Teacher(1, "Megie", 1000);
		hps.addTeachers(megie);//add meggie to school teacher list
		
		
		Tisha.payFees(500);
		Rajat.payFees(600);
		System.out.println("hps has earned €" + hps.getTotalMoneyEarned()); //method always requires the parenthesis
		
		System.out.println("--------MAKE HPS PAY SALARIES----------");
		
		Liz.receiveSalary(Liz.getSalary());
		System.out.println("HPS has spent salary with " +Liz.getName() + "and now has €" +hps.getTotalMoneyEarned());
		
		Mel.receiveSalary(Mel.getSalary());
		System.out.println("HPS has spent salary with " +Mel.getName() + "and now has €" +hps.getTotalMoneyEarned());
		
		System.out.println(Tisha);
		System.out.println(Liz);
	}

}
