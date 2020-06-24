import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//taking input from a user we use Scanner class
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		//int a=sc.nextInt();
		char c=sc.next().charAt(1);
		System.out.println("value= "+c);
		
		

	}

}
