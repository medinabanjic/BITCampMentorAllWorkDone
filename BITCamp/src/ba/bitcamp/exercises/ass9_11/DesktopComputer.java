package ba.bitcamp.exercises.ass9_11;

import ba.bitcamp.exercises.ass9_10.StationaryComputer;

public class DesktopComputer extends StationaryComputer {

	private int freeRAMspaces;
	private boolean isOverclock;
	private boolean hasOpticalDrive;

	public DesktopComputer(String OS, int RAM, double price,
			double procesorSpeed, double powerSupplyUnitStrength,
			int hardDiskCapacity, int freeRAMspaces, boolean isOverclock,
			boolean hasOpticalDrive) {
		super(OS, RAM, price, procesorSpeed, powerSupplyUnitStrength,
				hardDiskCapacity);
		this.freeRAMspaces = freeRAMspaces;
		this.isOverclock = isOverclock;
		this.hasOpticalDrive = hasOpticalDrive;

	}

	public int getFreeRAMspaces() {
		return freeRAMspaces;
	}

	public void setFreeRAMspaces(int freeRAMspaces) {
		this.freeRAMspaces = freeRAMspaces;
	}

	public boolean isOverclock() {
		return isOverclock;
	}

	public void setOverclock(boolean isOverclock) {
		this.isOverclock = isOverclock;
	}

	public boolean isHasOpticalDrive() {
		return hasOpticalDrive;
	}

	public void setHasOpticalDrive(boolean hasOpticalDrive) {
		this.hasOpticalDrive = hasOpticalDrive;
	}

	public void printTypeInfo() {
		super.printTypeInfo();
		System.out.println("\nDesktop computers are made for global use."
				+ " \nTheir main idea is configuration possibility.");

	}

}
