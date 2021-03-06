package ba.bitcamp.homework01.assignment02;

public class Animal {

	private String name;
	private Integer active;
	private Integer needsWater;
	private Integer dayOrNight;
	private static Integer howMuchWater;

	public Animal(String name, Integer active, Integer needsWater) {
		super();
		this.name = name;
		this.active = active;
		this.needsWater = needsWater;
		this.dayOrNight = 1;
		this.howMuchWater = 1;
	}

	/**
	*This method changes day to night, and reverse.
	*/
	public void changeDayOrNight() {
		if (dayOrNight == 0) {
			dayOrNight = 1;
		} else {
			dayOrNight = 0;
		}
	}

	/**
	*This method sets water in habitat.
	*/
	public static void setHowMuchWater(int n) {
		howMuchWater = n;
	}

	/**
	*This method prints animal condition. What animal needs and does habitat have it.
	*/
	public void printAnimalConditions() {

		if (dayOrNight == active && howMuchWater >= needsWater) {
			System.out
					.println("It is fine. The animal is active and has water.");
		}

		else if (dayOrNight == active && howMuchWater < needsWater) {
			System.out
					.println("The animal is active, but does not have enough water.");
		}

		else if (dayOrNight != active && howMuchWater >= needsWater) {
			System.out
					.println("The animal is not active, but has enough water.");
		} else if (dayOrNight != active && howMuchWater < needsWater) {
			System.out
					.println("The animal is not active, and it does not have enough water.");
		}
	}

}
