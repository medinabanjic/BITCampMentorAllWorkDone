package ba.bitcamp.arrays;

import java.util.Arrays;

public class Ass2 {

	/**
	 * This method makes a matrix NxM.
	 * @param n - number of rows
	 * @param m - number of columns
	 * @return
	 * 
	 * Returns a matrix NxM with random numbers 
	 * <p>
	 * in a range [5-10]
	 */
	public static int[][] getMatrix(int n, int m) {

		int[][] matrix = new int[n][m];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				matrix[i][j] = (int) (Math.random() * 6 + 5);
				System.out.printf("%3d", matrix[i][j]);

			}

			System.out.println();
		}
		System.out.println();

		return matrix;
	}

	/**
	 * This method prints a normal matrix if the condition is false, 
	 * and a matrix inverted if the condition is true. 
	 * @param print - boolean true or false
	 * @param matrix - a given int[][] array matrix
	 */
	public static void printRR(boolean print, int[][] matrix) {

		if (print == false) {

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {

					System.out.printf("%3d", matrix[i][j]);

				}

				System.out.println();
			}

			System.out.println();

		} else {

			for (int i = matrix.length - 1; i >= 0; i--) {
				for (int j = matrix[i].length - 1; j >= 0; j--) {

					System.out.printf("%3d", matrix[i][j]);

				}

				System.out.println();
			}
			System.out.println();

		}

	}

	/**
	 * This method reads 1D array from file.
	 * @param array - array for values input, from file
	 * @return
	 * 
	 * Returns 1D array.
	 */
	public static void readFile() {
		int counter = 0;
		
		TextIO.readFile("src/ba/bitcamp/arrays/1dArray");

		while (!TextIO.eof()) {
			TextIO.getln();
			counter++;
		}

		TextIO.readStandardInput();
		
		if (counter == 1){
			TextIO.readFile("src/ba/bitcamp/arrays/1dArray");
			

				String value = TextIO.getln();
				String[] parts = value.split(" ");
			
			System.out.print(Arrays.toString(parts));
			}else{
				
		TextIO.readFile("src/ba/bitcamp/arrays/1dArray");
	
		int[] array = new int[counter];
		for (int i = 0; i < counter; i++) {

			array[i] = TextIO.getInt();
			
		}
		}
		
		

	}

	public static void main(String[] args) {

		int n = 2;
		int m = 3;
		

		
		printRR(true, getMatrix(n, m));

		readFile();
		

	}

}
