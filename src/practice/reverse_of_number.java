package practice;
import java.util.Scanner;
public class reverse_of_number {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
		int a = sc.nextInt();
		int i;
		int rev=0;
		while(a>0)
		{
	i=a%10;
	rev=rev*10+i;
	a=a/10;
			}
		System.out.println(rev);
				}
}