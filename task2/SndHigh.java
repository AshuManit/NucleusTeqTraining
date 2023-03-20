public class SndHigh{

	public static int solve(int []arr){

		int h;
		int s;
		if(arr[0]>arr[1])
		{
			h=arr[0];
			s=arr[1];
		}else {
			h=arr[1];
			s=arr[0];
		}
		for(int p=2;p<arr.length;p++){
			if(arr[p]<s){
				continue;
			}else if(arr[p]>s && arr[p]<h){
				s=arr[p]; 
			}else if(arr[p]>s && arr[p]>h){
				s=h;
				h=arr[p];
			}	
		}
		return s;
	}
	
	public static void main(String arg[]){
		int []arr={5,3,7,1,8};
		System.out.println(solve(arr));
		

	}
}