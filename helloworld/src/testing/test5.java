package testing;
//import java.util.Scanner;
public class test5 {
	int b;
	test5 t;
	void inn(int b)
	{
		test5 test=new test5();
		test.b=b;
		System.out.println("a = "+b);
		System.out.println("test.a = "+test.b);
		test5 ti=t;
		System.out.println("test5 ti = "+ti);
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
