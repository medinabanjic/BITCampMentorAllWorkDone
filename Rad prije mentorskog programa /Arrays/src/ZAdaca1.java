import java.util.Arrays;

public class ZAdaca1 {

	public static void main(String[] args) {
		int[] array = new int[100];

		for (int i = 0; i < array.length; i++) {
			
			array[i] = i + 1;
				
				if (array[i] > 10) {

					array[i] %= 10;
				}
				
				else if (array[i] == 10){
					
					array[i] = 0;
				}

				
			}
         System.out.println(Arrays.toString(array));
		}
		
			
		}
	

