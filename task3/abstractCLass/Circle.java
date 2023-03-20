class Circle extends Shape{
	int radius;
	public  void perimeter(){
		System.out.println("perimeter of Circle"+2*Math.PI+radius);
	}
	public  void area(){
		System.out.println("Area of Circle"+(Math.PI*Math.pow(radius,2)));
	}
}