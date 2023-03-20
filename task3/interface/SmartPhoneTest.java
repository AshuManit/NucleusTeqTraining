class SmartPhoneTest{
	public static void main(String args[]){
		SmartPhone phone1=new SmartPhone();
		System.out.println(phone1);
		phone1.call();
		phone1.sms();
		phone1.click();
		phone1.record();
		phone1.play();
		phone1.stop();
		System.out.println("***********\n");
		SmartPhone phone2=new SmartPhone();
		System.out.println(phone2);
		phone1.call();
		phone1.sms();
		phone1.click();
		phone1.record();
		phone1.play();
		phone1.stop();
	}
}