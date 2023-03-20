/*
  add employee
  delete employee
  search employee
  sort employee
  show employee
*/
class Employee{
	 private String emp_name;
	 private String emp_id;
	 private String emp_department;
	 private double emp_salary;
	 private String emp_address;
	 private String emp_email;
	 private String emp_number;
	 public Employee(){
		 
	 } 
	 public Employee(String name,String id,String department,double salary,String address,String email,String number){
		 this.emp_id=id;
		 this.emp_name=name;
		 this.emp_department=department;
		 this.emp_salary=salary;
		 this.emp_address=address;
		 this.emp_email=email;
		 this.emp_number=number;
	 }
	 public String getEmp_number(){
		 return this.emp_number;
	 }
	 public String getEmp_name(){
		 return this.emp_name;
	 }
	 public String getEmp_id(){
		 return this.emp_id;
	 }
	 public String getEmp_department(){
		 return this.emp_department;
	 }
	 public double getEmp_salary(){
		 return this.emp_salary;
	 }
	 public String getEmp_address(){
		 return this.emp_address;
	 }
	 public String getEmp_email(){
		 return this.emp_email;
	 }
	 public void setEmp_number(String number){
		 this.emp_number=number;
	 }
	 public void setEmp_name(String name){
		 this.emp_name=name;
	 }
	 public void setEmp_id(String id){
		 this.emp_id=id;
	 }
	 public void setEmp_department(String department){
		 this.emp_department=department;
	 }
	 public void setEmp_salary(double salary){
		 this.emp_salary=salary;
	 }
	 public void setEmp_address(String address){
		 this.emp_address=address;
	 }
	 public void setEmp_email(String email){
		 this.emp_email=email;
	 }
	 public String hashCode(){
		// String code=this.emp_name.toLowerCase().hashCode();
		 return emp_id;
	 }
}