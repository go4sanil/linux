
public class BankAccountProgramMethods {
 int accntNumber;
 int accntpIN;
 double accntBalance,updatedBalance;
 
 BankAccountProgramMethods(int accountNumber, int accountPin, double accountBalance)
 {
	 accntNumber=accountNumber;
	 accntpIN=accountPin;
	 accntBalance=accountBalance;
 }
 BankAccountProgramMethods()
 {}
 
 double accountDeposit(double depositAmount, double accountBalance)
 {
	 updatedBalance = accountBalance+depositAmount;
	 return updatedBalance;
 }
 
 double accountWithdrawal(double withdrawalAmount, double accountBalance)
 {
	 updatedBalance = accountBalance-withdrawalAmount;
	 return updatedBalance;
 }
 
}
