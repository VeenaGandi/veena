package com.practice.basics;
class cal
{
	static int calc(int a,int b)
	{
		a=3;
		b=6;
		return a+b;
	}
	void calc(double a, double b)
	{
	    double sub = a-b;
	    System.out.println("sub = "+sub);
	}
}
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//cal obj1 = new cal();
System.out.println(cal.calc(5, 7));

	}

}
