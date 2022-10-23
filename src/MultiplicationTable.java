/*5.	Write a program which prints the multiplication table of a number. [*/

public class MultiplicationTable {

	public static void main(String[] args) {
		int multi_numb = 9;
		for (int counter = 0; counter <= 10; counter++) {
			System.out.println(multi_numb + "*" + counter + "=" + (multi_numb * counter));
		}
	}

}
