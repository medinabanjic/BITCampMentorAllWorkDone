package ba.bitcamp.classes.ass9_15;

public class Again2D {

	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
		
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				System.out.printf("%2d", matrix[i][j]);
			}
			System.out.println();
		}


	}

}