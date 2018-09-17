package collections;

import java.util.TreeSet;
import java.util.Iterator;


//inorder to ensure uniqueness in Treeset we need to override both equals and Treecode method
//Treeset is not sorted

public class TreeSetExample implements Comparable<TreeSetExample>{

	/**
	 * @param args
	 */
	int id;
	String name;
	TreeSetExample(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSetExample s1=new TreeSetExample(7, "amar");
		TreeSetExample s2=new TreeSetExample(2, "abdhu");
		TreeSetExample s3=new TreeSetExample(2, "abdhu");
		TreeSetExample s4=new TreeSetExample(5, "audi");
		TreeSet<TreeSetExample>hs=new TreeSet<TreeSetExample>();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		//method 2
		for(TreeSetExample s:hs)
		{
			System.out.println(s.id+" "+s.name);
		}
		//method 1
		System.out.println("method2");
		Iterator<TreeSetExample>itr=hs.iterator();
		while(itr.hasNext())
		{
			TreeSetExample s=(TreeSetExample)itr.next();
			System.out.println(s.id+" "+s.name);
		}
	}
	
	
	@Override
	public int compareTo(TreeSetExample e) {
		// TODO Auto-generated method stub
		TreeSetExample ob=(TreeSetExample)e;
		int diff=0;
		diff=id-ob.id;
			return diff;
		
	}
	
}
