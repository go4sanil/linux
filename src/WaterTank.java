
/* 7.	There is a water tank of capacity 100 litres. Water is filled into it using bucket which have capacity of 10 litres.  Write a program which fills the tank to its capacity using these buckets. Also include a mechanism in your program to stop the tank from over flowing.*/

public class WaterTank {

	public static void main(String[] args) {
		int waterTankCapacity = 100;
		int bucketCapacity = 0;
		int intitalTankValue = 23;

		if (bucketCapacity < waterTankCapacity)
			bucketCapacity = bucketCapacity + intitalTankValue;
		{
			while ((bucketCapacity + 10) < waterTankCapacity) {
				bucketCapacity += 10;
				System.out.println("Current Tank Capacity is :" + bucketCapacity);
			}
			{
				System.out.println("Tank Capacity reached");
			}
		}

	}
}
