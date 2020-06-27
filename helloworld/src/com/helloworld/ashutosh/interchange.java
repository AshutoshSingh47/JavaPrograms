package com.helloworld.ashutosh;

public class interchange {
	public static void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("swapped values:"+a+" "+b);
	}

	public static void main(String[] args) {
		int a=2,b=3;
		System.out.println("swapped values:"+a+" "+b);
		interchange.swap(a,b);//TODO Auto-generated method stub
        //System.out.println("swapped values:"+a+" "+b);
	}

}
