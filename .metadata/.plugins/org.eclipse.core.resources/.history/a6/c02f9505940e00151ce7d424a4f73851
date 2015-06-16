import java.util.Arrays;
import java.util.Scanner;

public class MladenInput {

	public static String inputCurrency1() {
		TextIO.readFile("src/Currency.txt");
		System.out.println("Currency list:");
		while (!TextIO.eof()) {
			String s = TextIO.getln();
			String[] parts = s.split(" ");
			String part1 = parts[0];

			System.out.println(part1);
		}
		TextIO.readStandardInput();
		Scanner in = new Scanner(System.in);
		String currency1 = in.nextLine();
		in.close();
		return currency1;
	}

	public static double inputMoney() {

		Scanner in = new Scanner(System.in);
		System.out.println("How much money do you want to convert:");
		double value = in.nextDouble();
		in.close();
		return value;

	}

	public static void getValue(String[] valute, double[] value) {

		int counter = 0;
		TextIO.readFile("src/Currency.txt");
		while (!TextIO.eof()) {

			TextIO.getln();
			counter++;

		}

		TextIO.readStandardInput();
		TextIO.readFile("src/Currency.txt");

		for (int i = 0; i < counter; i++) {

			String valuteName = TextIO.getln();
			String[] parts = valuteName.split(" ");
			String part1 = parts[0];

			valute[i] = part1;

		}

		TextIO.readStandardInput();
		TextIO.readFile("src/Currency.txt");

		for (int i = 0; i < counter; i++) {

			String value$ = TextIO.getln();
			String[] parts = value$.split(" ");
			double part2 = Double.parseDouble(parts[1]);

			value[i] = part2;

		}

		TextIO.readStandardInput();

	}

	public static int getIndex(String currency1, String[] valute) {
		int index = 0;
		for (index = 0; index < valute.length; index++) {
			if (currency1.equals(valute[index])) {
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {

		int counter = 0;
		TextIO.readFile("src/Currency.txt");
		while (!TextIO.eof()) {

			TextIO.getln();
			counter++;

		}

		TextIO.readStandardInput();
		
		
		String[] arr1=new String[counter];
		double[] arr2=new double[counter];
		
		String nameOfCurrency1=inputCurrency1();
		getValue(arr1, arr2);
		int index = getIndex(nameOfCurrency1, arr1);
		System.out.println(index);
		
		

	}
}
