package ba.bitcamp.exercises.ass3;

public class PrinterNetwork {

	private static Printer[] network;

	public PrinterNetwork(Printer[] network) {
		PrinterNetwork.network = network;
	}

	public void coordinatePrinting(int n) {
		while (n > 0) {
			for (int j = 0; j < network.length; j++) {

				int i = network[j].printPage(n);
				n -= i;
				
				if (n < 1) {
					break;
				}
				System.out.println(n);
			}

		}
	}
}