package lists;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class MyArrayList {
	public static void main(String[] args) {
		pair<String,Integer> obj=new pair();
		pair<Boolean,Double> obj2=new pair(); 
		obj.getDescription("Ashu", 19);
		obj2.getDescription(true, 46.55);
		List<Integer> value=new LinkedList();
		List<Integer> alphabets=new ArrayList();
		value.add(3);
		value.add(4);
		value.add(6);
		alphabets.add(7);
		alphabets.add(8);
		alphabets.add(9);
		value.addAll(alphabets);
		Integer []x=new Integer[value.size()];
    	value.toArray(x);
		System.out.print(value+"\n");
		for(int e:x)
		{
			System.out.print(e+" ");
		}
		value.removeAll(alphabets);
			System.out.print("\n"+value);
		

	}

}
