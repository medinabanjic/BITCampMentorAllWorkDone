
public class SumOfArrays {

	public static void main(String[] args) {
		
		int[] array = new int[] { 4, 5, 5, 7, 4 };
		int[] array2 = new int[] { 2, 5, 8, 9 };
		int length = array.length + array2.length;
		int[] array3 = new int[length];
		int lengthMin = 0;
		int lengthMax = 0;
		boolean isLeft = true;
		
		if (array.length < array2.length){
			
			lengthMin = array.length;
			lengthMax = array2.length;
			isLeft = true;
			
			
		}
		else {
			lengthMin = array2.length;
			lengthMax = array.length;
			isLeft = false;
		}
		
		
		for (int i = 0; i < lengthMin; i++) {

			array3[i] = array[i] + array2[i];
			
		
		}			
				for (int j = lengthMin; j < lengthMax; j++){
					
					if (isLeft == true){
						
						array3[j] = array2[j-array.length];
						
					}
					
					else {
						array3[j] = array[j - array2.length];
					
				}
			}

		


		for (int value : array3) {
			
			
			System.out.print(value + " ");
		}

		}
	}

