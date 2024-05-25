package dummy;
import java.util.Scanner;
public class dup_remover {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,n,extract,j,k,c;
		c=0;
		System.out.println("enter the size");
		n=sc.nextInt();
		int a[]=new int[n];
		int freq[]=new int[9];
		int b[]=new int[9];
		System.out.println("enter elements");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}		
		for(i=0;i<n;i++)
		{
			extract=a[i];
			freq[extract]++;
		}
		for(k=0;k<9;k++){
		System.out.println(k+ " = "+freq[k]);}
		System.out.println();
		for(j=0;j<9;j++)
		{
			if(freq[j]>=1)
			{
				b[j]=j;
			}
			else{
				b[j]='*';
			}
		}		
		System.out.print("filtered array = ");
		for(k=0;k<9;k++)
		{if(b[k]>=0 && b[k]!='*'){
		System.out.print(b[k]+" ");}
		}
	}
}

