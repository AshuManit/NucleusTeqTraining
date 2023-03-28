/* 1. WAP to count frequency of give list of digit and alphabet in string .
i/p {1,1,2,2}  --> 1= 2, 2=2
believe in yourself -->  e=4 , b=1 etc 
 */
 import java.util.*;
class CountFrequency{
	public static void main(String args[]){
		ArrayList<Integer> list=new ArrayList<Integer>(List.of(1,1,2,2));
		System.out.println(list);
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(Integer element:list){
			if(map.containsKey(element)) {
				map.put(element,map.get(element)+1);
			}else{
				map.put(element,1);
			}
		}
		map.forEach((key,value)-> System.out.println("Key= "+key+" Value= "+value));
	}
}