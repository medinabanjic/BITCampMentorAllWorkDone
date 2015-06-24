
public class BiggerArray {

	public static void main(String[] args) {
		int[] array = new int[] {4, 5, 5, 7, 4};
		int[] array2 = new int [10];
		for (int i = 0; i < array.length; i++) {
			
			
			array2[i] = array[i];

		}
		
		for (int value : array2){
			System.out.println(value);
		}
		

	}

}
