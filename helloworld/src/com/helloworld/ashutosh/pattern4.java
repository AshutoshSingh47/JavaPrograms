package com.helloworld.ashutosh;
import java.util.Scanner;
public class pattern4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	int i,j,k,n;
	
	System.out.println("enter limit");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
	for(j=i;j>=1;j--)
	{		
		System.out.print(j+" ");
    
	}
	for(k=2;k<=i;k++)
	{
		System.out.print(k+" ");
	}
	System.out.println("");
	}
	}
}