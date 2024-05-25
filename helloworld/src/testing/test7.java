package testing;

public class test7 {
	
	int b[]={1,2,3,4};
  test7()
{
	  test6 ti=new test6();
	  ti.a=this.b[0];;
//	  this.b=null;
	  System.out.println("ti.tt = "+ti.tt+" "+"ti = "+ti+" "+"ti.a = "+ti.a);
	  System.out.println("this.b = "+this.b[0]);
	b[1]=b[3];
	this.b[0]=b[2];
	System.out.println("this.b = "+this.b[0]);
	System.out.println(b[3]+" "+b[1]+" "+this.b);
	for(int e:this.b){
		System.out.print(e+" ");}
	System.out.println();
	for(int u:this.b){System.out.print(b);}
}
	public static void main(String[] args) {
	int a[]=new int[10];
	int n=a.length;
	test7 t=new test7();
//	for(int i=0;i<n;i++)
//	{
		System.out.print("\n"+a[0]+" "+t.b[0]+"\n");
//	}
		for(int i:t.b)
			System.out.print(i+" ");

	}

}
