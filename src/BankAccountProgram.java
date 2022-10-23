import java.util.Scanner;

public class BankAccountProgram {

	public static void main(String[] args) {

		BankAccountProgramMethods accnt1 = new BankAccountProgramMethods(123456, 1234, 3524.25);
		BankAccountProgramMethods accnt2 = new BankAccountProgramMethods(612345, 6123, 4524.25);
		BankAccountProgramMethods accnt3 = new BankAccountProgramMethods(561234, 5612, 6524.25);
		BankAccountProgramMethods accnt4 = new BankAccountProgramMethods(456123, 4561, 7524.25);
		BankAccountProgramMethods accnt5 = new BankAccountProgramMethods(345612, 3456, 8524.25);

		BankAccountProgramMethods[] bankAccountArray = { accnt1, accnt2, accnt3, accnt4, accnt5 };
		BankAccountProgramMethods bankaccountdetails = new BankAccountProgramMethods();

		Scanner scn = new Scanner(System.in);
		boolean exitLoop = false;
		double currentBalance = 0;
		int counter = 0;
		double userInputDepositAmount = 0;
		double updatedBalance=0;
		do {
			System.out.println("Please enter your account number :");
			int userInputAccountNumber = scn.nextInt();
			System.out.println("Please enter your account pin :");
			int userInputAccountPin = scn.nextInt();
			counter++;
			for (int i = 0; i < bankAccountArray.length; i++) {

				if (userInputAccountNumber == bankAccountArray[i].accntNumber
						&& userInputAccountPin == bankAccountArray[i].accntpIN) {
					currentBalance = bankAccountArray[i].accntBalance;
					System.out.println(currentBalance);
					System.out.println("Would you like to deposit or withdraw money: Please input:('Deposit'/'Withdraw')");
					String userInputDepositOrWithdraw = scn.next();
					System.out.println("Please enter the amount you would like to "+userInputDepositOrWithdraw);
					userInputDepositAmount = scn.nextInt();
					
					do{ if (userInputDepositOrWithdraw.equalsIgnoreCase("Deposit")&& userInputDepositAmount<currentBalance) {
						updatedBalance = bankaccountdetails.accountDeposit(userInputDepositAmount, currentBalance);
						bankAccountArray[i].accntBalance = updatedBalance;
						System.out.println("UPdated deposit balance"+updatedBalance); break;}
					
					else if(userInputDepositOrWithdraw.equals("Withdraw"))
							
					{while(userInputDepositAmount>currentBalance) 
					{System.out.println("The withdrawal amount is greated than total balance, please enter an amount lesser than account balance");
					userInputDepositAmount = scn.nextInt();
					counter++;}
					if(userInputDepositAmount<currentBalance)
					{updatedBalance = bankaccountdetails.accountWithdrawal(userInputDepositAmount, currentBalance);
					bankAccountArray[i].accntBalance = updatedBalance; }
					System.out.println("UPdated withdraw balance"+updatedBalance);break;}}
					
					while(!(userInputDepositOrWithdraw.equals("Withdraw"))|| !userInputDepositOrWithdraw.equals("Deposit"));
					
					exitLoop = true;
					break;
				}

				else if (counter > 3) {
					System.out.println("You have reached the maximum limit,your account has been locked");
					System.exit(0);
				}
			}
		} while (!exitLoop);
		
	
		}
	}


