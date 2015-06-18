package ba.bitcamp.exercises.ass9_11;

import ba.bitcamp.exercises.ass9_10.PortableComputer;

public class PocketPC extends PortableComputer {

	private boolean supportsTouchInterface;
	private boolean supportsSIMcards;
	private boolean supportsMicroSDcards;

	public boolean isSupportsTouchInterface() {
		return supportsTouchInterface;
	}

	public void setSupportsTouchInterface(boolean supportsTouchInterface) {
		this.supportsTouchInterface = supportsTouchInterface;
	}

	public boolean isSupportsSIMcards() {
		return supportsSIMcards;
	}

	public void setSupportsSIMcards(boolean supportsSIMcards) {
		this.supportsSIMcards = supportsSIMcards;
	}

	public boolean isSupportsMicroSDcards() {
		return supportsMicroSDcards;
	}

	public void setSupportsMicroSDcards(boolean supportsMicroSDcards) {
		this.supportsMicroSDcards = supportsMicroSDcards;
	}

	public void printTypeInfo() {
		System.out
				.println("\nPocketPC computers are made for global use, when it comes to portability."
						+ " \nTheir main characteristics are portability and functionality.");

	}

}
