package ba.bitcamp.exercises.ass3;

public class Main {

	public static void main(String[] args) {
		Printer p1 = new Printer();
		Printer p2 = new Printer("Moj licni printer");

		System.out.println("\nFirst printer has tint: " + p1.hasTint()
				+ " \nSecond has tint: " + p2.hasTint());

		System.out.println("\nFirst printer has paper: " + p1.hasPaper()
				+ " \nSecond has paper: " + p2.hasPaper());

		System.out.println("\nFirst printer printed totally: "
				+ p1.getPrintedPages());

		System.out.println("\nSecond printer printed totally: "
				+ p2.getPrintedPages());

		p1.addPaper(102);
		p2.addPaper(30);

		p1.addMaxTint();
		p2.addMaxTint();

		System.out.println("\nFirst printer has tint: " + p1.hasTint()
				+ " \nSecond has tint: " + p2.hasTint());

		System.out.println("\nFirst printer has paper: " + p1.hasPaper()
				+ " \nSecond has paper: " + p2.hasPaper());

		p1.printPage(24);
		p2.printPage(60);

		System.out.println("\nFirst printer printed totally: "
				+ p1.getPrintedPages());
		System.out.println("\nSecond printer printed totally: "
				+ p2.getPrintedPages());
		System.out.println("\nWe printed totally: "
				+ Printer.getTotalPagesPrinted());
		System.out.println(p1.toString());

		System.out.println(p2.toString());
	}
}
