package ba.bitcamp.exercises.ass8;

public class Main {

	public static void main(String[] args) {
		
		University u = new University();
		u.name = "IUS";
		u.isItPublic = false;
		u.numberOfFaculties = 3;
		u.numberOfStuff = 200;
		u.area = 1040;
		u.location = "Butmirska 12.";
		u.population = 800;
		System.out.println(u.getPopulationDensity());
		
		Hospital h = new Hospital();
		h.area = 500;
		h.population = 400;
		h.hasCTmachine = false;
		h.numberOfBeds = 50;
		h.isItPublic = true;
		h.numberOfSurrgeons = 3;
		h.location = "Kranjceviceva 2.";
		System.out.println(h.getPopulationDensity());
		
		Jail j = new Jail();
		j.area = 1000;
		j.population = 140;
		u.location = "Butmirska 1.";
		j.hasGym = false;
		j.numberOfCells = 200;
		j.numberOfFreeCells = 50;
		j.securityLevel = 5;
		System.out.println(j.getPopulationDensity());
		
	}

}
