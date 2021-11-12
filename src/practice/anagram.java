package practice;
import java.util.ArrayList;
import java.util.Collections;
public class anagram {
public static void main(String[] args) {
	String s="sconili";
ArrayList<Character> a= new ArrayList<>();

for (int i = 0; i <s.length(); i++) {
	a.add(s.charAt(i));
}
while (true) {
	Collections.shuffle(a);
	 String s1="";
	 
	 for (Character character : a) {
		s1=s1+character;
	}
	 	if (s1.equalsIgnoreCase("SILICON")) {
			break;	
	}
}
}}

