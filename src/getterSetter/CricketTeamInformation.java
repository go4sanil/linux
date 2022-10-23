package getterSetter;

public class CricketTeamInformation {

	String cricketerFirstName;
	String cricketerSecondName;
	String cricketerTeamNumber;
	private int cricketerAge;
	String cricketerEmail;
	
	public CricketTeamInformation(String employeeFirstName, String employeeSecondName, String employeeNumber,
			int employeeAge, String employeeEmail) {
		this.cricketerFirstName = employeeFirstName;
		this.cricketerSecondName = employeeSecondName;
		this.cricketerTeamNumber = employeeNumber;
		this.cricketerAge = employeeAge;
		this.cricketerEmail = employeeEmail;

	}

	void setSecondName(String employeeSecondName) {
		this.cricketerSecondName = employeeSecondName;
	}

	void getSecondName() {
		System.out.println(this.cricketerSecondName);
	}

	void setAgeofEmployee(int newAge, String Administrator)

	{
		if (Administrator.equals("Administrator")) {
			this.cricketerAge = newAge;
			System.out.println("The new age of" + this.cricketerFirstName + " is  " + this.cricketerAge);
		} else {
			System.out.println("You donot have the admin privilages to make this change");
		}

	}

	void getEmailid() {
		System.out.println(this.cricketerEmail);
	}
}
