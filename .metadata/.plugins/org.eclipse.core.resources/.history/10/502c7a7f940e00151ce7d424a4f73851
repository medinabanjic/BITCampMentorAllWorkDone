package ba.bitcamp.dreamteam;

public class Medina {

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

	public static void main(String[] args) {

	}

}
