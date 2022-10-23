
public class AnotherClass {

	void accountCrednetials(String accountNum, int accountPin)
	{
		for( int i=0; i<bankaccount.length;i++)
		{
	if(accountNum.equals(bankaccount[i].accountNumber) && (accountPin == bankaccount[i].accountPin))
			{arrayAccountBalance = bankaccount[i].accountBalance; }
		System.out.println(arrayAccountBalance);
		break;
			}
	
	}
	
	
}
