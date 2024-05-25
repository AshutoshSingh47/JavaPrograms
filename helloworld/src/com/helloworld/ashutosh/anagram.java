package com.helloworld.ashutosh;
import java.util.Scanner;
public class anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c,d;boolean isAnagram=true;
		
		System.out.println("enter first string");
		c=sc.nextLine();
		System.out.println("enter second string");
		d=sc.nextLine();
		int[]al= new int[256];
	
			
	for(char e:c.toCharArray())
	{
		
		int index=(int)e;
		al[index]++;
	}
	for(char f:d.toCharArray())
	{
		
		int index=(int)f;
		al[index]--;
	}
	for(int i=0;i<256;i++)
	{
		if(al[i]!=0){
			isAnagram=false;
		break;
	}
	}
	if(isAnagram)
	{
		System.out.println("ANAGRAM");
	}
	else{
		System.out.println("NOT ANAGRAM");
	}
}
}
