package polymorPhism;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import marsSimulationJavaProject.Item;

public class test{

	public void importStudentList() throws FileNotFoundException {

		Scanner s = new Scanner(new File("/home/sanil/Desktop/NameList.txt"));
		myList = new ArrayList<String>();
		while (s.hasNext()) {
			myList.add(s.next());
		}
		s.close();
	}}}