package getterSetter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

	public void importStudentList() throws IOException {
		
		
		//Scanner s = new Scanner(new File("/home/sanil/Desktop/NameList.txt"));
		BufferedReader br = new BufferedReader(new FileReader("/home/sanil/Desktop/NameList.txt"));
		Pattern p = Pattern.compile("[0-9]");
		String line = br.readLine();
		while(line!=null)
		{Matcher m = p.matcher(line);
		while(m.find())
		{System.out.println(m.group());}
		line=br.readLine();	
		}
		}

}
