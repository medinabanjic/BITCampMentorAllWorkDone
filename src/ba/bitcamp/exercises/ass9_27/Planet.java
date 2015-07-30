package ba.bitcamp.exercises.ass9_27;

import java.util.Arrays;
import java.util.Comparator;

public class Planet implements Comparable<Planet> {

	private String name;
	private Double diameter;
	private Double mass;
	private Double starDistance;

	public Planet(String name, double diameter, double mass, double starDistance) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.mass = mass;
		this.starDistance = starDistance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getStarDistance() {
		return starDistance;
	}

	public void setStarDistance(double starDistance) {
		this.starDistance = starDistance;
	}

	public static void sortByName(Planet[] planets) {
		Arrays.sort(planets, new Comparator<Planet>() {

			@Override
			public int compare(Planet o1, Planet o2) {
				return o1.name.compareTo(o2.name);
			}

		});
	}
	
	public static void sortByDiameter(Planet[] planets){
		Arrays.sort(planets, new Comparator<Planet>(){

			@Override
			public int compare(Planet o1, Planet o2) {
				return o2.diameter.compareTo(o1.diameter);
			}
			
		});
	}
	
	public static void sortByMass(Planet[] planets){
		Arrays.sort(planets, new Comparator<Planet>(){

			@Override
			public int compare(Planet o1, Planet o2) {
				return o2.mass.compareTo(o1.mass);
			}
			
		});
	}
	
	public static void sortByStarDistance(Planet[] planets){
		Arrays.sort(planets, new Comparator<Planet>(){

			@Override
			public int compare(Planet o1, Planet o2) {
				return o2.starDistance.compareTo(o1.starDistance);
			}
			
		});
	}

	@Override
	public String toString() {
		return name + "-" + diameter + " km,  " + mass + " times Earth mass, "
				+ starDistance + " AU";
	}

	@Override
	public int compareTo(Planet o) {
		return this.name.compareTo(o.name);
	}
	
	public static void main(String[] args) {
		Planet[] p = new Planet[5];
		p[0] = new Planet("Mercury", 25.4, 0.2, 54);
		p[1] = new Planet("Venus", 45, 1.4, 20);
		p[2] = new Planet("Mars", 30, 0.8, 17);
		p[3] = new Planet("Jupiter", 80, 3.4, 31);
		p[4] = new Planet("Pluto", 10, 0.1, 12);
		
		sortByName(p);
		sortByDiameter(p);
		
		for(Planet value : p){
			System.out.println(value.toString());
		}
		System.out.println();
	}

}
