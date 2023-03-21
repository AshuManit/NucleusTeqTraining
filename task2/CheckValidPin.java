import java.util.Scanner;
import java.util.regex.*;
/*
It can be only six digits.
It should not start with zero.
First digit of the pin code must be from 1 to 9.
Next five digits of the pin code may range from 0 to 9.
It should allow only one white space, but after three digits, although this is optional.*/
class CheckValidPin{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String regex= "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
			/*
			^ represents the starting of the number.
			[1-9]{1} represents the starting digit in the pin code ranging from 1 to 9.
			[0-9]{2} represents the next two digits in the pin code ranging from 0 to 9.
			\\s{0, 1} represents the white space in the pin code that can occur once or never.
			[0-9]{3} represents the last three digits in the pin code ranging from 0 to 9.
			$ represents the ending of the number.
			*/
	    Pattern p = Pattern.compile(regex);
		String pin=sc.nextLine();
		if(pin==null){
			System.out.println("Invalid");
		}
		Matcher match=p.matcher(pin); //Matcher contains method matcher 
		if(match.matches()) //matches() return boolean 
			System.out.println("Valid Pin");
		else 
			System.out.println("Invalid pin");

	}
}
