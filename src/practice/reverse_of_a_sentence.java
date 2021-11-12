package practice;

public class reverse_of_a_sentence {
public static void main(String[] args) {
	String s = "I live in India";
	String[] s1 = s.split(" ");
	String rev= "";
	
	for (int i = s1.length - 1; i >= 0; i--) {
	  rev = rev+(s1[i]+" ");
	}
	System.out.println(rev);
}
}
