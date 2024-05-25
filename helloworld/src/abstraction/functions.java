package abstraction;
public abstract class functions {
public abstract double area();
}
class circle extends functions
{  final static double pi=3.14;
	@Override
	public double area()
	{
		double ra=5.0;
		return pi*(Math.pow(ra,2));
	}
  public static void main(String[] args) {
		functions cir=new circle();
		System.out.println("area = "+cir.area());
	}
}
