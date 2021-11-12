package practice;

public class max_in_array {
public static void main(String[] args) {
	int[] a= {12,75,56,102,42,12,99};
	int max=a[0];
	
	for (int i = 0; i < a.length; i++) {
		if(a[i]>max)
		{
			max=a[i];
		}
	}
System.out.println(max);

}
}
