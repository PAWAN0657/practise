package practice;

import java.util.ArrayList;
import java.util.Collection;

public class reverse_word {
public static void main(String[] args) {
	String s="I am Indian";
	String s1="";
	
	for (int i =s.length()-1;i>=0; i--) {
		s1=s1+s.charAt(i);
		}
System.out.println(s1);

String[] split = s1.split(" ");
String s3="";
for (int i = split.length-1;i>=0; i--) {
	s3=s3+split[i]+" ";
}
System.out.println(s3);
Collection<String> c=new ArrayList();
}
}
