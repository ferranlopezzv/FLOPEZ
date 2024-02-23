package pll.proves;

import java.util.Scanner;

public class ExempleMetodeEntradaNumEnterGeneric {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int myCorrectNumber=getInteger(in,1,50);
		int mySecondCorrectNumber = getInteger(in,50,100);
        System.out.println("Thanks. Your number is: "+myCorrectNumber );
        System.out.println("Thanks. Your second number is: "+mySecondCorrectNumber );
        System.out.println("End of programm");
        in.close();
	}
	static public int getInteger(Scanner in, int min, int max) {
		int number=0;
		boolean validNumber = false;
		while(!validNumber) {
			System.out.print("Enter an integer number (between "+ min +" and "+ max +"): ");
	        if (in.hasNextInt()) { // Check if the next input is an integer
	            number = in.nextInt(); // Read an integer from the user
	            if (number > min && number < max) { // Check if the munber is out of range
	                validNumber = true;
	            }else{
	            	//Display an error message for a number out of range
	            	System.err.println("Invalid input. The number has to be between "+ min +" and "+ max);
	            }
	        } else {
	        	// Display an error message for a non integer number
	            System.err.println("Please, enter a valid integer.");
	            in.next(); // Consume the invalid input to avoid an infinite loop
	        }
		}
		return number;
	}
}
