import java.util.Scanner;
class Test{
	//String name,int id,String department,double salary,String address,String email,String number
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		EmployeeUtil util=new EmployeeUtil();
		
		boolean go=true;
		
		while(go){
		System.out.println("Employee App Function");
		System.out.println("-----------------------------------");
		System.out.println("press 1 for Adding Employee Data");
		System.out.println("press 2 for Searching Employee Data");
		System.out.println("press 3 for Deleting Employee Data");
		System.out.println("press 4 for Updating Employee Data");
		System.out.println("press 5 for Showing Employee Data");
		System.out.println("press 6 for exit");
		try{
		int	choose=sc.nextInt();
		switch(choose){
			case 1: //util.addEmployee(); 
					//System.out.println("Calling AddEmployee method");
					System.out.println("Employee name:");
					sc.nextLine();
					String name=sc.nextLine();
					System.out.println("Employee Id");
					String id=sc.nextLine();
					System.out.println("Employee Department");
					String department=sc.nextLine();
					System.out.println("Employee Salary");
					double salary=sc.nextDouble();
					sc.nextLine();
					System.out.println("Employee Email");
					String email=sc.nextLine();
					System.out.println("Employee number");
					String number=sc.nextLine();
					System.out.println("Employee Address");
					String address=sc.nextLine();
					Employee emp=new Employee(name,id,department,salary,address,email,number);
					System.out.println(util.insertEmployee(emp));
					//Employee emp=new Employee("Ashutosh Tigga","100","SDE",50000,"Chaibasa","ashutoshtigga@gmail.com","8743287789");
				   // Employee emp2=new Employee("Shiva Tigga","200","SSDE",90000,"Indoe","Shiva@gmail.com","3745873878");
				   // Employee emp3=new Employee("amit sharma",82,"SSDE",870000,"Indore","amit@gmail.com","4387284792");
					//System.out.println("Addind Employee"+util.insertEmployee(emp));
					//System.out.println("Addind Employee"+util.insertEmployee(emp2));
					//System.out.println("Addind Employee"+util.insertEmployee(emp3));
					break;
			case 2: //util.searchEmployee();
					System.out.println("Enter Employee Id for Searching");
					sc.nextLine();
					id=sc.nextLine();
					System.out.println(util.searchEmployee(id));
					//System.out.println(util.searchEmployeeByName("Shiva"));
					
					break;
			case 3: //util.deleteEmployeeByName();
					//System.out.println("Calling DeleteEmployee method");
					System.out.println("Enter Employee Id for Deleting");
					sc.nextLine();
					id=sc.nextLine();
					System.out.println(util.deleteEmployee(id));
					break;
			case 4: //util.updateEmployee();
					//System.out.println("Calling updateEmployee method");
					System.out.println("Enter Employee Whom you want to update");
					sc.nextLine();
					String updateid=sc.nextLine();
					System.out.println("Employee name:");
					
					 name=sc.nextLine();
					System.out.println("Employee Department");
					 department=sc.nextLine();
					System.out.println("Employee Salary");
					 salary=sc.nextDouble();
					sc.nextLine();
					System.out.println("Employee Email");
					 email=sc.nextLine();
					System.out.println("Employee number");
					 number=sc.nextLine();
					System.out.println("Employee Address");
					 address=sc.nextLine();
					 
					Employee updateemp=new Employee(name,department,salary,address,email,number);
					
					util.updateEmployee("amit",updateemp);
					break;
			case 5:
					System.out.println("******************");
					System.out.println("Employee Details");
					System.out.println("******************");
				    util.showEmployee();
			case 6:	go=false;
					break;
			
				
		}//Switch end 
		}catch(Exception e){
			System.out.println("Invalid input please select right one");
		}////try end
	}//while end
	System.out.println("Thankyou for using my Application");
}//main method end
}//end class


// Employee emp=new Employee("Ashutosh Tigga",001,"SDE",50000,"Chaibasa","ashutoshtigga@gmail.com","8743287789");
		// Employee emp2=new Employee("Shiva Tigga",002,"SSDE",90000,"Indoe","Shiva@gmail.com","3745873878");
		// EmployeeUtil util=new EmployeeUtil();
		
		// /* System.out.println("Addind Employee"+util.addEmployee(emp));
		// System.out.println("Addind Employee"+util.addEmployee(emp2));
		// System.out.println("Addind Employee"+util.addEmployee(emp));
		// System.out.println("Addind Employee"+util.addEmployee(emp));
		// System.out.println("Addind Employee"+util.addEmployee(emp)); */
		
/* 		HashSet<String> emplist=util.loadData(); */
		//for(String s:emplist){
			
		//	System.out.println(s);
	//	}
	//	System.out.println(util.deleteEmployeeByName("shiva"));
	//	util.showEmployee();
