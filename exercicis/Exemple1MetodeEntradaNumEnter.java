package pll.proves;

import java.util.Scanner;

public class Exemple1MetodeEntradaNumEnter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int myCorrectNumber=getInteger(in);
        System.out.println("Thanks. Your number is: "+myCorrectNumber );
        System.out.println("End of programm");
		in.close();
	}

	static public int getInteger() {
		int number=0;
		boolean validNumber = false;
		while(!validNumber) {
			System.out.print("Introduce an integer number (between 1 and 50): ");
	        if (in.hasNextInt()) { // Check if the next input is an integer
	            number = in.nextInt(); // Read an integer from the user
	            if (number > 1 && number < 50) { // Check if the munber is out of range
	                validNumber = true;
	            }else{
	            	//Display an error message for  a number out of range
	            	System.err.println("Invalid input. The number has to be between 1 and 50");
	            }
	        } else {
	            System.err.println("Please, enter a valid integer."); // Display an error message
	            in.next(); // Consume the invalid input to avoid an infinite loop
	        }
		}
		return number;
	}
}
