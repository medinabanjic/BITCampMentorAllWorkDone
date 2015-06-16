package ba.bitcamp.dreamteam;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author
 * 
 *         medina.mladen.gordan
 *
 */
public class Converter {

	/**
	 * This method reads user input.
	 * 
	 * @return
	 * 
	 *         It returns <b>String value</b>
	 */
	public static String inputCurrency1() {
		Scanner in = new Scanner(System.in);
		String currency1 = in.nextLine();
		return currency1;
	}

	/**
	 * This method reads file and put <b>currencies</b> to String array, and
	 * also put <b>values of currencies compared to USD</b> to integer array.
	 * 
	 * @param valute
	 *            - String[] <i> currency name</i>
	 * @param value
	 *            - int[]<i> currency value compared to USD</i>
	 */
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

	/**
	 * This method compare <b>currency from user input</b> with <b>currencies
	 * from file</b>, and finds its <b>index in array</b>.
	 * 
	 * @param currency1
	 *            - String <i>from user input</i>
	 * @param valute
	 *            - String[] <i> currencies from file </i>
	 * @return
	 * 
	 *         It returns <b>integer index value</b>
	 */
	public static int getIndex(String currency1, String[] valute) {
		int index = 0;
		for (index = 0; index < valute.length; index++) {
			if (currency1.equals(valute[index])) {
				break;
			}
		}
		return index;
	}

	/**
	 * This method finds <b>value of currency in double array</b>, using the
	 * given index.
	 * 
	 * @param index
	 *            - int <i>given index</i>
	 * @param arr2
	 *            - double <i> array type double with currencies values </i>
	 * @return
	 * 
	 *         It returns <b>double value</b> of index in the given array.
	 * 
	 * @throws
	 * 
	 *         <b>ArrayIndexOutOfBoundsException</b> if the input is wrong.
	 */
	public static double getValueAt(int index, double[] arr2) {
		double value = 0;
		try {
			value += arr2[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong input!");
			System.exit(0);
		}
		return value;
	}

	/**
	 * This method does conversion from one to another currency.
	 * 
	 * @param value1
	 *            - double <i>value of the given currency which we want to
	 *            convert</i>
	 * @param value2
	 *            - double <i>value of the given currency which we want to
	 *            convert to</i>
	 * @param money
	 *            - double <i>sum of money which we want to convert from one to
	 *            another currency</i>
	 * @return
	 * 
	 *         It returns <b>double value</b> of the money we get after the
	 *         conversion is done.
	 */
	public static double convert(double value1, double value2, double money) {
		double converted = money * (value2 / value1);
		return converted;
	}

	/**
	 * This method reads <b>sum of money for conversion</b> from user.
	 * <p>
	 * Furthermore, it ends the program if you input negative number.
	 * 
	 * @return
	 * 
	 *         It returns <b>double value</b> of the given sum.
	 * 
	 * @throws
	 * 
	 *         <i>InputMismatchException</i> if the user input is in wrong
	 *         format.
	 */
	public static double inputMoney() {

		Scanner in = new Scanner(System.in);

		System.out.println("How much money do you want to convert? ");
		double value = 0;
		try {
			value = in.nextDouble();
			if (value < 0) {
				System.out.println("You cannot convert negative number.");
				System.exit(0);
			}
		} catch (InputMismatchException e) {
			System.out.println("Wrong input!");
			System.exit(0);
		}
		in.close();

		return value;

	}

	/**
	 * This method prints the currency list on console.
	 * 
	 * @throws
	 * 
	 *         <i>IllegalArgumentException</i> if the file does not exist.
	 */
	public static void splitFromFile() {
		try {
			TextIO.readFile("src/ba/bitcamp/dreamteam/Currency.txt");
		} catch (IllegalArgumentException e) {
			System.out.println("System error! Thank you for understanding.");
			System.exit(0);
		}
		System.out.println("Currency list:");
		while (!TextIO.eof()) {
			String s = TextIO.getln();
			String[] parts = s.split(" ");
			String part1 = parts[0];

			System.out.println(part1);
		}

	}

	/**
	 * This method helps main method to look nice :)
	 * 
	 * Here we called most of our methods. Got the user inputs, conversion,
	 * values, indexes, etc.
	 * 
	 * It prints everything on console.
	 */
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
		System.out.printf("You get: %.3f %s", convert(value1, value2, money),
				nameOfCurrency2);
	}

	public static void main(String[] args) {

		splitFromFile();

		getConvertedMoney();
	}

}
