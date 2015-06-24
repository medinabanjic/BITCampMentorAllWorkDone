package ba.bitcamp.exercises.ass3;

public class Main {

	public static void main(String[] args) {
		Printer[] p = new Printer[2];
		p[0] = new Printer();
		p[1] = new Printer("Moj licni printer");

		PrinterNetwork pn = new PrinterNetwork(p);

		

		// System.out.println("\nFirst printer has tint: " + p[0].hasTint()
		// + " \nSecond has tint: " + p[1].hasTint());
		//
		// System.out.println("\nFirst printer has paper: " + p1.hasPaper()
		// + " \nSecond has paper: " + p2.hasPaper());
		//

		//
		p[0].addPaper(102);
		p[1].addPaper(30);
		//
		p[0].addMaxTint();
		p[1].addMaxTint();
		pn.coordinatePrinting(60);
		System.out.println("\nFirst printer printed totally: "
				+ p[0].getPrintedPages());

		System.out.println("\nSecond printer printed totally: "
				+ p[1].getPrintedPages());
		// System.out.println("\nFirst printer has tint: " + p1.hasTint()
		// + " \nSecond has tint: " + p2.hasTint());
		//
		// System.out.println("\nFirst printer has paper: " + p1.hasPaper()
		// + " \nSecond has paper: " + p2.hasPaper());
		//
		// p1.printPage(24);
		// p2.printPage(60);
		//
		// System.out.println("\nFirst printer printed totally: "
		// + p1.getPrintedPages());
		// System.out.println("\nSecond printer printed totally: "
		// + p2.getPrintedPages());
		// System.out.println("\nWe printed totally: "
		// + Printer.getTotalPagesPrinted());
		// System.out.println(p1.toString());
		//
		// System.out.println(p2.toString());
	}
}
