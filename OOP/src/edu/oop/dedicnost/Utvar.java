package edu.oop.dedicnost;

public class Utvar{
	
	private double x, y;

	public Utvar(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void kresli() {
		System.out.println("Utvar na [" + this.x + ", " + this.y + "]");
	}
	
	
	

}
