package com.helloworld.ashutosh;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i,n,j;
		System.out.println("enter the limit");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{if(j%2!=0)
				System.out.print("1");
			else
				System.out.print("0");
			}
			System.out.println("");
		}

	}

}
