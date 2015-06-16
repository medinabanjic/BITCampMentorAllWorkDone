package ba.bitcamp.medina.varijable;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sideA= 5;
		int sideB= 7;
		float PI= 3.14F;
		int rCircle= 5;
		
		
		int scopeRectangle= 0;
		int areaRectangle= 0;
		
		scopeRectangle= 2*sideA + 2*sideB; // This is the formula for a rectangle scope
		areaRectangle= sideA*sideB; // This is the formula for a rectangle area
		
		double scopeCircle= 0; 
		double areaCircle= 0;
		
		scopeCircle= 2*rCircle*PI; // This is the formula for a circle scope
		areaCircle= rCircle*rCircle*PI; // This is the formula for a circle scope
		
		System.out.printf("Povrsina pravougonika sa stranicama 5 i 7 je %d a obim je %d. \n", areaRectangle, scopeRectangle);
		System.out.printf("Povrsina kruga sa poluprecnikom 5 je %.2f a obim je %.2f.", areaCircle, scopeCircle);
		
		
	}

}
