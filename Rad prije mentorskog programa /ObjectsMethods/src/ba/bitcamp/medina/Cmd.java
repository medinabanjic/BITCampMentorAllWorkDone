package ba.bitcamp.medina;

public class Cmd {

	public static void main(String[] args) {
		

		System.out.println("Duzina niza je: " + args.length);
		
		for(int i = 0; i < args.length; i++){
			
			System.out.println(args[i]);
		}

	}

}
