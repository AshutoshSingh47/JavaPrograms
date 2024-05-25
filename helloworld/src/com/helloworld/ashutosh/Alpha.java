package com.helloworld.ashutosh;
import java.util.Scanner;
public class Alpha {

	public static void main(String[] args) {
		//char c;
		Scanner sc=new Scanner(System.in);
		String a="aab";
		String b="abc";
		boolean isAnagram=false;
		
		boolean visited[]=new boolean[b.length()];
		if(a.length()==b.length())
		{ char c;
			for(int i=0;i<a.length();i++)
			{
				 c=a.charAt(i);
				isAnagram=false;
			
			for(int j=0;j<b.length();j++){
				if(b.charAt(j) == c && !visited[j]){
					visited[j]=true;
					isAnagram=true;
				break;
			}
		}
			if(!isAnagram){
				break;
				}
		}
				
		
	
	
	
	if(isAnagram){
		System.out.println("Anagram");}
		else{
			System.out.println("Not anagram");}
		}
	}
}
	

	
				
				