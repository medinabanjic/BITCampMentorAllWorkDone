package ba.bitcamp.classes.ass5;

public class Employee {

		private String name;
		private String gender;


		/**
		 * Constructor
		 * 
		 * @param name
		 * @param gender
		 */
		public Employee(String name, String gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		/**
		 * Gets name.
		 * 
		 * @return
		 */
		public String getName() {
			return name;
		}

		/**
		 * Gets gender.
		 * 
		 * @return
		 */
		public String getGender() {
			return gender;
		}
		
		/**
		 * This method change our attributes to String so that we can print them.
		 */
		public String toString() {
			String s = "";
			s = "Name: " + name + "\n";
			s += "Gender: " + gender + "\n";

			return s;
		}

	}
