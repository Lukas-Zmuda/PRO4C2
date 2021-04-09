package edu.oop.dedicnost;

public class Kruh extends Utvar{

	private double polomer;

	public Kruh(double x, double y, double polomer) {
		super(x, y);
		this.polomer = polomer;
	}

	public double getPolomer() {
		return polomer;
	}

	public void setPolomer(double polomer) {
		this.polomer = polomer;
	}
	
	public void kresli() {
		System.out.println("Kruh na [" + this.getX() + ", " + this.getY() + "] r = " + this.polomer);
	}
	
	
	
}
