package keywords;
public class use_static {
static int s=sum();
static int sum()
{ int a=3,b=4;
	int su;
	su=a+b;
	return su;
}
	public static void main(String[] args) {
		
		sum();
		System.out.println("sum = "+s);
		

	}

}
