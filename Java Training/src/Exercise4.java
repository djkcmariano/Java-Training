import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		printInputLabel();
		
		try {
		int choice = scanner.nextInt();
		
		while (choice > 5 || choice < 1) {
			printInvalidChoice();
			printInputLabel() ;
			choice = scanner.nextInt();
		}
		while (choice <=5 ||choice >= 1) {
			
			
		if (choice == 1) {
			Hawaiian pizza = new Hawaiian();
			pizza.display();
		}
		else if (choice == 2) {
			Pepperoni pizza = new Pepperoni();
			pizza.display();
		} 
		else if (choice == 3) {
			Buffalo pizza = new Buffalo();
			pizza.display();
		} 
		else if (choice == 4){
			AllMeat pizza = new AllMeat();
			pizza.display();
		} 
		else {
			terminateProgram();
		}
		
		printInputLabel() ;
		choice = scanner.nextInt();
		while (choice > 5 || choice < 1) {
			printInvalidChoice();
			printInputLabel() ;
			choice = scanner.nextInt();
		}
		
	}
		} catch(InputMismatchException e) {
			System.out.println("Invalid Input. Program will close.");
			terminateProgram();
		}
		scanner.close();
		
	}
	
	public static void printInputLabel() {
		System.out.print("Please choose a pizza : 1 - Hawaiian / 2 - Pepperoni / 3 - Buffalo / 4 - All-Meat / 5 - Exit : ");
	}
	public static void printInvalidChoice() {
		System.out.println("Invalid Choice!");
	}
	public static void terminateProgram() {
		System.out.print("Program Terminated.");
		System.exit(0);
	}

}
