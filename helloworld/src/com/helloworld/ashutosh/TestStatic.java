package com.helloworld.ashutosh;
import java.util.Scanner;
public class TestStatic
{
	public static void array(int a[][])
	{int i,j,n;
	n=a.length;
	int c[][]=new int[n][n];
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			c[i][j]=a[j][i];
		}
		
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter size");
		n=sc.nextInt();
	    int a[][]=new int[n][n];
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    	  a[i][j]=sc.nextInt();
	    	}
	    }
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    TestStatic.array(a);
		
	}
}





