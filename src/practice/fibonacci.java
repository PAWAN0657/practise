package practice;

public class fibonacci {
public static void main(String[] args) {
	int n1=0;
	int n2=1;
	int i=1;
	while(i<9)
	{
		int n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		i++;
	}
	
}
}
