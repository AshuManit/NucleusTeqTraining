import java.util.Scanner;
public class VoteTest{
	public static void isValidAge(int age) throws InvalidAgeException{
		if(age<18){
			 throw new InvalidAgeException("Age must not be less than 18");
		}else{
			System.out.println("Congrats You are Eligible for Voting");
		}
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try{
		isValidAge(age);
		}catch(InvalidAgeException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}