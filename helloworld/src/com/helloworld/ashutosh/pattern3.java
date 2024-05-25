package com.helloworld.ashutosh;
import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k,a,n;
		a=1;
		System.out.println("enter the limit");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{k=a;
			for(j=1;j<=i;j++)
			{
				
				System.out.print(k+" ");
				--k;
				
			}
			a++;
			System.out.println("");
		}
		

	}

}
