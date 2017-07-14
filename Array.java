package com.practice.basics;
class Array_demo{
	public void arr(){
		int a[] = new int[5];
		a[0]=4;
		a[1]=8;
		a[2]=2;
		a[3]=7;
		a[4]=9;
		try{
		for(int i=0;i<=5;i++)
		{
		System.out.println(a[i]);
		}
		}
		catch(Exception e){
			
		}
		
		
		
	}
	
}


public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Array_demo ar=new Array_demo(); 
ar.arr();
	}

}
