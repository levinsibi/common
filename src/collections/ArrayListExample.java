package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	int id;
	String name;
	ArrayListExample(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayListExample s1=new ArrayListExample(5, "LEvin");
		ArrayListExample s2=new ArrayListExample(3, "vivek");
		ArrayList<ArrayListExample>al=new ArrayList<ArrayListExample>();
		al.add(s1);
		al.add(s2);
		//method 1 to get contents
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			ArrayListExample s=(ArrayListExample)itr.next();
			System.out.println(s.id+" "+s.name);
		}
		//method 2
		for(ArrayListExample ob:al)
		{
			System.out.println(ob.id+" "+ob.name);
		}
	}

}
