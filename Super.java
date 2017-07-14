package com.practice.basics;
class A{
	void abc(){
		System.out.println("A ABC");
	}
}
class B extends A
{
    void abc(){
    	super.abc();
    	System.out.println("B ABC");
    }
}

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj = new B();
obj.abc();

	}
}


