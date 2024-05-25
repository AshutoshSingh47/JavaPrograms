package testing;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,size;
		System.out.println("enter the limit");
		n=sc.nextInt();
		size=n+(n-1);
		System.out.println(size);
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if(i==1||i==size||j==1||j==size){
					System.out.print("1"+" ");}
//				else if(i==2||i==n-1||j==2||j==size-1)
//				{
//					System.out.print("2"+" ");
//				}
				else
					System.out.print(" ");
					
			}
			System.out.println();
		}
	}

}
