package lists;
import java.util.*;
public class MyLinkedList {
static void func(List<Integer> ab)
{    
	long start =System.currentTimeMillis();
	System.out.println(ab);
	long end =System.currentTimeMillis();
	System.out.println(ab.getClass().getName()+"---->"+(end-start));
System.out.println(ab.getClass()+"---->"+(end-start));
	System.out.println(end+" "+start);
}
	public static void main(String[] args) {
		
     List<Integer> ll=new LinkedList();
       for(int i=0;i<1000;i++)
       {
         ll.add(i);
       }
       func(ll);
	}

}
