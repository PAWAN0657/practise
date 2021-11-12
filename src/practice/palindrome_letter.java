package practice;


public class palindrome_letter {
public static void main(String[] args) {
	String s1="MALAYALAM";
	char[] a= {};
	a=s1.toCharArray();        /// converts string to char array
	
	for (int i = 0; i < a.length/2; i++) {
		char t=a[i];
		a[i]=a[a.length-1-i];
		a[a.length-1-i]=t;
		}
	String s3=new String(a);//////it converts char array to string object
	
if(s3.equalsIgnoreCase(s1))
{
	System.out.println("it is palindrome");
	
}
else
	System.out.println("not");
}
}


