package testing;
//import java.util.Scanner;
public class test5 {
	int b=6;
	test5 t;
	void inn()
	{
		test5 test=new test5();
		test6 tep=new test6();
		//tep.a=a;
		test.b=b;
		this.b=test.b;
		System.out.println("this.b = "+this.b);
		System.out.println("t = "+t);
		System.out.println("tep = "+tep);
		System.out.println("tep.tt = "+tep.tt);
		System.out.println("test = "+test);
		System.out.println("test.b = "+test.b);
		tep.tt=null;
		System.out.println("tep = "+tep);
		//System.out.println("this.a = "+this.a);
	}
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//int a=5;
		test5 test =new test5();
		test.inn();
		//te.a=a;
}
}
