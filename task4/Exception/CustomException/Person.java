class Person{
	private String name;
	private int age;
	private String address;
	public void setName(String name) throws InvalidNameException{
		boolean res=false;
		for(int i=0;i<name.length();i++){
			if(name.length()>=5){
				res=true;
			}
			else{
				throw new InvalidNameException("Length must be greater than 5");
			}
			char ch=name.charAt(i);
			boolean check =(ch>=0 || ch<=9)?false:((ch>='a' || ch<='z')?true:(ch>='A' || ch<='Z'));
			if(check){
				System.out.println("Valid Name");
				res=true;
			}else{
				throw new InvalidNameException("Number not allowed");
				
			}
		}
		if(res){
			this.name=name;
		}
		
	}
	public String getName(){
		return name;
	}
	public void setAge(int age) throws InvalidAgeException{
		boolean res=false;
		if(age<0 || age>100){
			throw new InvalidAgeException("Invalid Age");
		}
		if(res)
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress(){
		return address;
	}
}