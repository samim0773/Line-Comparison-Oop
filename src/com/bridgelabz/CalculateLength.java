package com.bridgelabz;
public class CalculateLength {
	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double length_of_line;
	
	CalculateLength() {
		length_of_line = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1 ),2));
	}


	public double getLength_of_line() {
		return length_of_line;
	}


	public void setLength_of_line(double length_of_line) {
		this.length_of_line = length_of_line;
	}


	public void setX1(double x1) {
		if( x1 < 0) {
			System.out.println("x1 value should be grather than zero");
		}
		this.x1 = x1;			
	}

	public void setY1(double y1) {
		if(y1 < 0) {
			System.out.println("y1 value should be grather than zero");
		}
		this.y1 = y1;
	}


	public void setX2(double x2) {
		if (x2 < 0) {
			System.out.println("x2 value should be grather than zero");		
		}
		this.x2 = x2;
	}

	public void setY2(double y2) {
		if(y2 < 0) {
			System.out.println("y2 value should be grather than zero");
		}
		this.y2 = y2;
	}
	
}
