package com.helloworld.ashutosh;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,j,k;
		k=1;
		System.out.println("enter the limit");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println("");
		}
	

	}

}
