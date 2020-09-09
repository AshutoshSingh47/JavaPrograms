package testing;
//import java.util.Scanner;
public class test5 {
	int b=6;
	test5 t;
	void inn(int b)
	{
		test5 test=new test5();
		test6 tep=new test6();
		test.b=b;
		this.b=b;
		System.out.println("a = "+b);
		System.out.println("test.a = "+test.b);
		test.t=t;
		System.out.println("test5 t = "+t);
		//System.out.println("this.a = "+this.a);
	}
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int b=5;
		test5 test =new test5();
		test.inn(b);
		//te.a=a;
}
}
