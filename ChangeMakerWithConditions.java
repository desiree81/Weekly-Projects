package WeeklyProjects;

/** The Project1ChangerMaker program implements an application that
 * displays the type and number of coins that is given to a person 
 * when making change when entering an amount between 1 and 99.
 * @author Desiree Adeboye
 * @version 1.0
 * @since 04-23-2018
 */

import java.util.Scanner;

public class CalculatorWithParameters {

	public static void main(String[] args) {
		int a = methoda();
		if(a >= 1 && a <= 99) {
			methodb(a);
			
		}
		else {
			System.out.println("Invalid Amount");
		}
		}
		
		//User input function
		public static int methoda() {
			System.out.print("Enter a Number Between 1 and 99 ");
			Scanner input = new Scanner(System.in);
			
			int a = input.nextInt();
					return a;
			
		}
		
		
			public static void methodb(int amount) {
				
				int numberOfQuarters = amount /25;
				amount = amount %25;
				int numberOfDimes = amount /10;
				amount = amount %10;
				int numberOfNickels = amount /5;
				amount = amount %5;
				int numberOfPennies = amount;
				
				System.out.println("The total number of quarters are " + numberOfQuarters);
				System.out.println("The total number of dimes are " + numberOfDimes);
				System.out.println("The total number of nickels are " + numberOfNickels);
				System.out.println("The total number of pennies are " + numberOfPennies);

				
			}
			
		
	}


