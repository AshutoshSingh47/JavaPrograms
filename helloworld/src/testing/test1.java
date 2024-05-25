package testing;

public class test1 {

	static void func(int a,int b)
	{
		
	}

	public static void main(String[] args) {
		int a=5,b=0,c;
		try{
		c=a/b;
		System.out.println(c);
	}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+" cannot be divided by zero");
		}
			
		
	}
}
