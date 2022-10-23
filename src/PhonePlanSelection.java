import java.util.Scanner;

public class PhonePlanSelection {

	public static void main(String[] args) {
		int phoneBrandCounter = 0;
		int phoneModelCounter = 0;
		int phonePlanCounter = 0;
		String phoneModel,phoneBrand;
		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter the Brand that you want to choose from (Apple/Samsung):");
		phoneBrand = scn.next().toLowerCase();
		while (!phoneBrand.equals("apple") && !phoneBrand.equals("samsung")) {
			System.out.println(
					"The brand you have entered is incorrect or not available; please choose from Samsung or Apple:");
			phoneBrand = scn.next().toLowerCase();
			phoneBrandCounter++;

			if ((!phoneBrand.equals("samsung") &&!phoneBrand.equals("apple")) && phoneBrandCounter >= 2) {
				System.out.println("Program terminated, please talk to customer desk");
				System.exit(0);
			}
		}

		if (phoneBrand.equals("samsung")) {
			System.out.println("Please enter the model that you want to buy from below\r\n" + "S22\r\n" + "S22+\r\n"
					+ "S22Ultra\r\n" + "S22FE\r\n");
			phoneModel = scn.next().toLowerCase();
			while (!phoneModel.equals("s22") && !phoneModel.equals("s22+") && !phoneModel.equals("s22ultra")
					&& !phoneModel.equals("s22fe")) {
				System.out.println(
						"The Model you have entered is incorrect or not available; please choose from from below\r\n"
								+ "S22\r\n" + "S22+\r\n" + "S22Ultra\r\n" + "S22FE\r\n");
				phoneModel = scn.next().toLowerCase();
				phoneModelCounter++;

				if ((!phoneModel.equals("s22") && !phoneModel.equals("s22+") && !phoneModel.equals("s22ultra")
						&& !phoneModel.equals("s22fe")) && phoneModelCounter >= 2) {
					System.out.println("Program terminated, please talk to customer desk");
					System.exit(0);
				}
			}
		} else {
			System.out.println("Please enter the model that you want to buy from below\r\n" + "iPhone14\r\n"
					+ "iPhone14pro\r\n" + "iPhone14proMax\r\n" + "iPhone14min\r\n" + "");
			
			 phoneModel = scn.next().toLowerCase();
			while ((!phoneModel.equals("iphone14"))  && (!phoneModel.equals("iphone14pro"))  && (!phoneModel.equals("iphone14promax"))
					 && (!phoneModel.equals("iphone14min"))) {
				System.out.println("The model you have enter is incorrect or not available; Please enter the model that you want to buy from below\r\n" + "iphone14\r\n"
						+ "iphone14pro\r\n" + "iphone14promax\r\n" + "iphone14min\r\n" + "");
				phoneModel = scn.next().toLowerCase();
				phoneModelCounter++;
				if (!phoneModel.equals("iphone14") && !phoneModel.equals("iphone14pro")  && !phoneModel.equals("iphone14promax")
						 && !phoneModel.equals("iphone14min") && phoneModelCounter >= 2) {
					
					System.out.println("Program terminated, please talk to customer desk");
					System.exit(0);}}		
		}

		System.out.println("Please select the plan that you want to opt for: Rogers/Telus/Bell");
		String phonePlan = scn.next().toLowerCase();
		while (!phonePlan.equals("rogers") && !phonePlan.equals("telus") && !phonePlan.equals("bell")) {
			System.out.println("The plan you have entered is incorrect or not available; Please chose from the following service providers:Rogers/Telus/Bell");
			phonePlan = scn.next().toLowerCase();
			phonePlanCounter++;
			if (!phonePlan.equals("rogers") && !phonePlan.equals("telus") && !phonePlan.equals("bell") && phonePlanCounter >= 2) {
				
				System.out.println("Program terminated, please talk to customer desk");
				System.exit(0);}}		

		String concat = phoneBrand + phoneModel;
		phonePlanSelectionMethodClass mwd = new phonePlanSelectionMethodClass();
		int finalPrice = mwd.calculatePhonePrice(concat);
		int planPrice = mwd.calculatePlanPrice(phonePlan);

		System.out.println("You have selected" + " " + phoneModel + " with " + phonePlan + " plan");
		System.out.println("Your Phone Tab will be : $" + finalPrice);
		System.out.println("Your monthly plan will be : $" + planPrice);
		System.out.println("Total Monthly Amount : $" + (finalPrice + planPrice));
	}
}