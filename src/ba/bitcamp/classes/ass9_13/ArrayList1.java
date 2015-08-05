package ba.bitcamp.classes.ass9_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		
//		a.add("this");
//		a.add("is");
//		a.add("lots");
//		a.add("of");
//		a.add("fun");
//		a.add("for");
//		a.add("every");
//		a.add("Java");
//		a.add("programmer");
//		
//		for(int i = 0; i < a.size(); i ++){
//			String word = a.get(i);
//			if (word.length() == 4){
//				b.add("****");
//			} 
//				b.add(word);
//		}
//		
		
		
//		for (int i = 0; i < 9; i++) {
//			Random rand = new Random();
//			a.add(rand.nextInt(10));
//		}

		//System.out.println(a.toString());

		// while(a.indexOf(2) != -1){
		// a.remove((Integer)2);
		// }

		// ArrayList<Integer> b = new ArrayList<Integer>();
//		for (int i = 0; i < a.size(); i += 2) {
//			if (i + 1 < a.size()) {
//				int temp = a.get(i);
//				a.set(i, a.get(i + 1));
//				a.set(i + 1, temp);
//			} else {
//				a.set(i, a.get(i));
//			}
//		}

		//System.out.println(b.toString());
		
		int[] cubesTrown = new int[13];
		Random rand = new Random();
		
		for (int i = 0; i < 100; i++){
			
			
			int num = rand.nextInt(6) + 1;
			num += rand.nextInt(6) + 1;
			
			cubesTrown[num]++;
		}
		
		System.out.println(Arrays.toString(cubesTrown));
	}

}
