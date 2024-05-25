package com.helloworld.ashutosh;
/*import ja
 impor java.util.Scanner;
public class torf {
	public static void main(String args[])
	{Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("ENTER TWO NUMBERS");
		a=sc.nextInt();
		b=sc.nextInt();
		
		
	}*/
public class torf{
	
	public int sum(int a,int b)
	{
		int s;                
		s=a+b;
		return s;
		//System.out.println(s);
	}

/*public void sum()
{
	
	//return s;
}*/
public static void main(String args[]){
int a=4,b=5;
 torf t =new torf();
System.out.println(new torf().sum(a,b));

//new torf().sum();
	
}
}



