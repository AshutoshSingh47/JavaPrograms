package arrayfunctions;
import java.util.Scanner;
public class selectionsort {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int min,temp,i,j,n;
System.out.println("enter the size");
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
for(i=0;i<n-1;i++)
{     min=i;
	for(j=i+1;j<n;j++)
	{ 
		if(a[min]>a[j])
		{    min=j;
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;					
		}
	}
}
for(j=0;j<n;j++)
{
	System.out.print(a[j]+" ");
}
	}

}
