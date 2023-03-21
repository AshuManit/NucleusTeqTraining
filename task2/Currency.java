import java.util.Scanner;
public class Currency{
	public static double toDollar(double rs){
		double dol=rs/82.63;
		return dol;
	}
	public static double torupees(double dol){
		double rs=dol*82.63;
		return rs;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 to convert Ruppes to Dollar");
		System.out.println("press 1 to convert Dollar to Ruppes");
		String input=sc.nextLine();
		switch(input){
			case 1:
					System.out.println("Enter Amount in rupees");
					double rs=sc.nextDouble();
					double dol=toDollar(rs);
					System.out.println(dol+"$");
					break;
			case 2: 
			
					System.out.println("Enter Amount in Dollar");
					double dol=sc.nextDouble();
					double rs=torupees(dol);
					System.out.println(rs+"rs");
					break;
					default :
					System.out.println("Wrong pressed");
		}
	}
}
