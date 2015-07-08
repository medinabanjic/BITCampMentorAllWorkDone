package ba.bitcamp.exercises.ass9_22;

import java.util.Arrays;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(){
		this(1, 1, 2000);
	}
	
	public String toString(){
		String s = "";
		s += day;
		s += "." + month;
		s += "." + year + ".";
		
		return s;
	}
	
	public static void main(String[] args) {
		Date[] dates = new Date[3];
		dates[0] = new Date();
		dates[1] = new Date(02, 12, 2015);
		dates[2] = new Date();
		
		for(Date value : dates){
			System.out.println(value);
		}
		System.out.println();

	}

}
