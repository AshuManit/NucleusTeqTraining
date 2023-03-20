import java.util.*;
class WildcardTest{
	public static void main(String args[]){

		
		ArrayList<?> list=new ArrayList();
		list.add(023);
		list.add(02433);
		list.add(2342023);
		list.add(0523);
		list.add("023");
		System.out.println();
		System.out.println("random list of items");
		
	}
}