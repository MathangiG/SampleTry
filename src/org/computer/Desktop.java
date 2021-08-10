package org.computer;

public class Desktop implements Hardware,Software{

	@Override
	public void softwareResources() {
		System.out.println("DBMS");
		System.out.println("Networking Systems");
	}

	@Override
	public void hardwareResources() {
		System.out.println("CPU");
		System.out.println("Mouse");
	}
	public void desktopModel() {
		System.out.println("Desktop Model is DELL-JG54LMD");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.hardwareResources();
		d.softwareResources();
	}

}
