package collections;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args)
	{
		ArrayList<Object> a = new ArrayList<Object>();
		a.add(10);
		a.add("babu");
		a.add(12.3f);
		a.add(20);
		a.add(45);
		a.add(10);
		
		System.out.println(a);
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
		
		System.out.println(a.get(1));
		
		System.out.println(a.indexOf("babu"));
		
		System.out.println(a.hashCode());
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println(a);
		a.add(40);
		
		System.out.println(a);
		
		a.add(1, "jogi");
		
		System.out.println(a);
		
		a.set(1, "sankeerth");
           System.out.println(a);
           
           System.out.println(a.subList(2, 6));
           
           a.remove(0);
           System.out.println(a);
           
           a.remove("babu");
           System.out.println(a);
           
           a.clear();
           System.out.println(a);
	}

}
