package org.computer;

public class Desktop1 extends Computer{
	public void desktopSize() {
		System.out.println("Desktop size is 14 inch");
	}
	public static void main(String[] args) {
		Desktop1 d = new Desktop1();
		d.computerModel();
		d.desktopSize();
	}

}
