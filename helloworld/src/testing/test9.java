package testing;

public class test9 {

	public static void main(String[] args) {
		int i,j;
		i=0;j=0;
		int a[]={1,2,3,4,5};
		int b[]={2,5,6,7};
		while(i<a.length && j<b.length)
		{  
			if(a[i]<b[j])
			System.out.print(a[i++]+" ");
			else if(a[i]>b[j])
			System.out.print(b[j++]+" ");
			else //if(a[i]==b[j])
				i++;
			System.out.print(b[j++]+" ");
		}
	}
}
