package marsSimulationJavaProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestData {
	ArrayList<Item> items;

	public static void main(String[] args) throws IOException {

		String input = "";
		BufferedReader br = new BufferedReader(new FileReader("/home/sanil/Desktop/NewSchool.txt"));
		Pattern p = Pattern.compile("[0-9]+");
		Pattern c = Pattern.compile("[a-zA-Z]*[\\s]*[a-zA-Z]*");
		ArrayList<Item> items = new ArrayList<Item>();
		String line = br.readLine();
		while (line != null) {
			Matcher m = p.matcher(line);
			Matcher m1 = c.matcher(line);
			while (m.find() && m1.find()) {
				String name = m1.group();
				int weight = Integer.parseInt(m.group());
				// System.out.println(m1.group() +" " +m.group());
				items.add(new Item(name, weight));
			}

			line = br.readLine();

			// System.out.println(items);
			// System.out.println(items.stream().mapToInt(Item::weight).sum());
			// https://www.youtube.com/watch?v=tlS9S97CPAk
			Simulation simulation = new Simulation();
			simulation.loadU1();

		}
	}

}
