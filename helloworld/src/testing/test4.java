package testing;
import java.util.Scanner;
public class test4 {
public static void sum(int tc)
{
	Scanner sc=new Scanner(System.in);
	int a,b;
	int s[]=new int[tc];
	for(int i=0;i<tc;i++){
	a=sc.nextInt();
	b=sc.nextInt();
	s[i]=a+b;
	}
	for(int i=0;i<tc;i++){
	System.out.println(s[i]+" ");}
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int tc;
	System.out.println("console working");
	tc=sc.nextInt();
	for(int i=1;i<=tc;i++)
	{
		sum(tc);
	}

	}
}
