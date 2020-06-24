package SchoolManagementSystem;


public class Teacher {
	
	private int id;
	private String name;
	private int salary;//since it's a dynamic variable cannot initialize it
	private int salaryEarned=0;
	
	public Teacher(int id, String name, int salary) { //creates a new teacher object
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	
	//define the getters -get the name/id/salary
	
	public String getName() {
		
		return name;	//return the name of the teacher
	}
	
	public int getID() {
		
		return id; 
	}
	
	public int getSalary() {
		
		return salary;
	}
	
	//define a setter for the salary to update the salary in the future
	
	public void setSalary(int salary) {
		
		this.salary=salary;
	}
	
	//adds to the salary earned the salary and remove from total money earned from the school
	public void receiveSalary(int salary) {
		
		salaryEarned+=salary;
		School.updateTotalMoneySpent(salary);
		
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of the teacher: " +name+
				" total salary earned so far "
				+salaryEarned;
	}
	
	

}
