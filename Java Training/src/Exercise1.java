import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

	Scanner choiceScanner = new Scanner(System.in);
	printInputLabelMain();
	String choice = choiceScanner.next();
	
	while (!choice.equalsIgnoreCase("A") && !choice.equalsIgnoreCase("B") && !choice.equalsIgnoreCase("C")) {
		printInvalidChoice();
		printInputLabelMain();
		choice = choiceScanner.next();
	}
	
	
	
	while (choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B") ) {
		
		while (choice.equalsIgnoreCase("A")) {
			Scanner choiceScannerSub = new Scanner(System.in);
			printInputLabelMainSub();
			String choiceSub = choiceScannerSub.next();
			
			while (!choiceSub.equalsIgnoreCase("A") && !choiceSub.equalsIgnoreCase("B") && !choiceSub.equalsIgnoreCase("C")) {
				printInvalidChoice();
				printInputLabelMainSub();
				choiceSub = choiceScannerSub.next();
			}
			

			Scanner oppositeScanner = new Scanner(System.in);
			Scanner adjacentScanner = new Scanner(System.in);
			Scanner hypotenuseScanner = new Scanner(System.in);
			
			double adjacent;
			double opposite;
			double hypotenuse;

			printBorder() ;
			if (choiceSub.equalsIgnoreCase("A")) {
				System.out.println("Solve for Hypotenuse");
				
				System.out.print("Adjacent : ");
				adjacent = adjacentScanner.nextDouble();
				
//				while(true) {
//					try {
//						adjacent = Double.parseDouble(adjacentScanner.nextLine());
//						break;
//					} catch (NumberFormatException nfe) {
//						printInvalidInput();
//						System.out.print("Adjacent : ");
//						
//					}
//				}
				
				System.out.print("Opposite : ");
				opposite = oppositeScanner.nextDouble();
				while(adjacent <= 0 || opposite <= 0) {
					printInputLabelSubInvalid(choiceSub);
;					System.out.print("Adjacent : ");
					adjacent = adjacentScanner.nextDouble();
					System.out.print("Opposite : ");
					opposite = oppositeScanner.nextDouble();
				}
				
				calculateHypotenuse(adjacent,opposite);
				
				
			}
			
			else if (choiceSub.equalsIgnoreCase("B")) {
				System.out.println("Solve for Opposite");
				
				System.out.print("Adjacent : ");
				adjacent = adjacentScanner.nextDouble();
				
				System.out.print("Hypotenuse : ");
				hypotenuse = hypotenuseScanner.nextDouble();
				
				while(adjacent >= hypotenuse || adjacent <= 0 || hypotenuse <= 0) {
					printInputLabelSubInvalid(choiceSub);
					System.out.print("Adjacent : ");
					adjacent = adjacentScanner.nextDouble();
					System.out.print("Hypotenuse : ");
					hypotenuse = hypotenuseScanner.nextDouble();
				}
				
				calculateOpposite(adjacent,hypotenuse);
			}
			else {
				System.out.println("Solve for Adjacent");
				
				System.out.print("Opposite : ");
				opposite = oppositeScanner.nextDouble();
				
				System.out.print("Hypotenuse : ");
				hypotenuse = hypotenuseScanner.nextDouble();
				
				while(opposite >= hypotenuse|| opposite <= 0 || hypotenuse <= 0) {
					printInputLabelSubInvalid(choiceSub);
					System.out.print("Opposite : ");
					opposite = oppositeScanner.nextDouble();
					System.out.print("Hypotenuse : ");
					hypotenuse = hypotenuseScanner.nextDouble();
				}
				calculateAdjacent(hypotenuse,opposite);
			}
			
			printInputLabelMain();
			choice = choiceScanner.next();
			
			while (!choice.equalsIgnoreCase("A") && !choice.equalsIgnoreCase("B") && !choice.equalsIgnoreCase("C") ) {
				printInvalidChoice();
				printInputLabelMain();
				choice = choiceScanner.next();
			}
			if (choice.equalsIgnoreCase("C")) {
				terminateProgram();
				hypotenuseScanner.close();
				oppositeScanner.close();
				adjacentScanner.close();
				choiceScannerSub.close();
				
				
			}
			
		}
		
		while(choice.equalsIgnoreCase("B")) {
			Scanner baseScanner = new Scanner(System.in);
			Scanner heightScanner = new Scanner(System.in);
			printBorder() ;
			System.out.println("Solve for Area");
			System.out.print("Base : ");
			double base = baseScanner.nextDouble();
			System.out.print("Height : ");
			double height = heightScanner.nextDouble();
			
			calculateAreaofTriangle(base,height);
			
			printInputLabelMain();
			choice = choiceScanner.next();
			
			while (!choice.equalsIgnoreCase("A") && !choice.equalsIgnoreCase("B") && !choice.equalsIgnoreCase("C") ) {
				printInvalidChoice();
				printInputLabelMain();
				choice = choiceScanner.next();
			}
			if (choice.equalsIgnoreCase("C")) {
				terminateProgram();
				baseScanner.close();
				heightScanner.close();
			}
			
		}
	
	}
	
	if (choice.equalsIgnoreCase("C")) {
		terminateProgram();
	}
	choiceScanner.close();
	
	
	
}
	public static void calculateHypotenuse(double adjacent,double opposite) {
		Double hypotenuse = Math.sqrt((Math.pow(adjacent, 2))+(Math.pow(opposite, 2)));
		
		System.out.println("The hypotenuse is : " + hypotenuse );
		printBorder();
	}
	public static void calculateAdjacent(double hypotenuse,double opposite) {
		Double adjacent = Math.sqrt((Math.pow(hypotenuse, 2))-(Math.pow(opposite, 2)));
		
		System.out.println("The Adjacent is : " + adjacent );
		printBorder();
	}public static void calculateOpposite(double adjacent,double hypotenuse) {
		Double opposite = Math.sqrt((Math.pow(hypotenuse, 2))-(Math.pow(adjacent, 2)));
		
		System.out.println("The Opposite is : " + opposite );
		printBorder();
	}
	
	public static void calculateAreaofTriangle(double base, double height) {
		double area = (base*height)/2	;
		System.out.println("The Area of the triangle is : " + area );
		printBorder();
	}
	
	public static void terminateProgram() {
		System.out.print("Program Terminated.");
		System.exit(0);
	}
	public static void printInputLabelMain() {
		System.out.print("Please choose which to compute : A - Pythagorean Theorem / B - 	Area of triangle / C - Exit : ");
	}
	public static void printInputLabelMainSub() {
		System.out.print("Please choose which to compute : A - Hypotenuse / B - Opposite / C - 	Adjacent : ");
	}
	public static void printInputLabelSubInvalid(String input) {
		if (input.equalsIgnoreCase("A")){
			System.out.println("Invalid Input. Make sure values are positive.");
		}
		else if(input.equalsIgnoreCase("B")) {
			System.out.println("Invalid Input. Make sure Hypotenuse > Adjacent and values are positive.");
		}
		else {
			System.out.println("Invalid Input. Make sure Hypotenuse > Opposite and values are positive. ");
		}
	}
	
	public static void printBorder() {
		System.out.println("==================================================");
	}
	public static void printInvalidChoice() {
		System.out.println("Invalid Choice!");
	}
	
}
