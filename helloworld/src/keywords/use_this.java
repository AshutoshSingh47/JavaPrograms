package keywords;
import java.util.Scanner;
public class use_this {
	int a,b;
	use_this(int a,int b)
	{ this.a=a;
	this.b=b;
	int s;
	s=a+b;
	this.display(s);
	}
	public void display(int s)
	{
		System.out.println("Sum = "+s);
	}

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("a = "+a+" "+"b = "+b);
		use_this use=new use_this(a,b);

	}

}
