class SmartPhone{
	private String model;
	private String brand_name;
	private double price;
	public SmartPhone(String model,String brand_name,double price){
		this.model=model;
		this.brand_name=brand_name;
		this.price=price;
	}
	public void setModel(String model){
		this.model=model;
	}
	public String getModel(){
		return model;
	}
	public void setBrand_name(String name){
		this.brand_name=name;
	}
	public String getBrand_name(){
		return brand_name;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
	public String toString(){
		return ""+model+" "+brand_name+" "+price;
	}
}