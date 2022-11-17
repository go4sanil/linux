package missionMarch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Simulation {

	public static void main(String args[]) {
		Simulation simulation = new Simulation();
		ArrayList<Item> data = simulation.loadItems();
		ArrayList<R1> r1Rockets = simulation.loadU1(data);
		Integer r1Cost = simulation.runSimulator(r1Rockets);
		System.out.println("Total cost for R1 fleet: $" + r1Cost + " Million");
		ArrayList<R2> r2Rockets = simulation.loadU2(data);
		Integer r2Cost = simulation.runR2Simulator(r2Rockets);
		System.out.println("Total cost for R2 fleet: $" + r2Cost + " Million");

	}

	public ArrayList<Item> loadItems() {

		ArrayList<Item> items = new ArrayList<>();
		try {
			File file = new File("/home/sanil/Desktop/phase-1.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			Pattern p = Pattern.compile("[0-9]+");
			Pattern c = Pattern.compile("[a-zA-Z]*[\\s]*[a-zA-Z]*");
			String line;
			while ((line = br.readLine()) != null) {
				Item item = new Item();
				Matcher m = p.matcher(line);
				Matcher m1 = c.matcher(line);
				while (m.find() && m1.find()) {
					item.setName(m1.group());
					item.setWeight(Integer.parseInt(m.group()));
					items.add(item);
				}
				fr.close();
			}
		} catch (IOException e) {
			// e.printStackTrace();
		}
		return items;
	}

	public ArrayList<R1> loadU1(ArrayList<Item> items) {
		ArrayList<R1> r1Rockets = new ArrayList<>();
		R1 r1 = new R1();
		r1.rocketWeight = 10000;
		r1.totalWeight = r1.rocketWeight;
		r1.maxWeight = 18000;
		boolean newRocketNeeded;
		for (Item item : items) {
			newRocketNeeded = false;
			if (r1.canCarry(item)) {
				r1.carry(item);
				if (!r1Rockets.contains(r1)) {
					r1Rockets.add(r1);
				}
			} else {
				for (R1 rocket : r1Rockets) {
					if (rocket.canCarry(item)) {
						rocket.carry(item);
						newRocketNeeded = false;
						break;
					} else {
						newRocketNeeded = true;
					}
				}
			}
			if (newRocketNeeded) {
				r1 = new R1();
				r1.rocketWeight = 10000;
				r1.totalWeight = r1.rocketWeight;
				r1.maxWeight = 18000;
				if (item.getWeight() < r1.totalWeight) {
					r1.carry(item);
					if (!r1Rockets.contains(r1)) {
						r1Rockets.add(r1);
					}
				}
			}
		}
		System.out.println("No. of Rockets - " + r1Rockets.size());
		return r1Rockets;
	}

	public ArrayList<R2> loadU2(ArrayList<Item> items) {
		ArrayList<R2> r2Rockets = new ArrayList<>();
		R2 r2 = new R2();
		r2.rocketWeight = 18000;
		r2.totalWeight = r2.rocketWeight;
		r2.maxWeight = 29000;
		boolean newRocketNeeded;
		for (Item item : items) {
			newRocketNeeded = false;
			if (r2.canCarry(item)) {
				r2.carry(item);
				if (!r2Rockets.contains(r2)) {
					r2Rockets.add(r2);
				}
			} else {
				for (R2 rocket : r2Rockets) {
					if (rocket.canCarry(item)) {
						rocket.carry(item);
						newRocketNeeded = false;
						break;
					} else {
						newRocketNeeded = true;
					}
				}
			}
			if (newRocketNeeded) {
				r2 = new R2();
				r2.rocketWeight = 18000;
				r2.totalWeight = r2.rocketWeight;
				r2.maxWeight = 29000;
				if (item.getWeight() < r2.totalWeight) {
					r2.carry(item);
					if (!r2Rockets.contains(r2)) {
						r2Rockets.add(r2);
					}
				}
			}
		}
		System.out.println("No. of Rockets - " + r2Rockets.size());
		return r2Rockets;
	}

	public Integer runSimulator(ArrayList<R1> rockets) {
		Integer cost = testLaunchLand(rockets, rockets.size());
		return cost;
	}

	public Integer testLaunchLand(ArrayList<R1> rockets, Integer count) {
		ArrayList<R1> failedRockets = new ArrayList<>();
		for (R1 rocket : rockets) {
			if (!(rocket.launch(rocket) && rocket.land(rocket))) {
				count++;
				failedRockets.add(rocket);
			}
		}
		if (failedRockets.size() > 0)
			return testLaunchLand(failedRockets, count);
		else {
			System.out.println("No. of Attempts - " + count);
			return count * 100;
		}
	}

	public Integer runR2Simulator(ArrayList<R2> rockets) {
		Integer cost = testR2LaunchLand(rockets, rockets.size());
		return cost;
	}

	public Integer testR2LaunchLand(ArrayList<R2> rockets, Integer count) {
		ArrayList<R2> failedRockets = new ArrayList<>();
		for (R2 rocket : rockets) {
			if (!(rocket.launch(rocket) && rocket.land(rocket))) {
				count++;
				failedRockets.add(rocket);
			}
		}
		if (failedRockets.size() > 0)
			return testR2LaunchLand(failedRockets, count);
		else {
			System.out.println("No. of Attempts - " + count);
			return count * 120;
		}
	}
}