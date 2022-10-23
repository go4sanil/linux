
public class MilkBuyingProgramMethod {

	String isMilkAvailable = "yes";

	boolean getMilkDetails(String milkDetails) {
		if (isMilkAvailable.equals(milkDetails)) {
			return true;
		}
		return false;
	}
}