package com.helloworld.ashutosh;
import java.util.Scanner;
public class array3 {

	public static void main(String[] args) {
		int i,j,k,l,r,c,r2,c2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		r=sc.nextInt();
		System.out.println("enter the column");
		c=sc.nextInt();
		int[][]arr=new int[r][c];
		System.out.println("enter the row");
		r2=sc.nextInt();
		System.out.println("enter the column");
		c2=sc.nextInt();
		int[][]brr=new int[r2][c2];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(k=0;k<r2;k++)
		{
			for(l=0;l<c2;l++)
			{
				brr[k][l]=sc.nextInt();
			}
		}
	
		
		

	}

}
