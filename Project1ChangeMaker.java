package WeeklyProjects;

/** The Project1ChangerMaker program implements an application that
 * displays the type and number of coins that is given to a person 
 * when making change.
 * @author Desiree Adeboye
 * @version 1.0
 * @since 04-23-2018
 */
import java.util.Scanner;

public class Project1ChangeMaker {

	// 25 = Quarter, 29 = Quarter penny penny penny penny, 15= dime nickel
	public static void main (String [] arg) {


		// Gathering input from the user
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an amount of money from 01 - 99");
		int remainingAmount = in.nextInt();
		
			// Define the variables
 
 int numberOfQuarters =remainingAmount /25;
 remainingAmount = remainingAmount %25;
		 
		 int numberOfDimes =remainingAmount /10;
 remainingAmount = remainingAmount %10;
		 
		 int numberOfNickels =remainingAmount /5;
 remainingAmount = remainingAmount %5;
		 
		 int numberOfPennies =remainingAmount ;
System.out.println("The total number of quarters are " + numberOfQuarters);
System.out.println("The total number of dimes are " + numberOfDimes);
System.out.println("The total number of nickels are " + numberOfNickels);
System.out.println("The total number of pennies are " + numberOfPennies);

}
}