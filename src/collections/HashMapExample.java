package collections;

import java.util.HashMap;

public class HashMapExample {

	/**
	 * @param args
	 */

	int id;
	String name;
	HashMapExample(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>hm=new HashMap<Integer, String>();
		hm.put(6, "nandhu");
		hm.put(2, "sath");
		hm.put(2, "avd");
		for(Integer key:hm.keySet())
		{
			System.out.println(hm.get(key));
		}
		
		
	}

}
