import java.util.*;
class SetDemo{
	public static void main(String args[]){
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(1);
		set.add(3);
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(1);
		set.add(1);
		set.add(2);
		System.out.println(set);
	}
}