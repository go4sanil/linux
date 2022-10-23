import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		 
		BankAccount rohit = new BankAccount("123456",10, 1234);
		BankAccount virat = new BankAccount("123457",20, 1235);
		BankAccount rishab = new BankAccount("123458",30, 1236);
		BankAccount rahul = new BankAccount("123459",40, 1237);
		BankAccount surya = new BankAccount("123450",50,1238);
		
		BankAccount[] bankaccount = {rohit,virat,rishab,rahul,surya};
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter your account number  :");
		String accountNum = scn.next();
		System.out.println("Please enter your pin  :");
		int accountPin = scn.nextInt();
		double arrayAccountBalance=0;
		
		AnotherClass anotherclass = new AnotherClass();
		
		anotherclass.accountCrednetials(accountNum, accountPin);
		
			
}}
