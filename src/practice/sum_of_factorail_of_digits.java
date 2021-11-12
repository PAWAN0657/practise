package practice;

import java.util.Scanner;
public class sum_of_factorail_of_digits {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
		int a = sc.nextInt();
		int d;
		int sum=0;
		while(a>0)
		{
			int fact=1;//////fact should be assigned inside while so dat it could be reiniatialized to 1 after every 1 loop
			d=a%10;
			for(int i=1;i<=d;i++)
			{
		fact=fact*i;
			}
		sum=sum+fact;
		a=a/10;
		}	
		System.out.println(sum);
		
}}