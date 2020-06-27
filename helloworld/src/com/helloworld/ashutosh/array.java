package com.helloworld.ashutosh;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		System.out.println("enter a limit");
		n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(j=0;j<n;j++)
		{
			System.out.print(arr[j]+" ");
		}
		

	}

}
