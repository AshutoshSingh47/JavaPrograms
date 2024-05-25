package sorting_algorithms;

public class Insertion_Sort {

	public static void main(String[] args) {
		int key,temp=0;
		int arr[]= {12,11,13,5,6};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			key=0;
			
			for(int j=1;j<n;j++)
			{
				if(arr[j]<arr[key])
					{
					  temp=arr[j];
					  arr[j]=arr[key];
					  arr[key]=temp;
					}
				  key=j;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
}
}
