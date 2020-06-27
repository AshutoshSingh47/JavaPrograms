package arrayfunctions;
import java.util.Scanner;
public class BubbleSorting {

	public static void main(String[] args) {
		int i,j,n,temp;
		Scanner sc=new Scanner(System.in);
System.out.println("enter the size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
	for(j=0;j<n-i-1;j++)
	{
		if(a[j]>a[j+1])
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
}
for(j=0;j<n;j++)
{
	System.out.print(a[j]+" ");
}
	}

}
