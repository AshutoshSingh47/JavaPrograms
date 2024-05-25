package com.helloworld.ashutosh;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		int n,k,r,s;
		s=0;
		System.out.println("Enter the number");
		n=a.nextInt();
		k=n;
		while(n!=0)
		{
			r=n%10;
			s=s+(r*r*r);
			n=n/10;
		}
		if(s==k)
			System.out.println("ARMSTRONG");
		else
			System.out.println("NOT ARMSTRONG");
		
		
		

	}

}
