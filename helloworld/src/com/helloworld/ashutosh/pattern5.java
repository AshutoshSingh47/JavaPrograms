package com.helloworld.ashutosh;
import java.util.Scanner;
public class pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,c;boolean a;
		a=false;
		System.out.println("enter the row");
		r=sc.nextInt();
		System.out.println("enter the column");
		c=sc.nextInt();
		int[][] arr=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{				
			arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{				
			if(arr[i][j]==1)
			{
				a=true;
			}
			}
		}
			if(a)
			{
				System.out.println("identity matrix");
			}
			else
				System.out.println("not identity matrix");
		
		
	}

}
