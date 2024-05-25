package testing;
import java.util.*;
public class LinkedList<E> {
	Node<E> head;
	void add(E data)
	{
		Node toAdd =new Node(data);
		if(isbooleanEmpty())
		{
			head=toAdd;
			return;
		}
		Node<E>temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=toAdd;
	}
	boolean isbooleanEmpty()
	{
		return head==null;
	}
public static class Node<E>
{
	E data;
	Node<E>next;
	public Node(E data)
	{
		this.data=data;
		next=null;
	}
}
public void printlist()
{    Node<E>n=head;
	while(n!=null)
	{
		System.out.print(n.data+" ");
		n=n.next;
	}
}
	public static void main(String[] args) {
LinkedList<String>list=new LinkedList();
for(int i=1;i<=10;i++)
{
	list.add(i+"add");
}
list.printlist();
		
	}

}

