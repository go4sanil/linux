
public class phonePlanSelectionMethodClass {

	int phonePrice=0;
	int planPrice = 0;
	int agePoints=0;

	int calculatePhonePrice(String concat) {

		String phoneModelArray[][] = { { "samsungs22", "25" }, { "samsungs22+", "35" }, { "samsungs22ultra", "55" },
				{ "samsungs22fe", "20" }, { "appleiphone14", "30" }, { "appleiphone14pro", "40" },
				{ "appleiphone14promax", "65" }, { "appleiphone14min", "25" } };

		for (int i = 0; i < phoneModelArray.length; i++) {
			if ((phoneModelArray[i][0]).equals(concat)) {
				phonePrice = Integer.valueOf(phoneModelArray[i][1]);
				break;
			}
		}
		return phonePrice;
	}

	int calculatePlanPrice(String phonePlan) {
		if (phonePlan.equals("rogers")) {
			planPrice = 70;

		}

		else if (phonePlan.equals("bell")) {
			planPrice = 80;

		}

		else {
			planPrice = 75;

		}
		return planPrice;
	}

	
	
}
