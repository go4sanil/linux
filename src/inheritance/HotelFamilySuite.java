package inheritance;

public class HotelFamilySuite extends HotelMain  {
	

	private int ratePerNight = 230;
	String suiteSelection = "HotelFamilySuite";
		
	public void finalPrice() {
		
		needFreeBreakfast();
		noOfDaysOfStay();
		
		System.out.println("The total amount you will be charged is:");
		System.out.println(this.suiteSelection + " @ " + super.hotelNumOfStays + " nights :"+(super.hotelNumOfStays*this.ratePerNight) +"$");
		int totalPriceFreeBreakfast=priceFreeBreakfast();
		int totalPrice = totalPriceFreeBreakfast + (super.hotelNumOfStays*this.ratePerNight);
		System.out.println("Total Price :" +totalPrice +"$" );
		System.out.println("HST	@ 18%   :" +(totalPrice*.18) +"$");
		System.out.println("Final Price	:" +(totalPrice*1.18) +"$");
	}

	
	
	
}