package testing;
public class test3 {
	yu ja;
	public static class yu
	{
		int l;
		yu obj,obj2;
		public void area(int l)
		{
			this.l=l;
			if(obj==null){
			obj2=obj;
			System.out.println("the length of the object is "+l+" "+obj+" "+obj2);}
			else{
				System.out.println(" ");}
		}
	}
	public static void main(String[] args) {
      yu obj=new yu();
//     obj=null;
     obj.area(7);
     yu obj1=null;
     System.out.println(obj1+" "+" ");
//     obj1.area(10);

	}
}
