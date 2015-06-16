import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Napisati program gdje korisnik unosi vrijednosti u a i b, koje su
		// tipa int. Izračunati količnik,

		// tj. a/b. Napisati program tako da sređuje svaki exception koji se
		// može desiti. Jedan od
		//
		// exceptiona koji se mogu desiti je da korisnik unese slova umjesto
		// brojeva za a i b. U tom
		//
		// slučaju je potrebno upozoriti korisnika i dopustiti mu da ponovo
		// unese vrijednosti.

		for (int i = 1; i > 0; i++) {
			try {
				System.out.println("Input a: ");
				int a = in.nextInt();
				System.out.println("Input b: ");
				int b = in.nextInt();
				double c = (double) a / b;
				System.out.println(c);
				System.out.println("Do you want a new calculation?"
						+ " If yes enter 1, if no enter 0: ");
				int d = in.nextInt();
				
				if (d == 1){
					continue;
				}
				else if (d == 0){
					break;
				}
						
				
			} catch (InputMismatchException e) {
				System.out
						.println("You entered a wrong format. Input numbers.");
			}
		}

		// try{
		//
		// String something = null;
		// something.endsWith("jdhofosdfi");
		// }catch(NullPointerException e){
		// System.out.println("Sta hoces ti ba da uradis, sto se ba provaljujes, idi kuci.");
		// }

		// try{
		//
		// TextIO.readFile("");
		// }catch(IllegalArgumentException e){
		//
		// System.out.println("Not a valid file.");
		// }
		//

		// try{
		// System.out.println("Input a and b:");
		// int a = in.nextInt();
		// int b = in.nextInt();
		//
		// int c = a / b;
		//
		// System.out.println(c);
		// }catch(ArithmeticException e){
		// System.out.println("You cannot divide by 0.");
		// }

		// try {
		// System.out.println("Input: ");
		// String something= in.nextLine();
		// int somethingInt = Integer.parseInt(something);
		// System.out.println(somethingInt);
		//
		// }catch(NumberFormatException e){
		//
		// System.out.println("Your string is in a bad format so it cannot be converted.");
		// }

		//
		// try{
		//
		// System.out.println("Input month from January to December in format ex: 4 : ");
		// int month = in.nextInt();
		// System.out.println(month + "is fine.");
		// } catch(InputMismatchException e){
		// System.out.println("I catched it, you have to input a number between 1 and 12, not letters.");
		// }

		in.close();

	}

}
