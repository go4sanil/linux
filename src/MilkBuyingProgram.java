import java.util.Scanner;

public class MilkBuyingProgram {

	public static void main(String[] args) {

		System.out.println("Is milk available in the shop: (yes/no)");
		Scanner scn = new Scanner(System.in);
		String isMilkAvailable = scn.next();

		MilkBuyingProgramMethod milkBuyingMethod = new MilkBuyingProgramMethod();

		System.out.println(milkBuyingMethod.getMilkDetails(isMilkAvailable));

	}

}
