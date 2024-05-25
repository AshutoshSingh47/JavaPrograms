package company;
//import java.util.Maths;
import java.util.Arrays;
import java.util.Scanner;
public class candies {
	public static long candy(int[]a,int n)
	{
		int c[]=new int[n];
		long sum;
		sum=0;
		Arrays.fill(c,1);
		for(int i=1;i<n;i++)
		{
			if(a[i]>a[i-1])
				c[i]=c[i-1]+1;	
		}
		for(int j=n-2;j>=0;j--)
		{
			if(a[j]>a[j+1])
			c[j]=Math.max(c[j+1]+1,c[j]);
		}
		for(int item:c)
		{
			System.out.println(item+" ");
		}
		for(int k=0;k<n;k++)
		{
			sum=sum+c[k];
		}
		return sum;
	
	}

	public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
int n;long sum;
int a[]={1,3,5,2};
n=a.length;
sum=candy(a,n);
System.out.println("\nsum = "+sum);
	}

}
