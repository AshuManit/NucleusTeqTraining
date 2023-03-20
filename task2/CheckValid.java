import java.util.Scanner;
class CheckValid{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		String res=(pin==443122)?"Valid":"Invalid";
		System.out.println(res);
	}
}