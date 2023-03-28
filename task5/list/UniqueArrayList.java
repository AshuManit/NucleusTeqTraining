

/*WAP(write a program) to store only unique elements in arraylist .
e.g list - [1,2,1,2,1,2,1,2,1]
o/p list- [1,2]
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.*;
public class UniqueArrayList {
	public static ArrayList usingSet(ArrayList list) {
		HashSet<Integer> set=new HashSet<Integer>(list);
		ArrayList<Integer> res=new ArrayList<Integer>(set);
		return res;
	}
	public static ArrayList usingStream(ArrayList list){
		return  (ArrayList)list.stream().distinct().collect(
                Collectors.toList());
	}
	public static ArrayList usingContains(ArrayList<Integer> list){
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for(Integer i:list){
			if(!list1.contains(i))
				list1.add(i);
		}
		return list1;
		
	}
	public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(1);
		ArrayList<Integer> res=usingSet(list);
		System.out.println("Using set "+res);
		System.out.println("using Stream API "+usingStream(list));
		System.out.println("using Contains Method "+usingContains(list));
	}
}
