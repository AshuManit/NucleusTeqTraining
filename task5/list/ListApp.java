import java.util.Scanner;
import java.util.*;
class ListApp{
	private static List<Integer> list=new ArrayList<Integer>();
	private static void addElement(Integer element){
		list.add(element);
		System.out.println("Added Sucessfully");
	}
	private static void removeElement(Integer element){
		if(list.contains(element)){
			list.remove(element);
			System.out.println("Removed Succesfuly ");
			
		}else
			System.out.println("ELement does't exists");
	}
	public static void display(){
		System.out.print("[ ");
		for(Integer element:list){
			System.out.print(element+" ");
		}
		System.out.println("]");
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		boolean go=true;	
		
		while(go){
		System.out.println("List App Function");
		System.out.println("-----------------------------------");
		System.out.println("press 1 for Adding ");
		System.out.println("press 2 for Removing ");
		System.out.println("press 3 for Showing ");
		System.out.println("press 4 for exit");
		try{
		int	choose=sc.nextInt();
		switch(choose){
			case 1:
					addElement(sc.nextInt());
					break;
			case 2:
					removeElement(sc.nextInt());
					break;
			case 3:
					display();
					break;
			case 4:	go=false;
					break;
				
		}//Switch end 
		}catch(Exception e){
			System.out.println("Invalid input please select right one");
		}////try end
	}//while end
	System.out.println("Thankyou for using my Application");
}//main method end
}//end class

