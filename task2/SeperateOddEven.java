import java.util.*;

public class SeperateOddEven{
	
	private static void seperator(){
		System.out.println("*******************");
	}//end of seperator()
	
	private static void showArray(int[] arr,String msg){
		seperator();
		System.out.println(msg);
		for(int a:arr){
			System.out.print(a+",");
		}//end for loop
		System.out.println();
		seperator();
	}//end of showArray
	
	private static int countOdd(int arr[]){
		int cntOdd=0;
		for(int a:arr){
			if(a%2!=0){
				cntOdd++;
			}//end if 
		}//end for loop
		return cntOdd;
	}//end countOdd()
	
	private static void seperateOddEven(int []arr,int size){
		int []arr2=new int[size];
		int s=0;
		int e=size-1;
		for(int i=0;i<size;i++){
			if(arr[i]%2==0){
				arr2[e--]=arr[i];
			}else{
				arr2[s++]=arr[i];
			}//end if else
		}//end for loop
		showArray(arr2,"Combine Array");
		int odd=countOdd(arr2);
		int even=size-odd;
		int []oddArray=new int[odd];
		int []evenArray=new int[even];
		 s=0;
		 e=size-1;
		for(int i=0;i<odd;i++){
			oddArray[i]=arr2[s++];
		}//end for loop

		for(int i=0;i<even;i++){
			evenArray[i]=arr2[e--];
		}//end for loop
		showArray(oddArray,"Odd Array");
		showArray(evenArray,"Even Array");
		
	}//end of seperateOddEven()
	
	/* main method*/
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
				seperator();
		System.out.println("size of array you want !!");
				seperator();
		int n=sc.nextInt();
		int arr[]=new int[n];
				seperator();
		System.out.println("Now input all "+n+" elements !!");
				seperator();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		seperateOddEven(arr,n);
		
	}//end main()
}//end class