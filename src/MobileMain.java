import java.util.Scanner;

public class MobileMain {

	public static void main(String[] args) {
		MobilePhoneModels s22 = new MobilePhoneModels("Android", "Samsung", 5.5);
		MobilePhoneModels iPhone14 = new MobilePhoneModels("IOS", "Apple", 5.7);
		MobilePhoneModels pixel6 = new MobilePhoneModels("Android", "Google", 6.2);
		MobilePhoneModels lumia10 = new MobilePhoneModels("Symbian", "Nokia", 5.0);

		MobilePhoneModels[] mobilePhoneModels = { s22, iPhone14, pixel6,lumia10 };

		//s22.switchOnMobilePhone();
		//iPhone14.switchOnMobilePhone();

		//pixel6.switchOnMobilePhone();
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Which phone you want to switch on");
		//String brandPhoneEntered = sc.next();

		for (int i = 0; i < mobilePhoneModels.length; i++) {
			mobilePhoneModels[i].switchOnMobilePhone();
			 
			}
		

		lumia10.printOperatingSysstem("Windows");

	}

}
