import java.util.Scanner;
import java.util.*;
class UncheckedException{
	Scanner sc=new Scanner(System.in);
	
	private void arithmeticexceptio(){
		int a =9;
		int b=0;
		int c=0;
		try{
			c=a/b;
		}catch(ArithmeticException e){
			System.out.println(" Error can't Divide by zero ");
		}
	}
	 
	 private static void arrayindexoutofboundException(){
		 
        int[] n = { 5, 2, 4, 5, 6, 7, 2 };
		try{
        System.out.format("The last element in the array is %d%n", n[n.length]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of index ");
		}
	 }
	
	private static void nullpointerexception(){
		ArrayList<String> list=new ArrayList();
		list.add("java");
		list.add("python");
		list.add(null);
		list.add("java");
		list.add("python");
		try{
		for(String s:list){
			System.out.println(s+" length -> "+s.length());
		}
		}catch(NullPointerException e){
			System.out.println(" there is null object in list");
		}
	}
	private void inputmismatchedexception(){
		 int num=0;
		while(true){
		try{
			System.out.println("Please input number");
			sc.next();
		num=sc.nextInt();
		if(true){
			break;
		}
		}catch(InputMismatchException e){
			System.out.println("please enter number only");
		}
		}
	 }
	public static void main(String args[]){
		
		arrayindexoutofboundException();
		nullpointerexception();
		
	}
}