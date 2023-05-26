import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		
		Scanner choiceScanner = new Scanner(System.in);
		printInputLabel() ;
		String choice = choiceScanner.next();
		
		while (!choice.equalsIgnoreCase("A") && !choice.equalsIgnoreCase("B") && !choice.equalsIgnoreCase("C") && !choice.equalsIgnoreCase("D")) {
			printInvalidChoice();
			printInputLabel() ;
			choice = choiceScanner.next();
		}
		
		if (choice.equalsIgnoreCase("D")) {
			terminateProgram();
		}
		
		while (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B") || choice.equalsIgnoreCase("C")) {

			Scanner massScanner = new Scanner(System.in);
			Scanner volumeScanner = new Scanner(System.in);
			Scanner densityScanner = new Scanner(System.in);
			
			double mass;
			double volume;
			double density;
			
			printBorder();
			if (choice.equalsIgnoreCase("A")) {
				System.out.println("Compute for Density");
				
				//this is for testing only
				System.out.println("Test Modification");
				// end test

				System.out.print("Mass (g) : ");
				mass = massScanner.nextDouble();
				System.out.print("Volume (cm^3) : ");
				volume = volumeScanner.nextDouble();
				
				calculateDensity(mass,volume);
				
			}
			
			if (choice.equalsIgnoreCase("B")) {
				System.out.println("Compute for Mass");
				
				System.out.print("Density (g/cm^3) : ");
				density = densityScanner.nextDouble();
				System.out.print("Volume (cm^3) : ");
				volume = volumeScanner.nextDouble();
				
				calculateMass(density,volume);
			}
			
			if (choice.equalsIgnoreCase("C")) {
				System.out.println("Compute for Volume");

				System.out.print("Mass (g) : ");
				mass = massScanner.nextDouble();
				System.out.print("Density (g/cm^3) : ");
				density = densityScanner.nextDouble();
				
				calculateVolume(mass,density);
				
			}
			

			printInputLabel() ;
			choice = choiceScanner.next();
			
			while (!choice.equalsIgnoreCase("A") && !choice.equalsIgnoreCase("B") && !choice.equalsIgnoreCase("C") && !choice.equalsIgnoreCase("D")) {
				printInvalidChoice();
				printInputLabel() ;
				choice = choiceScanner.next();
			}
			
			if (choice.equalsIgnoreCase("D")) {
				terminateProgram();
				massScanner.close();
				densityScanner.close();
				volumeScanner.close();
				
			}
		}
		choiceScanner.close();
		
		
	}
	public static void calculateDensity(double mass,double volume) {
		double density = mass/volume;
		System.out.println("The Density is : " + density + " g/cm^3");
		printBorder();
	}
	
	public static void calculateMass(double density,double volume) {
		double mass = density*volume;
		System.out.println("The Mass is : " + mass + " g");
		printBorder();
	}

	public static void calculateVolume(double mass,double density) {
		double volume = mass/density;
		System.out.println("The Mass is : " + volume + " cm^3");
		printBorder();
	}
		
	public static void terminateProgram() {
		System.out.print("Program Terminated.");
		System.exit(0);
	}
	public static void printInputLabel() {
		System.out.print("Please choose which to compute : A - Density / B - 	Mass / C - Volume / D - Exit : ");
	}
	public static void printBorder() {
		System.out.println("==================================================");
	}
	public static void printInvalidChoice() {
		System.out.println("Invalid Choice!");
	}
}
