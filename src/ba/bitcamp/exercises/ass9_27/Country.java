package ba.bitcamp.exercises.ass9_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;

public class Country {

	private String name;
	private Integer population;
	private Double area;
	
	public Country(String name, Integer population, Double area) {
		super();
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public enum SortDetails {
		NAME, POPULATION, AREA;
	};
	
	
	
	public static ArrayList<Country> sortList(ArrayList<Country> countries, EnumSet<SortDetails> sortBy){
		
		Collections.sort(countries, new Comparator<Country>(){

			@Override
			public int compare(Country o1, Country o2) {
				if(sortBy.contains("NAME")){
					return o1.name.compareTo(o2.name);
				} 
				if(sortBy.contains("POPULATION")){
					return o1.population.compareTo(o2.population);
				} 
				if(sortBy.contains("AREA")){
					return o1.area.compareTo(o2.area);
				}
				return 0;
			}
			
		});
		return countries;
			}


	public static void main(String[] args) {
		ArrayList<Country> countries = new ArrayList();
		countries.add(new Country("Mongolija", 540000, 1201.54));
		countries.add(new Country("Armenija", 456000, 11121.54));
		countries.add(new Country("Utopija", 5, 124.5));

		
		System.out.println();

	}

}
