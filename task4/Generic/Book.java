class Book{
	
	private String book_title;
	private String book_authorName;
	private double book_price;
	public Book(String book_title,String book_authorName,double book_price){
		this.book_authorName=book_authorName;
		this.book_price=book_price;
		this.book_title=book_title;
	}
	public void setBook_title(String book_title){
		this.book_title=book_title;
	}
	public String getBook_title(){
		return book_title;
	}
	public void setBook_authorName(String name){
		this.book_authorName=name;
	}
	public String getBook_authorName(){
		return book_authorName;
	}
	public void setBook_price(double price){
		this.book_price=price;
	}
	public double getBook_price(){
		return book_price;
	}
	public String toString(){
		return ""+book_title+" "+book_authorName+" "+book_price;
	}
}