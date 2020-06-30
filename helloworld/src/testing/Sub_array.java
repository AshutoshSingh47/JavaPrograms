package testing;
import java.util.Scanner;
public class Sub_array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int i,j,n,s,sum,start,end,c;
	s=0;sum=0;start=0;end=0;c=0;
	int a[]={3,4,5,1,2};
	n=a.length;
	System.out.println("Please enter the sum of the original array");
	sum=sc.nextInt();
	if(sum==0)
	{
		System.out.println("INVALID");
	}
	for(i=0;i<n;i++)
	{  s=0;
		s=s+a[i];
	    for(j=i+1;j<n;j++){
	    	s=s+a[j];
	    	if(sum-s==0){start=i;
	    	end=j;
	    	c++;
	    	break;}	    	
     		
	    	}
	}
 if(c>0){
	for(int k=start;k<=end;k++)
{
	System.out.print(a[k]+" ");
}
 }
 else
 {
	 System.out.println(--c);
 }

	}

}
