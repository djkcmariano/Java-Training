import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibonacci Series");
		System.out.print("Please Enter Number : ");
		int number = scanner.nextInt();
		
		while (number <=0) {
			System.out.println("Number must be positive!");
			System.out.print("Please Enter Number : ");
			number = scanner.nextInt();
		}
		
		while (number >=20) {
			System.out.println("Number must be below 20!");
			System.out.print("Please Enter Number : ");
			number = scanner.nextInt();
		}
		ArrayList <Integer> fibonacciArray = new ArrayList<Integer>();
		
		while (number > 0) {
			int firstTerm = 1;
			int secondTerm = 2;
			int nextTerm;
			for (int i = 1;i <=number;i++) {
				
				fibonacciArray.add(firstTerm);

				nextTerm = firstTerm + secondTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
				
				
				
			}
			System.out.println(fibonacciArray.toString()
					.replace("[","")
					.replace("]", ""));
			fibonacciArray.clear();
			
			System.out.println("==================================================");
			System.out.println("Fibonacci Series");
			System.out.print("Please Enter Number : ");
			number = scanner.nextInt();
			while (number <=0) {
				System.out.println("Number must be positive!");
				System.out.print("Please Enter Number : ");
				number = scanner.nextInt();
			}

			while (number >=20) {
				System.out.println("Number must be below 20!");
				System.out.print("Please Enter Number : ");
				number = scanner.nextInt();
			}
		}
		
		
	}

}
