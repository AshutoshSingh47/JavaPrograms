package testing;
import java.util.Scanner;
public class test10 {
	public static int a(int val)
	{
		int s=0;
		s=s+(++val);
		return s;
	}
	public static int b(int s)
	{
		++s;
		return s;
	}
	public static int c(int c)
	{
		int x=c/2;
		return x;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val,result=1;
		val=7;
		result+=(c(c(c(val))));
			System.out.println(result+" ");
	}
/*	public  int a(int val)
	{
		int s=0;
		s=s+(++val);
		return s;
	}
	public  int b(int s)
	{
		++s;
		return s;
	}
	public  int c(int c)
	{
		int x=c/2;
		return x;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		test10 test=new test10();
		int val,result=1;
		val=7;
		result+=(test.c(test.c(test.c(val))));
			System.out.println(result+" ");

	}*/

}
