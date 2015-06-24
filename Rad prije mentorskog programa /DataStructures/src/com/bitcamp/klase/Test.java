package com.bitcamp.klase;

public class Test {

	
	public static void getOlderPerson(Person p1, Person p2){
		
		if (p1.yearOfBirth > p2.yearOfBirth){
			
			printer(p2);
			
		}
		
		else{
			
			printer(p1);
		}
		
	}
	
	
	public static void printer(Person printable){
		System.out.println("Starija osoba je: \n");
		System.out.println(printable.firstName);
		System.out.println(printable.secondName);
		System.out.println(printable.yearOfBirth);
		System.out.println(printable.address);
		System.out.println(printable.personID);
		System.out.println(printable.email);
		System.out.println(printable.isValid);
		
	}
	public static void main(String[] args) {
//		String[] person1 = {"Tarik", "Celik", "1986", "Jadranska 9", "LK: A16F00A", "187", "1", "Software Developer", "Pasta", "7UP", "tarik.celik@bitcamp.ba", "+387 61 829 621"};
//		
//		String[] person2 = {"John", "Doe", "1946", "Radiceva 2", "LK: B13E66Y", "213", "0", "Pekar", "Grah", "Boza", "john.doe@bitcamp.ba", "+387 61 999 999"};
//	
		Person per1 = new Person("Tarik", "Celik", 1986, "Jadranska 1", "LK: A16F00A", "tarik.celik@bitcamp.ba", 187, true, "Pasta", "7UP");
		Person per2 = new Person("John", "Doe", 1947, "Radiceva 2", "LK: B13E66Y", "john.doe@bitcamp.ba", 213, false, "Grah", "Boza");
		getOlderPerson(per1, per2);

	}

	}


