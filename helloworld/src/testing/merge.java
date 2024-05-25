package testing;

public class merge {

	public static void main(String[] args) {
		int n=6,index=2;
		int temp;
		temp=0;
		int a[]={1,2,3,4,5};
		int c[]=new int[a.length+1];
		  for (int i = 0; i < a.length + 1; i++) { 
	            if (i < index ) 
	                c[i] = a[i]; 
	            else if (i == index) 
	                c[i] = n; 
	            else
	                c[i] = a[i-1]; 
	        } 
		for(int i:c)
		{
			System.out.print(i+" ");
		}

	}

}
