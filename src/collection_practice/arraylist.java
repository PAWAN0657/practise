package collection_practice;

import java.util.ArrayList;
import java.util.Collection;

public class arraylist{
	public static void main(String[] args) {
	Collection<String> c=new ArrayList<>();
	c.add("robert");
	c.add("alex");
	c.add("rick");
	c.add("edward");
	Collection<String> c1=new ArrayList<>();
	c1.add("modi");
	c1.add("rahul");
	c1.add("amith");
	c1.add("mamatha");
	Collection<String> c2=new ArrayList<>();
	c2.add("gandhi");
	
	Collection<String> c3=new ArrayList<>();
	c3.addAll(c);
	c3.addAll(c1);
	c3.addAll(c2);
	System.out.println(c3.size());
	System.out.println(c3.isEmpty());
	c3.add(null);
	System.out.println(c3);
	c.remove("robert");
	System.out.println(c);
	c3.removeAll(c1);
	System.out.println(c3.containsAll(c));
	Object[] array = c3.toArray();
	
	}
}
