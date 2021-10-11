package com.bridgelabz;

public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to line comparison computation program");
		
		CalculateLength calculateLength = new CalculateLength();
		calculateLength.setX1(10.34);
		calculateLength.setX2(22.46);
		calculateLength.setY1(34.23);
		calculateLength.setY2(43.53);
		double reult = calculateLength.getLength_of_line();
		System.out.println(reult);
	}

}
