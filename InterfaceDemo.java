package com.Banking;

import java.util.Scanner;


public class InterfaceDemo {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("enter principle amount:");
	    float p = sc.nextFloat();
		
		System.out.println("enter time in years: ");
	    float t = sc.nextFloat();
		
		System.out.println("enter rate annually: ");
	    float r = sc.nextFloat();
	    icici obj = new icici();
	    Axis obj1 = new Axis();
	    obj.getRateOfInterest(p, t, r);
	    obj1.getRateOfInterest(p, t, r);
	    
	    System.out.println("Interest of ICICI bank: " +obj.getRateOfInterest(p, t, r));
	    
	}

}
