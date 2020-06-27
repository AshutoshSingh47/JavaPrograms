package testing;

public class merging {

	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		int b[]={6,7,8,9,10};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
        for(int j=a.length,k=0;j<c.length;j++)
        {
        	c[j]=b[k++];
        }
        for(int i:c)
		{
			System.out.print(i+" ");
		}

	}

}
