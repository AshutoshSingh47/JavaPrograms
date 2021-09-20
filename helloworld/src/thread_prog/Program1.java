package thread_prog;
import java.lang.Thread;
public class Program1 {
	public static void main(String[] args) {
		Program2 p=new Program2();
		Thread t=new Thread(p);
		Program3 p2=new Program3();
		Thread t1=new Thread(p2);
		Program4 p3=new Program4();
		Thread t2=new Thread(p3);
		t.start();
		t1.start();
		t2.start();
	}

}
class Program2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread : i : "+i);
		}
	}
}
class Program3 implements Runnable
{
	public void run()
	{
		for(int j=0;j<10;j++)
		{
			System.out.println("Thread : j : "+j);
		}
	}
}
class Program4 implements Runnable
{
	public void run()
	{
		for(int k=0;k<10;k++)
		{
			System.out.println("Thread : k : "+k);
		}
	}
}