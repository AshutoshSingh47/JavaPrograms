package testing;
public class test2 {
 Node head;
 void add(int data)
 {
	 Node toAdd=new Node(data);
	 if(head==null)
	 {
		 head=toAdd;
		 return;
	 }
	 Node temp=head;
	 while(temp.next!=null)
	 {
		 temp=temp.next;
	 }
	 temp.next=toAdd;
 }
 boolean isEmpty()
 {
	
	 return head==null;
 }
	public static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}

	public static void main(String[] args) {
	

	}

}
