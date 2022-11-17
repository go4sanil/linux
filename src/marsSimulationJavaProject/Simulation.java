package marsSimulationJavaProject;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Iterator;

public class Simulation {

	ArrayList<Item> items;
	int temp;

	public ArrayList<Item> loadItems() throws IOException {

		String input = "";
		Rocket rocket = new Rocket();
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
			// temp = items.stream().mapToInt(Item::weight).sum();}

		}
		/*
		 * for (int i = 0; i < items.size(); i++) {
		 * System.out.println(items.get(i).name); System.out.println(i); }
		 */
		return items;
	}

	public void loadU1() throws IOException {
		ArrayList<Item> items = loadItems();
		int weightCounter = 0;
		ArrayList<tempR1> r1TempObjects = new ArrayList<tempR1>();
		ArrayList<R1> r1Objects = new ArrayList<R1>();
		int count = 0;
		int dd = 17000;
		// temp=items.stream().mapToInt(Item::weight).sum();
		Rocket rocket = new Rocket();
		while (!items.isEmpty()) {
			for (Item i : items) {
				{	if(rocket.canCarry(i))
					if (dd > weightCounter) {
						
						System.out.println(i.name+i.weight);
						r1TempObjects.add(new tempR1((i.name), (i.weight)));
						weightCounter = weightCounter + (i.weight);
						count++;
						//System.out.println(count);
						//System.out.println(weightCounter);
						System.out.println("________________________________");
					} else {
						break;
					}
				}
			}
			weightCounter = 0;

			if (!items.isEmpty())  {

				for (int i = 0; i < count; i++) {
					System.out.println(items.size());
					System.out.println("going to remove" + i);
					if (!items.isEmpty()) {items.remove(0);}
					else {break;}
				}
				System.out.println("________________________________");
							}
			
			count = 0;
			r1Objects.add(new R1(r1TempObjects));
			System.out.println("New R1 array size is" +r1Objects.size());
			

			for (int i = 0; i < r1TempObjects.size(); i++) {
				System.out.println(r1TempObjects.getClass());
				System.out.println("going to remove" + i);
				if (!items.isEmpty()) {items.remove(0);}
				else {break;}
		}
		// return r1Objects;
	}}

	public ArrayList<R2> loadU2() throws IOException {
		ArrayList<Item> items = loadItems();
		int weightCounter = 0;
		ArrayList<R2> r2Objects = new ArrayList<R2>();
		int dd = 29000;
		// temp=items.stream().mapToInt(Item::weight).sum();

		for (int i = 0; i < items.size(); i++) {
			// weightCounter = r1Objects.get(i).weight;
			if (dd > weightCounter) {
				r2Objects.add(new R2(items.get(i).name, items.get(i).weight));
				weightCounter = weightCounter + (r2Objects.get(i).weight);
			}
		}
		/*
		 * for (int i = 0; i < items.size(); i++) {
		 * System.out.println(r1Objects.get(i).name);
		 * System.out.println(r1Objects.get(i).weight); System.out.println(i); }
		 */

		return r2Objects;
	}

	public void runSimulation() throws IOException {
		ArrayList<R1> r1rockets = loadU1();
		ArrayList<R2> r2rockets = loadU2();

		Rocket rocket1 = new R1(r1rockets);
		 rocket1.launch();
		 rocket1.land();
	

		/*
		 * cars.add(new Car("BMW", 52400));
		 * 
		 * 
		 * this method takes an ArrayList of Rockets and
		 * calls 'launch' and 'land' methods for each of the rockets in the ArrayList.
		 * Every time a rocket explodes or crashes (i.e if 'launch' or 'land' return
		 * false) it will have to send that rocket again. All while keeping track of the
		 * total budget required to send each rocket safely to
		 * Mars. 'runSimulation' then returns the total budget required to send all
		 * rockets (including the crashed ones).
		 */
	}
}
