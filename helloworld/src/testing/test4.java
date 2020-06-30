package testing;
import java.util.Scanner;
public class test4 {
public static void sum(int sp)
{
	Scanner sc=new Scanner(System.in);
	int a,b,s;
	a=sc.nextInt();
	b=sc.nextInt();
	s=a+b;
	s=s*sp;
	System.out.println("sum : "+s);
	
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int tc,sp;
	System.out.println("console working");
	tc=sc.nextInt();
	System.out.println("enter the no.");
	sp=sc.nextInt();
	for(int i=1;i<=tc;i++)
	{
		
		sum(sp);
	}

	}

}
