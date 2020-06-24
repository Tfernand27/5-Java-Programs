package BankAccount;

import java.util.Scanner;

public class BankAccount {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to execute the code you should create an obj of bank account and pass the 2 values in the constructor
		//whenever I create an obj the constructor will be invoked
		
		BankAccount obj1= new BankAccount("XYZ","A001");
		obj1.showMenu();

	}
	
	//1step - create global variables at class scope
	
	int balance;
	int previousTrans;
	String customerName;
	String cutomerId;
	
	//3rd step-initialize the constructor method with 2 parameters customerName and customerID
	public BankAccount(String cname, String cid) { //when creating bank account values it will require 2 values
		
		//assign values
		
		customerName=cname;
		cutomerId=cid;
	}

	//2nd step create the deposit/withdraw/transaction amount methods
		
	public void Deposit(int amount) {
		
		if(amount !=0) { //you can only deposit amounts different from 0
			
			balance+=amount; //balance=balance+amount
			previousTrans=+amount;
		}
		
	}
	
	public void Withdraw(int amount) {
		
		if(amount !=0) {
			
			balance-=amount; //balance=balance-amount
			previousTrans=-amount;
		}
		}
	
	public void getPreviousTransaction() {
		
		if(previousTrans>0) {
			
			System.out.println("Deposit: "+previousTrans);
			
		} else if(previousTrans<0) {
			
			System.out.println("Withradaw: "+Math.abs(previousTrans));
			
		} else {
			
			System.out.println("no transaction");
		}
		
		
	}
	
	//4th step-create the menu
	public void showMenu() {
		
		char value=0;
		//user input we use scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("your ID is "+cutomerId);
		System.out.println("\n");
		System.out.println("A, check balance");
		System.out.println("B, deposit");
		System.out.println("C, previous transaction");
		System.out.println("C, exit");
		
		//do...while loop
		
		do {
			
			System.out.println("=====================================");
			System.out.println("enter an option");
			System.out.println("=====================================");
			value=sc.next().charAt(0);
			System.out.println("\n");
			
			
			switch(value) {
			
			case'A':
				System.out.println("----------------------------");
				System.out.println("balance: "+balance);
				System.out.println("----------------------------");
				System.out.println("\n");
				break;
				
			case'B':
				System.out.println("enter an amount to deposit:");
				//use the scanner object to take the input and save into a variable
				int amount=sc.nextInt();
				Deposit(amount); //pass the variable inside the Deposit method
				System.out.println("\n");
				break;
				
			case'C':
				System.out.println("----------------------------");
				System.out.println("enter an amount to withdraw:");
				System.out.println("----------------------------");
				//use the scanner object to take the input and save into a variable
				int amount2=sc.nextInt();
				Withdraw(amount2); //pass the variable inside the Deposit method
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("----------------------------");
				getPreviousTransaction();
				System.out.println("----------------------------");	
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("**************************************");
				break;
				
				default:
					System.out.println("invalid option. enter again a valid option");
					break;
			}
			
		} while(value !='E');
		System.out.println("thank you for using our services");
		
		
		
	}
	
		
	}
	
	
	
	
	
	
	


