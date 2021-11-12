package practice;

public class BOOK {
String title;

public BOOK(String title)
{
	this.title=title;
}
public boolean equals(BOOK b) {
	if(title==b.title) {
	return true;
	}
	else
	return false;
}

}