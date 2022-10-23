/*8.	Write a program that will keep adding 5 chocolates to a box which already has 27 chocolates and add a mechanism that number of chocolates should never go above 63*/

public class AddChocolates {

	public static void main(String[] args) {
		int chocolateMaxLimit = 63;
		int initialChocalateCount = 5;
		int addChocolates = 5;

		while (initialChocalateCount <= chocolateMaxLimit) {
			if ((initialChocalateCount + addChocolates) >= 63)
				break;
			else {
				initialChocalateCount += addChocolates;
				System.out.println("Current Chocolate count is :" + initialChocalateCount);
			}
		}
		System.out.println("Chocolate Capacity reached");
	}

}
