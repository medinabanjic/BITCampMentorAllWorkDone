package bitcamp.medina;

public class Fifth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day= 25;
		int month= 5;
		
		int todayDay= 25;
		int todayMonth= 5;
		
		if (month >= todayMonth){
			
			System.out.println("It has not passed.");
		
		}
		
		else if (month < todayMonth){
			
			System.out.println("It has passed.");
		}
		
		
		
		else if(todayMonth == month && todayDay < day){
			
			System.out.println("It has passed.");
		}
		
		else if(todayMonth == month && todayDay > day){
			
			System.out.println("It has not passed.");
		}
		if ( todayDay == day && todayMonth == month){
			
			System.out.println("It is today.");
		}

	}

}
