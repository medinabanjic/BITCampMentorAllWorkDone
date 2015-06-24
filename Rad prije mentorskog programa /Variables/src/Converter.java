
public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int meters= 33000;
		
		System.out.println(meters + "[m] \n" + meters / 1000 + "[km] \n" + meters*1000 + "[mm] "); 
		System.out.println(meters*3.2808399 + "[feet] \n" + meters*0.02540 + "[inch]" );
		
		
		int Celsious= 28;
		
		System.out.println("Celsious 28:\n" + ((Celsious * 9 / 5) + 32) + "[Fahrenheits]");
		System.out.println((Celsious + 273.15) + "[Kelvin]");		
		
		int Fahrenheits= 99;
		
		System.out.println("Fahrenheits 99:\n" + ((Fahrenheits - 32) * 5 / 9) + "[Celsious]");
		System.out.println(((Fahrenheits + 459.67) * 5 / 9) + "[Kelvin]");
		
		int angle= 90;
		
		System.out.println((double)((angle * ( Math.PI / 180))) + "radijan");
		
		

	}

}
