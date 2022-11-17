package polymorPhism;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		String MobileNumber = "7575757575";
		Matcher m = p.matcher(MobileNumber);
		if (m.find() && m.group().equals(MobileNumber)) {
			System.out.println("Valid mobile NUmber");
		} else {
			System.out.println("invalid mobile number");
		}

	}
}