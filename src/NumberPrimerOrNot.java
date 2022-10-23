/*4.	Write a program to check if the number is prime or not. */
public class NumberPrimerOrNot {
	public static void main(String[] args) {
		int numb = 1;
		int count = 0;
		for (int counter = 2; counter <= numb; counter++) {
			if (numb % counter == 0) {
				count = count + 1;
			}
		}
		if (count == 1) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
	}

}
