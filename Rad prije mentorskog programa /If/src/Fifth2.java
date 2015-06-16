
public class Fifth2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day= 25;
		int month= 5;
		int year= 1993;
		int monthNow= 5;
		int yearNow= 2015;
		int dayNow= 22;
		int daysPassed= 0;
		
		int a= 31;
		int b= 28;
		int c= 31;
		int d= 30;
		int e= 31;
		int f= 30;
		int g= 31;
		int h= 31;
		int i= 31;
		int j= 30;
		int k= 31;
		int l= 30;
			
		int yDays= 0;
		int mDays= 0;
		int nowMdays= 0;
		int diffYears= 0;
		int prestYears= 0;
		int prestDays= 0;
		int daysLeft= 0;
		
		if(month > 12)
			System.out.println("False month.");
		
		if (month == 1){
			
			mDays= a + b + c + d + e + f + g + h + i + j + k +l;
			nowMdays= a;
			daysLeft= a - day;
			if(day > a)
				System.out.println("Too many days in a month");
		}
		
		if (month == 2){
			
			mDays= b + c + d + e + f + g + h + i + j + k +l;
			nowMdays= a + b;
			daysLeft= b - day;
			if(day > b)
				System.out.println("Too many days in a month");
		}

		if (month == 3){
	
	mDays= c + d + e + f + g + h + i + j + k +l;
	nowMdays= a + b + c;
	daysLeft= c - day;
	if(day > c)
		System.out.println("Too many days in a month");
		}

		if (month == 4){
	
	mDays= d + e + f + g + h + i + j + k +l;
	nowMdays= a + b + c + d;
	daysLeft= d - day;
	if(day > d)
		System.out.println("Too many days in a month");
		}

		if (month == 5){
	
	mDays= e + f + g + h + i + j + k +l;
	nowMdays= a + b + c + d + e;
	daysLeft= e - day;
	if(day > e)
		System.out.println("Too many days in a month");
		}

		if (month == 6){
	
	mDays= f + g + h + i + j + k +l;
	nowMdays= a + b + c + d + e + f;
	daysLeft= f - day;
	if(day > f)
		System.out.println("Too many days in a month");
		}

		if (month == 7){
	
	mDays= g + h + i + j + k +l;
	nowMdays= a + b + c + d + e + f + g;
	daysLeft= g - day;
	if(day > g)
		System.out.println("Too many days in a month");
		}

		if (month == 8){
	
	mDays= h + i + j + k +l;
	nowMdays= a + b + c + d + e + f + g + h;
	daysLeft= h - day;
	if(day > h)
		System.out.println("Too many days in a month");
		}

		if (month == 9){
	
	mDays= i + j + k +l;
	nowMdays= a + b + c + d + e + f + g + h + i;
	daysLeft= i - day;
	if(day > i)
		System.out.println("Too many days in a month");
		}

		if (month == 10){
	
	mDays= j + k +l;
	nowMdays= a + b + c + d + e + f + g + h + i + j;
	daysLeft= j - day;
	if(day > j)
		System.out.println("Too many days in a month");
		}

		if (month == 11){
	
	mDays= k +l;
	nowMdays= a + b + c + d + e + f + g + h + i + j + k;
	daysLeft= k - day;
	if(day > k)
		System.out.println("Too many days in a month");
		}

		if (month == 12){
	
	mDays= l;
	nowMdays= a + b + c + d + e + f + g + h + i + j + k + l;
	daysLeft= l - day;
	if(day > l)
		System.out.println("Too many days in a month");
		}

		diffYears= year - yearNow;
		if (diffYears < 0)
			diffYears*= -1;
		
		prestYears= diffYears / 4;
		prestDays= prestYears * -1;
		
		yDays= diffYears * 365 - prestDays;
		
		daysPassed= yDays - mDays + nowMdays + daysLeft + dayNow;
		
		
		System.out.println(daysPassed);
		

	}

}
