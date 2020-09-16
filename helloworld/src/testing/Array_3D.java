package testing;
import java.util.Scanner;
public class Array_3D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int i,j,k;
	int a[][][]={{{1,2},{3,4},{5,6}},{{7,8},{9,10},{11,12}}};
//for(i=0;i<2;i++)
//{
//	for(j=0;j<3;j++)
//	{
//		for(k=0;k<2;k++)
//		{
//			a[k][j][i]=sc.nextInt();
//		}
//	}
//}
for(i=0;i<2;i++)
{
	for(j=0;j<3;j++)
	{
		for(k=0;k<2;k++)
		{
			System.out.print(a[k][j][i]+" ");
		}
		System.out.println();

	}
	System.out.println();
}
	}
}
