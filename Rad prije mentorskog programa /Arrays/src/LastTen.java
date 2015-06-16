import java.util.Scanner;


public class LastTen {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int maxBrojElemenata = in.nextInt();
		maxBrojElemenata = Math.max(maxBrojElemenata, 5);

		int poz = 0;
		int[] brojevi = new int[maxBrojElemenata];
		while (true) {

			int br = in.nextInt();

			if (br > 0) {
				brojevi[poz] = br;
				poz++;
				if (poz == brojevi.length) {
					poz = 0;
				}

			} else
				break;

		}
		for (int idx=0;idx<brojevi.length;idx++) {
			int br=in.nextInt();
			if(br>0) {
				brojevi[idx]=br;
			}else 
				break;
		}
		int max=-1;
		for (int idx=0;idx<brojevi.length;idx++) {
			int elementNiza=brojevi[idx];
			if (elementNiza>max) {
				max=elementNiza;;
			}
		}
		System.out.println("Najveci je: "+ max);
		in.close();
	}

}
