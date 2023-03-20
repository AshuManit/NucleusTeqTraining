package student;
class Student{
	/* property*/
	private int rollNumber;
	private String name;
	private String course;
	private int marks1;
	private int marks2;
	private int marks3;
	
	/* methods*/
	public int calculateTotal(){
		return marks1+marks2+marks3;
	}
	
	public double calculateAverage(){
		return (marks1+marks2+marks3)/3;
	}
	
	public char calculateGrade(){
		if(calculateAverage()>=80){
			return 'A';
		}else if(calculateAverage()<80 && calculateAverage()>=60){
			return 'B';
		}else if(calculateAverage()<60 && calculateAverage()>=45){
			return 'C';
		}else if(calculateAverage()<45 && calculateAverage()>=33){
		    return 'D';
		}else {
			return 'F';
		}
	}
	
	/*Setter*/
	public void setRollNumber(int rollNumber){
		this.rollNumber=rollNumber;
	}	
	public void setName(String name){
		this.name=name;
	}
	public void setCourse(String course){
		this.course=course;
	}
	public void setMarks1(int marks){
		this.marks1=marks;
	}
	public void setMarks2(int marks){
		this.marks2=marks;
	}
	public void setMarks3(int marks){
		this.marks3=marks;
	}
	
	/*Getter*/
	public int getRollNumber(){
		return rollNumber;
	}
	
	public String getName(){
		return name;
	}
	public String getCourse(){
		return course;
	}
	public int getMarks1(){
		return marks1;
	}
	public int getMarks2(){
		return marks2;
	}
	public int getMarks3(){
		return marks3;
	}
	
	public String toString(){
		return "Student name:"+name+
		"\nRollNumber:"+rollNumber+
		"\nCourse:"+course+
		"\nMarks1:"+marks1+
		"\nMarks2:"+marks2+
		"\nMarks3:"+marks3+
		"\nAverage:"+calculateAverage()+
		"\nGrade:"+calculateGrade();
	}
}