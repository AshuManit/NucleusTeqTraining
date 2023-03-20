class Rectangle extends Shape{
	int l;
	int w;
	public  void perimeter(){
		System.out.println("perimeter of Rectangle"+(2*(l+w)));
	}
	public  void area(){
		System.out.println("Area of Rectangle"+(w*l));
	}
}