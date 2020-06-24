package EmailApp;

import java.util.Scanner;

public class Email {

	//does not require main block just to create the objects
	
	//1st - declare the variables
	
	private String firstName; //means those variables cannot be accessed directly
	private String lastName;
	private String email;
	private String Password;
	private String department;
	private int mailBoxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordLength =10;
	private String companySuffix="facebook.com";
	
	//2nd-constructor to receive first and last name
	
	public Email(String firstName, String lastName) {
		
		this.firstName=firstName; //class level variable=local variable
		this.lastName=lastName;
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//call a method asking for the department
		this.department=setDepartment();//determine the dept by the setDepartment method
		//System.out.println("Department: " +this.department);
		
		//call a method which returns a random password
		this.Password=generatePassword(defaultPasswordLength);
		System.out.println("Your password is " + this.Password);
		
		//combine elements to generate email
		email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("your email is: " +email);
				
	}	
	
	//ask for the department
	
	private String setDepartment() {
		
		System.out.print("New worker " +firstName + "" + "Enter Department code:\n1 for sales\n2 for development\n3 for finance\n0 for none\nEnter the department code:");
		//user input
		Scanner in=new Scanner(System.in);
		int depChoice=in.nextInt();
		
		if(depChoice == 1) {			
			return "sales";
		} else if (depChoice == 2) {
			return "dev";
		}else if (depChoice == 3) {
			return "fin";
		}else {return "";}
		
		
	}
	
	//generate a random password
	
	private String generatePassword(int length) {
		
		String PasswordSet ="ABCDEFGHIJKLMNOPQRSTUVXZ1234567890_!=&";
		//set it into an array of characters
		char[] pwd=new char[length]; //new sequence of characters of size length
		
		//iterate over the value of the length always instanciate the variable with var type!!
		
		for(int i=0;i<length;i++) {
			
			//math.random gives us a random number btw o and 1 and multiply by the number of character at PasswordSet and make it an integer and store it into a variable 
			
			int rand=(int) (Math.random() * PasswordSet.length());
			pwd[i]=PasswordSet.charAt(rand); //pass this random charcater to our array one at a time
			
		}
		return new String (pwd);
		
		
	}
	
	//set the mailbox capacity //encapsulation 
	
	public void setMailBoxCapacity() {
		
		this.mailBoxCapacity=mailBoxCapacity;
	}
	
	//set the alternate email best practise to use this for the set methods
	
	public void setAlternateEmail(String altEmail) {
		
		this.alternateEmail=alternateEmail;
	}
	
	//change the password
	
	public void changePassword(String Password) {
		
		this.Password=Password;
	}
	
	//Define the get methods
	
	public int getMailBoxCapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return Password;}
	
	public String showInfo() {
		
		return "DISPLAY NAME: " +firstName + "" +lastName +
				"\nCOMPANY EMAIL: " +email + 
				"\nMAILBOX CAPACITY: " +mailBoxCapacity + "mb"; //\n displays it in a new line
	}
	
}
