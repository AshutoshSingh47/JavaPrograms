package inheritance;
import java.util.Scanner;
public class B extends A {
public void sum(int a,int b)
{
	int sub;
	sub=a-b;
	System.out.println("result = "+sub);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter first number");
	    b=sc.nextInt();
	    B bo=new B();
	    bo.sum(a,b);
	}

}
