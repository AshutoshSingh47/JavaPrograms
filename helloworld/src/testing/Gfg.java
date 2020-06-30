package testing;
import java.util.Scanner;
class Gfg {
    public static void input(int size,int sum)
    {
        Scanner sc=new Scanner(System.in);
         int a[]=new int[size];
    for(int j=0;j<size;j++)
    {
        a[j]=sc.nextInt();
    }
    sub_array(a,size,sum);
    }
    public static void sub_array(int a[],int size,int sum)
    {
       int i,j,s,start,end,c;
       s=0;start=0;end=0;c=0;
       for(i=0;i<size;i++)
       {s=0;
       s=s+a[i];
           for(j=i+1;j<size;j++)
           {
               s=s+a[j];
               if(sum-s==0)
               {
                   start=i;
                   end=j;
                   c++;
                   break;
               }
           }
       }
       if(c>0){
       output(start,end);}
       else{System.out.println(--c);}
    }
    public static void output(int start,int end)
    {
        System.out.print(start+" "+end);
    }

public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int tc,size,sum,i;
    System.out.println("enter the test cases");
    tc=sc.nextInt();
    for(i=1;i<=tc;i++)
    {
        size=sc.nextInt();
        sum=sc.nextInt();
        input(size,sum);
    }
  }
}