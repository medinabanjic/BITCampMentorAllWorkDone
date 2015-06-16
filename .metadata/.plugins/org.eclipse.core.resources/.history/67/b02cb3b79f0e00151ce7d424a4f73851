package ba.bitcamp.dreamteam;

import java.util.Scanner;

public class Converter {

	public static String inputCurrency1() {
		Scanner in = new Scanner(System.in);
		String currency1 = in.nextLine();
		return currency1;
	}

	public static void getValue(String[] valute, double[] value) {

		int counter = 0;
		TextIO.readFile("src/ba/bitcamp/dreamteam/Currency.txt");
		while (!TextIO.eof()) {

			TextIO.getln();
			counter++;

		}

		TextIO.readStandardInput();
		TextIO.readFile("src/ba/bitcamp/dreamteam/Currency.txt");

		for (int i = 0; i < counter; i++) {

			String valuteName = TextIO.getln();
			String[] parts = valuteName.split(" ");
			String part1 = parts[0];

			valute[i] = part1;

		}

		TextIO.readStandardInput();
		TextIO.readFile("src/ba/bitcamp/dreamteam/Currency.txt");

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

	public static double getValueAt(int index, double[] arr2) {
		double value = 0;
		value += arr2[index];
		return value;
	}

	public static double convert(double value1, double value2, double money) {
		double converted = money * (value2 / value1);
		return converted;
		//System.out.printf("%.3f", converted);
	}

	public static double inputMoney() {

		Scanner in = new Scanner(System.in);

		System.out.println("How much money do you want to convert? ");

		double value = in.nextDouble();

		in.close();

		return value;

	}
	
	public static void splitFromFile() {
		TextIO.readFile("src/ba/bitcamp/dreamteam/Currency.txt");
		System.out.println("Currency list:");
		while (!TextIO.eof()) {
			String s = TextIO.getln();
			String[] parts = s.split(" ");
			String part1 = parts[0];

			System.out.println(part1);
		}
		
	}
	
	public static void getConvertedMoney() {
		int counter = 0;
		TextIO.readFile("src/ba/bitcamp/dreamteam/Currency.txt");
		while (!TextIO.eof()) {

			TextIO.getln();
			counter++;

		}

		TextIO.readStandardInput();

		String[] arr1 = new String[counter];
		double[] arr2 = new double[counter];

		System.out.println("Which currency do you want to convert: ");
		String nameOfCurrency1 = inputCurrency1();
		getValue(arr1, arr2);
		int index = getIndex(nameOfCurrency1, arr1);

		double value1 = getValueAt(index, arr2);
		System.out.println("To which currency do you want to convert: ");
		String nameOfCurrency2 = inputCurrency1();
		getValue(arr1, arr2);
		int index1 = getIndex(nameOfCurrency2, arr1);

		double value2 = getValueAt(index1, arr2);

		double money = inputMoney();

		System.out.println("You want to convert " + money + " "
				+ nameOfCurrency1);
		System.out.printf("You get: %.3f %s",convert(value1, value2, money),nameOfCurrency2);
	}
	

	public static void main(String[] args) {

		splitFromFile();

		getConvertedMoney();

	}
}
