package practice;

public class leap_year {
public static void main(String[] args) {
	int i=500;
	if (i%4==0&&i%400==0||i%100!=0) {
		System.out.println("leap year");
	}
	else
		System.out.println("non leap year");
}
}
