package assignment_21_05_26;

public class Book {
String title;
String author;
double price;
public void displayBook() {
	title = "Java Tutorials";
	author = "New author";
	price = 23.50;
	System.out.println("Book details are: "+"\nTitle: "+title+"\nAuthor: "+author+"\nPrice: "+price);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Book b = new Book();
b.displayBook();
	}

}
