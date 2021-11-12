package collection_practice;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class linked_list {
public static void main(String[] args) {
	List<String> l=new LinkedList();
	l.add("red");
	l.add("yellow");
	l.add("white");
	l.add("red");
	l.add("null");
	l.add("orange");
	l.add("null");
	System.out.println("list "+l);
	Set <String> s=new HashSet();
s.add("red");
s.add("yellow");   
s.add("white");   
s.add("red");
s.add(null);   
s.add("orange");   
s.add(null);   
System.out.println("Set "+s);
}
}
