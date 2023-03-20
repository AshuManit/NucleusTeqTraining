package wildgeneric;
import java.util.*;
public class GenericDemo {
	
	//Unbounded Wildcard: 
	public static void unbound(ArrayList<?> list){
		System.out.println("Unbounded Wildcard"+list);
	}
	
	//Upper Bounded Wildcards: 
	public static void upper(ArrayList<? extends Animal> list){
		System.out.println("Upper Bounded Wildcards:");
		for(Animal obj:list){
			obj.Eat();
			//obj.swim();
		}
	}
	
	//Lower Bounded Wildcards: 
	public static void lower(ArrayList<? super Fish> list){
		System.out.println("Lower Bounded Wildcards:");
		for(Object obj:list){
			((Animal) obj).Eat();
			((Fish) obj).swim();
			//obj.swim();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Birds> listOfBird=new ArrayList();
		ArrayList<Fish> listOfFish=new ArrayList();
		listOfBird.add(new Birds());
		listOfBird.add(new Birds());
		listOfBird.add(new Birds());
		listOfBird.add(new Birds());
		listOfFish.add(new Fish());
		listOfFish.add(new Fish());
		listOfFish.add(new Fish());
		listOfFish.add(new Fish());
		unbound(listOfFish);
		unbound(listOfBird);
		upper(listOfFish);
		lower(listOfFish);
		//lower(listOfBird);
		}

}
