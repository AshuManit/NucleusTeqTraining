package student;
class StudentTest{
	public static void main(String args[]){
		Student s1=new Student();
		s1.setRollNumber(101);
		s1.setName("Ashu");
		s1.setCourse("MCA");
		s1.setMarks1(65);
		s1.setMarks2(85);
		s1.setMarks3(78);
		System.out.println(s1);
		System.out.println("***************\n");
		Student s2=new Student();
		s2.setRollNumber(102);
		s2.setName("Arvind");
		s2.setCourse("MCA");
		s2.setMarks1(54);
		s2.setMarks2(32);
		s2.setMarks3(45);
		System.out.println(s2);
		System.out.println("***************\n");
		
		Student s3=new Student();
		s3.setRollNumber(103);
		s3.setName("Shiva");
		s3.setCourse("MCA");
		s3.setMarks1(35);
		s3.setMarks2(25);
		s3.setMarks3(8);
		System.out.println(s3);
		System.out.println("***************\n");
		
		Student s4=new Student();
		s4.setRollNumber(104);
		s4.setName("Amit");
		s4.setCourse("MSC");
		s4.setMarks1(99);
		s4.setMarks2(95);
		s4.setMarks3(88);
		System.out.println(s4);
		System.out.println("***************\n");
		Student s5=new Student();
		s5.setRollNumber(105);
		s5.setName("Sanu");
		s5.setCourse("BSC");
		s5.setMarks1(97);
		s5.setMarks2(88);
		s5.setMarks3(86);
		System.out.println(s5);
	}
}