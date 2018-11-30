
package Calculator;

import java.util.Scanner;

public class Bruso_COPFinals {

	public static void main(String[] args) {
		//define variables
		int firstnum, secondnum, result;
		String operations;
		Scanner input = new Scanner(System.in);
		char prompt='y';

		while (prompt ==('y')
				 )

		{
			
			//prompt user to select which operation to perform
			System.out.println(
					"Welcome to Bruso's Java Calculator! Please choose one of the following: add, sub, mult, div, sqrt, exit ");

			operations = input.next();
			//if loop for operations
			if (operations.equals("add")) {
				System.out.println("Please select two integers to add: ");
				firstnum = input.nextInt();
				secondnum = input.nextInt();
				result = add(firstnum, secondnum);
				System.out.println(result);
				
			}

			else if (operations.equals("sub")) {
				System.out.println("Enter two integers to subtract:  ");
				firstnum = input.nextInt();
				secondnum = input.nextInt();
				result = sub(firstnum, secondnum);
				System.out.println(result);
				
			}

			else if (operations.equals("mult")) {
				System.out.println("Enter two integers to multiply: ");
				firstnum = input.nextInt();
				secondnum = input.nextInt();
				result = mult(firstnum, secondnum);
				System.out.println(result);
				
			}

			else if (operations.equals("div")) {
				
				
				
				System.out.println("Enter two integers to divide:");
				firstnum = input.nextInt();
				secondnum = input.nextInt();
				String answer = div(firstnum, secondnum);
				System.out.println(answer);
				
			} else if (operations.equals("sqrt")) {
				System.out.println("Enter an integer: ");
				firstnum = input.nextInt();
				double answer=sqrt(firstnum);
				System.out.println(answer);
				}
			else if (operations.equals("exit")) {
				prompt = 'n'; 
				break;
						}
			
			else 
				System.out.println("Invalid input");
			
			System.out.println("Return to main menu?; y/n ");
			prompt = input.next().charAt(0);
			 
			
			
		} // end while
		
	}// end main

	static String div(int x, int y) {
		int q = x / y;
		long r = x % y;
		return q + " with a remainder of " + r;
	}// end division method

	static int sub(int x, int y) {
		return x - y;
	}// end subtract method

	static int add(int x, int y) {
		return x + y;
		// end add method
	}

	static int mult(int x, int y) {
		return x * y;
	}// end multiply method

	static double sqrt(int x) {
		double i=1;
		
		while (i*i!=x) {
			
			
			while (i*i<x) {
			i++;
				
			}
			
			while (i*i>x){
			i--;
			}
			
			
		}//end while
		
	return i;

	}// end square root method
}// end class
