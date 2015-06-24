package ba.bitcamp.exercises.ass8;

public abstract class Building  {

	public String location;
	public int population;
	public int area;
	
	public double getPopulationDensity(){
		 double density = ((double)area / population);
		 return density;
	}
	
}
