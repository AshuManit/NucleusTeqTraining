public class SecondMin{
	private static int sndhigh(int []arr){
		int f;
		int s;
		if(arr[0]<arr[1])
		{
			f=arr[0];
			s=arr[1];
		}else{
			f=arr[1];
			s=arr[0];
		}
		for(int p=2;p<arr.length-1;p++){
			if(p<s && p<f){
				f=p;
			}else if(p<s && p>f){
				s=p;
			} 
		}
		return s;
	}
	public static void main(String []a){
		int []arr={83,98,32,13,34,0,4,9,10,3,5,30,23,94,1};
		System.out.println(sndhigh(arr));
	}
}