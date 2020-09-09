package testing;

public class test7 {
	int b[]={1,2,3,4};
  test7()
{
	this.b[3]=b[3];
	System.out.println(this.b[3]);
}
	public static void main(String[] args) {
	int a[]=new int[10];
	int n=a.length;
	test7 t=new test7();
//	for(int i=0;i<n;i++)
//	{
		System.out.print(a[0]+" ");
//	}

	}

}
