package thirdHalf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingTryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:");
		//		int a= num%0;
		//		System.out.println(a);
		//		System.out.println("done");

		try {
			int num = scanner.nextInt();

			int a= num%0;
			System.out.println(a);
		}
		catch(ArithmeticException e){
			// System.out.println(e);
			//	e.printStackTrace();
			//	System.out.println(e.getMessage());

			System.out.println("Divivible by 0 not possible");
			System.err.println("Divivible by 0 not possible");
		}
		catch(InputMismatchException e) {
			System.out.println("Input must be number");
			System.err.println("Input must be number");
		}
		finally {
			scanner.close();
		}
	}
}
