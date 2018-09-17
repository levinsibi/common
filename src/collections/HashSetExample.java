package collections;

import java.util.HashSet;
import java.util.Iterator;


//inorder to ensure uniqueness in hash set we need to override both equals and hashcode method
//hashset is not sorted

public class HashSetExample{

	/**
	 * @param args
	 */
	int id;
	String name;
	HashSetExample(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetExample s1=new HashSetExample(7, "amar");
		HashSetExample s2=new HashSetExample(2, "abdhu");
		HashSetExample s3=new HashSetExample(2, "abdhu");
		HashSetExample s4=new HashSetExample(5, "audi");
		HashSet<HashSetExample>hs=new HashSet<HashSetExample>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		//method 2
		for(HashSetExample s:hs)
		{
			System.out.println(s.id+" "+s.name);
		}
		//method 1
		System.out.println("method2");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			HashSetExample s=(HashSetExample)itr.next();
			System.out.println(s.id+" "+s.name);
		}
	}
	//@Override
	/*public int compareTo(HashSetExample arg0) {
		// TODO Auto-generated method stub
		int diff=0;  
		diff=id-arg0.id;
		return diff;
		
	}*/
	public boolean equals(Object e)
	{
		HashSetExample ob=(HashSetExample)e;
		if(ob.id==id)
			return true;
		else
			return false;
	}
	public int hashCode()
	{
		return id;
	}
}
