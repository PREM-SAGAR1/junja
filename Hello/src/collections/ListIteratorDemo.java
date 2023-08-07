package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args)
	{
		 ArrayList<String>a = new ArrayList<String>();
		 a.add("oracle");
		 a.add("oakti");
		 a.add("vmea");
		 a.add("babu");
		 
		 System.out.println(a);
		 ListIterator<String> val = a.listIterator();
		 
		 while(val.hasNext())
		 {
			 String var = val.next();
			 if(var.equals("vmea"))
			 val.set("durga");
			 else
				 val.remove();
		 }
		 System.out.println(a);

	}

}
