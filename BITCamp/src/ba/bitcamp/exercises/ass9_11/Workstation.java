package ba.bitcamp.exercises.ass9_11;

import ba.bitcamp.exercises.ass9_10.StationaryComputer;

public class Workstation extends StationaryComputer {

	private int numberOfDisplays;
	private int numberOfProcessorCores;
	private boolean hasEECmemory;

	public int getNumberOfDisplays() {
		return numberOfDisplays;
	}

	public void setNumberOfDisplays(int numberOfDisplays) {
		this.numberOfDisplays = numberOfDisplays;
	}

	public int getNumberOfProcessorCores() {
		return numberOfProcessorCores;
	}

	public void setNumberOfProcessorCores(int numberOfProcessorCores) {
		this.numberOfProcessorCores = numberOfProcessorCores;
	}

	public boolean isHasEECmemory() {
		return hasEECmemory;
	}

	public void setHasEECmemory(boolean hasEECmemory) {
		this.hasEECmemory = hasEECmemory;
	}

	public void printTypeInfo() {
		System.out
				.println("\nWorkstation computers are made for science work, with a lot of different calculations."
						+ " \nThey are much stronger than desktop computers.");

	}

}
