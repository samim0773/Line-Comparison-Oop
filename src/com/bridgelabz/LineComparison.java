package com.bridgelabz;

import java.util.Scanner;

class CalculateLength {
	double length ;

	public CalculateLength(int x1, int y1, int x2, int y2) {
		length = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1 ),2));
	}
	
}

class CalculateEqualityOfTwoline{
	double length2;
	public CalculateEqualityOfTwoline(int x1,int y1,int x2,int y2) {
		length2 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1 ),2));
	}
	
}


public class LineComparison {
	public static void main(String[] args) {
		System.out.println("Welcome to line comparison computation program");
		
		int x1,x2,y1,y2;
		int X1,Y1,X2,Y2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first line x1 point: ");
		x1 = scanner.nextInt();
		System.out.println("Enter first line  y1 point: ");
		y1 = scanner.nextInt();
		System.out.println("Enter first line x2 point: ");
		x2 = scanner.nextInt();
		System.out.println("Enter first line  y2 point: ");
		y2 = scanner.nextInt();
		
		CalculateLength cl = new CalculateLength(x1,y1,x2,y2);
		System.out.println("length : "+cl.length);
		 
	}

}
