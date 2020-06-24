package AdventureGame;

import java.util.Random;
import java.util.Scanner;

public class gameProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//system variables
		Scanner in=new Scanner(System.in); //sistym.in for input
		Random rand=new Random();
		
		//game variables-array of strings
		String[] enemies= {"dracula", "batman", "spiderman"};
		
		int maxEnemyHealth=75;
		int enemyAttackDamage=24;
		
		//Player variables
		int health=100;
		int attackDamage=50;
		int numHealthPotions=3;
		int healthPotionHealAmount=30;
		int healthPotionDropChance=50; //percentage
		
		boolean running=true; //condition to the while loop
		
		System.out.println("welcome to the game!");
		
		GAME://while loop label
		while(running) {
			
			System.out.println("--------------------------------------");
			
			int enemyHealth=rand.nextInt(maxEnemyHealth); //random number till the max
			String enemy=enemies[rand.nextInt(enemies.length)]; //index btw 0 and the length of the array
			System.out.println("\t# " + enemy + " appeared #\n");
			
			while(enemyHealth>0) {
				
				System.out.println("\tyourHP: " +health);
				System.out.println("\t" +enemy + "'s HP: " +enemyHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1. Attack");
				System.out.println("\t2. Drink health potion");
				System.out.println("\t3. Run");
				
				String input=in.nextLine();//next line in console is the user input
				
				if(input.equals("1")) {
					
					int damageDealt=rand.nextInt(attackDamage);
					int damageTaken=rand.nextInt(enemyAttackDamage);
					
					enemyHealth-=damageDealt;
					health-=damageTaken;
					
					System.out.println("\tYou strike the "+enemy + "for " +damageDealt + "damage");
					
					System.out.println("\t>You receive " +damageTaken + "in retaliation");
					
					if(health<1) {
						System.out.println("you have taken too much damage");
						break;//breaks the while loop
					}
					
				} else if(input.equals("2")) {
					
					if(numHealthPotions>0) {
						health+=healthPotionHealAmount;
						numHealthPotions--;//make sure we really use it
						System.out.println("\tYou drink youself a health potion for " +healthPotionHealAmount
									+"\t\nYou now have " +health + "HP."
									+"\n\t>You have " +numHealthPotions + "health potions left.\n");
					} else {
						System.out.println("\t>You have no health potions left.Defeat your enemies for a chance.\n");
					}
					
				} else if(input.equals("3")) {
					
					System.out.println("\tYou run away from the " +enemy);
					continue GAME; //if we put only CONTINUE we would come back to the loop we are currently in this way it will find a new enemy
					
				} else {
					
					System.out.println("\tInvalid command!");
					
				}
			}
			
			//end of while loop what happens when you die
			if(health<1) {
				System.out.println("you limp out from the game");
				break;
			}
			
			System.out.println("--------------------------------------");
			
			System.out.println("#" +enemy + "was defeated!");
			System.out.println("# you have " +health + "HP left");
			
			if(rand.nextInt(100)<healthPotionDropChance) {
				numHealthPotions++;
				System.out.println("# The" +enemy + "dropped a health potion");
				System.out.println("# You have " +numHealthPotions + "health potions");
			}
			
			System.out.println("--------------------------------------");
			System.out.println("what would you like to do?");
			System.out.println("1. continue fighting");
			System.out.println("2. exit game");
			
			String input=in.nextLine();
			
			//user tem de por input correcto senao 
			while(!input.equals("1") && !input.equals("2")) {
				
				System.out.println("Invalid command");
				input=in.nextLine();
			}
			
			if(input.equals("1")) {
				System.out.println("you continue your adventure");
			} else if(input.equals("2")) {
				System.out.println("you exit successfully from the game!");
				break;//breaks out from the while loop
			}
		}
		
		System.out.println("#############################");
		System.out.println("THANKS FOR PLAYING");

	}

}
