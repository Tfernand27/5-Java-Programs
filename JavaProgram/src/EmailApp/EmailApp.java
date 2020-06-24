package EmailApp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email eml=new Email("John","Smith");//create obj of the class to call of the methods
		
		//eml.setAlternateEmail("tf@gmail.com");
		//System.out.println(eml.getAlternateEmail());
		
		System.out.println(eml.showInfo());
		
		//if the method is return something you need to print it out

	}

}
