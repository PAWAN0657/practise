package practice;

import java.util.Scanner;

public class perfect_number {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a = sc.nextInt();
	int temp=a;
	int sum=0;
	for(int i=1;i<=a/2;i++)
	{
		if(a%i==0)
		{
			sum=sum+i;
		}
	}
if(sum==temp)
{
	System.out.println("perfect number");
}
else
	System.out.println("not a perfect number");
}
}
