package keywords;
import java.util.Scanner;
public class use_final {
final static double pi=3.14;
public static void area(int  r)
{
	double ar;double ra;
	ra=(double)r;
	ra=ra*ra;
	System.out.println("radius = "+ra);
	ar=pi*ra;
	System.out.println("area = "+ar);
}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int r;
	System.out.println("enter the radius");
	r=sc.nextInt();
	area(r);

	}

}
