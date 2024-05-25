package dummy;

public class product_ofarray {
	public void product(int c[][],int d[][])
	{
		int row,column,i,j,k;
		row=c.length;
		column =row;
		int e[][]=new int[row][column];
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{e[i][j]=0;
				for(k=0;k<row;k++){
					e[i][j]+=c[i][k]*d[k][j];}
				
			}
		}
		show(e);
		
	}
public void show(int e[][])
{
	int size,i,j;
	size=e.length;
	System.out.println("\nproduct of both the matrices are");
	for(i=0;i<size;i++)
	{
		for(j=0;j<size;j++){
			System.out.print(e[i][j]+" ");}
		System.out.println();
		}
}

}
