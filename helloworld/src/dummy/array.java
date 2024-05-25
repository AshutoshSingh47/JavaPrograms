package dummy;

public class array {

	public static void main(String[] args) {
   int a[]={1,2,3,4,5,6,7,8,9,0};
   int b[]=new int[20];
   int j;
   j=0;
   for(int i=0;i<a.length;i++)
   {//if(a[i]%2==0)
	  b[j++]=a[i];  
	  j++;
   }
   for(int k:b)
   {
	   System.out.print(k);
   }
}
}