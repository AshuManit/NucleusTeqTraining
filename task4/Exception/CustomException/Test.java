class Test{
	public static void main(String args[]){
		Person p1=new Person();
		/* try{
			p1.setName("ashu1");
		}catch(InvalidNameException e){
			System.out.println(e);
		} */try{
			p1.setName("ashu");
		}catch(InvalidNameException e){
			System.out.println(e);
		}
		try{
			p1.setAge(11);
		}catch(InvalidAgeException e){
			System.out.println(e);
		}
		
	}
}