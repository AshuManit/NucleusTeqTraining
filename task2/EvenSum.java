public class EvenSum{
	private static int sumOfEven(int []a){
		int res=0;
		for(int n:a){
			if(n%2==0){
				res=res+n;
			}
		}
		return res;
	}
	private static void showNum(int []a){
		for(int n:a)
		{
			if(n%2==0){
			System.out.println(n+" *");
			continue;
			}
			System.out.println(n);
		}
	}
	public static void main(String arg[]){
		int []a={1,2,3,4,5,6,7,8};
		showNum(a);
		int sum=sumOfEven(a);
		System.out.println(sum);
	}
}