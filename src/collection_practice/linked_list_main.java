package collection_practice;

import java.util.LinkedList;

public class linked_list_main { 
		public static void main(String[] args) 
		{   
		linked_list1 p1=new linked_list1(1200, 1, "waterbottle");   
		linked_list1 p2=new linked_list1(1400, 3, "Shampoo"); 
		LinkedList<linked_list1> l = new LinkedList();   
		l.add(p1);   
		l.add(p2);   
		linked_list1 p10=new linked_list1(5000, 1, "Mobile");   
		l.add(2, p10);   
		for(linked_list1 p:l) 
		{   
			System.out.println(p.qty+" "+p.type+" "+p.price);   
			}  
		} 
		} 
