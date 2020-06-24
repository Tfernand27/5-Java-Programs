package SchoolManagementSystem;

public class Student {
	
	//CTRL+O shows all the variables and methods
	//declare the variables
	
	private int id;
	private String name;
	private int grade;
	private int feesPaid=0;
	private int feesTotal=30000;
	
	//define the constructor method
	//what should be required when you create a student object
	//goal of the constructor-create a new student obj by initializing the values
	
	public Student(int id, String name, int grade) {
		
		this.id=id; //id from the class level equals id from the argument/constructor
		this.name=name;
		this.grade=grade;
		
	}
	
	//not going to set student name and id only implement set method for grade
	//update the grade from the student from the grade coming from the argument
	//parameter grade is the new grade of the student
	
	public void setGrade(int grade) {
		
		this.grade=grade;
		
	}
	
	//create set method to update the fees into feesPaid field
	//fees parameter is the fees the student pays
	
	public void payFees(int fees) {
		
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid); //with static we can access the method otherwise we need to have an instance of the method hps.method...
		
	}
	
	//shortcut CTRL + space to generate getters and setters
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getFeesPaid() {
		return feesPaid;
	}
	
	public int getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		
		return feesTotal-feesPaid;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "student name " +name+
				" total fees paid " +feesPaid+
				"";
		
		
	}
	
	

}
