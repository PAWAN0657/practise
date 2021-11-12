package practice;

import java.util.Scanner;

public class char_is_digit_alphabet_or_special_character {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the data");
char a=sc.next().charAt(0);

if(a>='a' && a<='z' || a>='A' && a<='Z')
{
	System.out.println("it is aplphabet");
}
else if(a>='0' && a<='9')
{
	System.out.println("it is a digit");
}
else
	System.out.println("it is special character");

}}
