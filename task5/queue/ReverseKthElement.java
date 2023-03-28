import java.util.*;
public class ReverseKthElement{
	private static Queue<Integer> queue=null;
	
	public static void reverseKthElement(int k){
		if(k >queue.size() || queue.isEmpty() || k<=0)
			return;
		
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<k;i++){
			stack.push(queue.peek());
			queue.remove();
		}
		while(!stack.empty()){
			queue.add(stack.peek());
			stack.pop();
		}
		for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
		
	}//end of reverseKthElement()
	
	public static void main(String args[]){
		queue=new LinkedList<Integer>(List.of(1,2,3,4,5,6,7,8,9));
		int k=4;
		System.out.println("Before Reverse"+queue);
		reverseKthElement(k);
		System.out.println("After Reverse of "+k+"th Element "+queue);
	}//end of main method
}//end of class