package com.Banking;

public class icici implements interest {

	public float getRateOfInterest(float p, float t, float r)
	{
		float I = (p*r*t)/100;
		return I;
		//System.out.println("Interest = "+I);
	}
	
}

