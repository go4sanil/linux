package getterSetter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MethodClass {

	ArrayList<String> myList;
	String wrongUserInput = "";
	String[][] arr1;
	char[] randomNameCharArray;
	String tempString = "";
	int counter = 0;
	int arrayColmLength = 2;
	int maxIncorrectInputLimit=5;
	Scanner scn = new Scanner(System.in);

	public void importStudentList() throws FileNotFoundException {

		Scanner s = new Scanner(new File("/home/sanil/Desktop/NameList.txt"));
		myList = new ArrayList<String>();
		while (s.hasNext()) {
			myList.add(s.next());
		}
		s.close();
	}

	public String randomStudentSelection() {

		Random r = new Random();
		int randomItem = r.nextInt(myList.size());
		String randomNameSelected = myList.get(randomItem);
		//System.out.println(randomNameSelected);
		return randomNameSelected;

	}

	public String[][] setStudentNameArray(String randomNameChoosen) {
		char[] randomNameCharArray = randomNameChoosen.toCharArray();
		int arr = randomNameChoosen.length();
		

		String[][] studentNameArray = new String[arr][arrayColmLength];

		for (int i = 0; i < studentNameArray.length; i++) {
			studentNameArray[i][0] = "*";
			studentNameArray[i][1] = String.valueOf(randomNameCharArray[i]);

		}
		return studentNameArray;
	}

	public String checkUserInputIsValid(String[][] arr1) {
		boolean result;
		String inputString = "";
		int stringLenght;
		int counter = 0;
		do {
			counter++;
			System.out.println("Guess a letter:");
			inputString = scn.next().toLowerCase();
			result = inputString.matches("[a-zA-Z]+");
			stringLenght = inputString.length();
			if (counter >= 5) {
				System.out.println("Too many attempts,progam is terminating.. better luck next time!");
				System.exit(0);
			}
			if (result && (stringLenght <= 1)) {
				return inputString;
			} else {
				System.out.println("You have entered an invalid input, please enter only 1 letter and try again!");
			}

		} while (!result || !(stringLenght <= 1) || (counter >= 5));
		return inputString;
	}

	public void getStudentNameArray(String[][] arr1)

	{

		for (int k = 0; k < arr1.length; k++) {
			System.out.print(arr1[k][0]);
		}
		counter = 0;
	}

	public boolean checkDuplicateEntry(String[][] randomNameCharArray, String inputString) {
		for (int i = 0; i < randomNameCharArray.length; i++) {

			tempString += randomNameCharArray[i][0];
		}
		if (tempString.contains(inputString)) {
			counter++;
			if (counter >= maxIncorrectInputLimit) {
				System.out.println("Too many attempts,progam is terminating.. better luck next time!");
				System.exit(0);
			}
			System.out.println("You have entered a duplicate value, please try again");
			return true;

		}
		tempString="";
		return false;
	}

	public boolean checkDuplicateEntry(String wrongInputStrings, String inputString) {

		if (wrongInputStrings.contains(inputString)) {
			counter++;
			if (counter >= maxIncorrectInputLimit) {
				System.out.println("Too many attempts,progam is terminating.. better luck next time!");
				System.exit(0);
			}
			System.out.println("You have entered a duplicate letter, please try again");
			return true;

		}tempString="";
		return false;
	}

	public boolean updateStudentNameArray(String inputString, String[][] updatedStudentArray) {
		boolean isInputCorrect = false;
		char[] nameToCharArray = inputString.toCharArray();

		for (int i = 0; i < nameToCharArray.length; i++) {
			for (int j = 0; j < updatedStudentArray.length; j++) {
				if (String.valueOf(nameToCharArray[i]).equals(updatedStudentArray[j][1])) {
					updatedStudentArray[j][0] = String.valueOf(nameToCharArray[i]);
					isInputCorrect = true;
				}
			}

		}
		return isInputCorrect;
	}

	public int wrongcounterCheck(int counter) {
		counter++;
		return counter;

	}

	public String concatWrongInputStrings(String wrongUserInput) {
		this.wrongUserInput += wrongUserInput + " ";
		return this.wrongUserInput;

	}

	public boolean hasPlayerWon(String[][] randomNameCharArray, String randomNameChosen) {
		for (int i = 0; i < randomNameCharArray.length; i++) {
			{
				tempString += randomNameCharArray[i][0];
			}
				
		}

		if (tempString.equals(randomNameChosen)) {
			System.out.println("You win!" + "\n" + "You have guessed " + randomNameChosen.toUpperCase() + " correctly");
			return true;
		}
		tempString = "";

		return false;
	}

}
