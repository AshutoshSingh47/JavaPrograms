package polymorphism;
import java.util.Scanner;
public class invitation { //compile - time 
	private static void greetings()
	{
		System.out.println("hello");
	}
	private static void greetings(String a)
	{
		System.out.println(a);
	}
	private static void greetings(int a ,String b)
	{
		for(int i=1;i<=a;i++){
		System.out.println(b);}
	}

	public static void main(String[] args) {
		int a;
		invitation invite=new invitation();
		Scanner sc=new Scanner(System.in);
		//String s1,s2;
		System.out.println("enter the limit");
		a=sc.nextInt();
		System.out.println("enter the first string");
		String s1=sc.next();
		System.out.println("enter the second string");
		String s2=sc.next();
		greetings();
		greetings(s1);
		greetings(a,s2);
		
	
	}

}
