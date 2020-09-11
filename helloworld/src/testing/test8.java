package testing;
import java.util.Scanner;
public class test8 {
	test6 head;
	public void add(int a)
	{ 		
		test6 test=new test6();
		test.a=a;
		test.next=null;
		if(head==null)
		{
			head =test;
		}
		else{
			test6 n=head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=test;
		}
		
		
}
	public void print()
	{
		test6 test=head;
		while(test.next!=null)
		{
			
			System.out.print(test.a+" ");
			test=test.next;
		}
		System.out.print(test.a+" ");
	}
	public static void main(String args[])
	{
		test8 t=new test8();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.print();
	}
}