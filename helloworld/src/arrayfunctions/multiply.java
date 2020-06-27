package arrayfunctions;
import dummy.product_ofarray;
import java.util.Scanner;
public class multiply {
public static void get_input(int row,int column)
{
	int i,j;
	 Scanner sc=new Scanner(System.in);
	int a[][]=new int[row][column];
	int b[][]=new int[row][column];
	System.out.println("enter elements for first array");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
			a[i][j]=sc.nextInt();
	}
	System.out.println("enter elements for second array");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
			
			b[i][j]=sc.nextInt();
	}
	show_input(a,b);
}
	public static void show_input(int a[][],int b[][])
	{
		int row,column,i,j;
		
		row=a.length;
		column=row;
		System.out.println("\nshowing elements of first array");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++){
				System.out.print(a[i][j]+" ");}
			System.out.println();
			}
		System.out.println("\nshowing elements of second array");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++){
				System.out.print(b[i][j]+" ");}
			System.out.println();
			}
		product_ofarray pro=new product_ofarray();
		pro.product(a,b);
		
	}

}
