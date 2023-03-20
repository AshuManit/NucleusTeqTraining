public class Highest{
	public static void main(String args[]){
		int a=4;
		int b=8;
		int c=0;
		System.out.println((a>b && a>c)?a:(b>a && b>c)?b:c);
	}
}