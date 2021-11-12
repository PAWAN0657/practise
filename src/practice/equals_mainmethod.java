package practice;

public class equals_mainmethod {
public static void main(String[] args) {
	BOOK  b1=new BOOK("java");
	BOOK  b2=new BOOK("java");
	BOOK  b3=new BOOK("python");
	System.out.println(b1==b2);
	System.out.println(b1.equals(b2));
	System.out.println(b1.equals(b3));
}
}
