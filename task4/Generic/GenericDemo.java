import java.util.*;
class GenericDemo{
	public static void main(String args[]){
		Book b1=new Book("A Better India: A Better World","Narayana Murthy",435);
		Book b2=new Book("A Passage to India","E.M. Foster",532);
		Book b3=new Book("A Revenue Stamp","Amrita Pritam",234);
		Book b4=new Book("Death of a City","Amrita Pritam",322);
		SmartPhone phone1=new SmartPhone("iphone12","Apple",67000);
		SmartPhone phone2=new SmartPhone("iphone13","Apple",78000);
		SmartPhone phone3=new SmartPhone("galaxy j7 nxt","Samsung",12999);
		SmartPhone phone4=new SmartPhone("galaxy s20fe","Samsung",30000);
		ArrayList<Book> listOfBook=new ArrayList();
		listOfBook.add(b1);
		listOfBook.add(b2);
		listOfBook.add(b3);
		listOfBook.add(b4);
		System.out.println("__________________________________");
		System.out.println("List of Book");
		for(Book book:listOfBook){
			System.out.println(book);
		}
		System.out.println("__________________________________");
		ArrayList<SmartPhone> listOfPhone=new ArrayList();
		listOfPhone.add(phone1);
		listOfPhone.add(phone2);
		listOfPhone.add(phone3);
		listOfPhone.add(phone4);
		System.out.println("__________________________________");
		System.out.println("List of SmartPhone ");
		for(SmartPhone sm:listOfPhone){
			System.out.println(sm);
		}
		
	
	}
}