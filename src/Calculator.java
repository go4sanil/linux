/* 6.	Build a calculator application which uses switch case.    */

public class Calculator {

	public static void main(String[] args) {
		int num_A = 1;
		int num_B = 2;
		String operation = "Addition";

		switch (operation) {
		case "Addition":
			System.out.println("The sum of two numbers are:  " + (num_A + num_B));
			break;
		case "Substraction":
			System.out.println("The difference of two numbers are:  " + (num_A - num_B));
			break;
		case "Multiplication":
			System.out.println("The product of two numbers are:  " + (num_A * num_B));
			break;
		case "Division":
			System.out.println("The division of two numbers gives:  " + (num_A / num_B));
			break;
		case "Modulus":
			System.out.println("The Modules of two numbers are:  " + (num_A % num_B));
			break;
		default:
			System.out.println("Please double check the numbers you have entered");

		}

	}
}
