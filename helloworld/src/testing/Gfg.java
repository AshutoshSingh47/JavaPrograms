package testing;
import java.util.Scanner;
class Gfg {
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int tc,size,sum,i,j,s,start,end,c;boolean b=false;
     s=0;start=0;end=0;c=0;
    System.out.println("enter the test cases");
    tc=sc.nextInt();
        for(int k=1;k<=tc;k++){
        size=sc.nextInt();
         sum=sc.nextInt();
        int a[]=new int[size];
    for(j=0;j<size;j++)
    {
        a[j]=sc.nextInt();
    }
       for(i=0;i<size;i++)
       { 
         s=s+a[i];
           for(j=i+1;j<size;j++)
           {
               s=s+a[j];
               if(s==sum)
               {
                   start=i;
                   end=j;
                   c++;
                   b=true;
                   break;
               }
           }
           if(b){break;}
           else{
           s=0;}
       }
       if(c>0){
    	   System.out.println(start+" "+end); }
       else{System.out.println(--c);}}
    }
  }