/*
SI = (P x R x T)/100
where SI = Simple Interest
P = Principal Amount
R = Rate of interest
T = Time duration in year

Compound Interest=P×(1+r/100)^t−P
*/
import java.util.Scanner;
import java.util.*;
class SIandCI{
	public static int simpleInterest(int p,float r,int t){
		return (int)((p*r*t)/100);
	}
	public static int compoundInterest(int p,float r,int t){
		return (int)p*(int)Math.pow((1+r/100),t)-p;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Principal??");
		int principal=sc.nextInt();;
		System.out.println("Rate??");
		float rate=sc.nextFloat();;
		System.out.println("Time??");
		int time=sc.nextInt();
		int si=simpleInterest(principal,rate,time);
		int ci=compoundInterest(principal,rate,time);
		System.out.println("Simple Interest :"+si);
		System.out.println("Compound Interest :"+ci);
	}
}