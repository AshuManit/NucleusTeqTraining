public class SavingAccount extends Account{
	public boolean withdraw(double amount){
		boolean res;
		if(amount>=balance){
			balance=balance-amount;
			res=true;
		}else{
			res=false;
		}
	}
	public void deposit(double amount){
		balance=balance+amount;
	}
	public void fixedDeposit(){
		
	}
	
}