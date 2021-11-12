package practice;

public class palindrome_letter1 {
public static void main(String[] args) {
	String s="MALAYALAM";
	String s1="";
	 for (int i = s.length()-1; i>=0; i--) {
		s1=s1+s.charAt(i);
		}
	 if(s1.equalsIgnoreCase(s))
	 {
	 	System.out.println("it is palindrome");
	 	
	 }
	 else
	 	System.out.println("not");
	 }
}
