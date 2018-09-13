package assignment3;
abstract class Account {
	long accNumber;
	String accHolderName;
	String address;
	double balance;
    public Account(long number,String name,String adrs,double bal){
    	this.accNumber=number;
    	this.accHolderName=name;
    	this.address=adrs;
    	this.balance=bal;
    }
    public abstract void withdraw(double wd);
    public abstract void deposit(double dp);
    public void display(){
    	System.out.println("Available balance in the a/c number "+accNumber+" : Rs  "+balance);
    }   
}
class CurrentAccount extends Account {
    double overdraftLimit;
    CurrentAccount(long number,String name,String adrs,double bal,double overdraftLimit){
		super(number,name,adrs,bal);
		this.overdraftLimit=overdraftLimit;
    }
    public void withdraw(double wd){
  	    if(wd>this.balance){
  	    	System.out.println("You have not enough balance to withdraw this ammount "+wd);
  	    	return;
  	    }
			this.balance=balance-wd;
			System.out.println("Mr. "+this.accHolderName+" Rs "+wd+" is withdrawn from your A/C number "+this.accNumber);
			System.out.println("Available balance Rs "+this.balance);
		}
	 public void deposit(double dp){
			this.balance=balance+dp;
			System.out.println("Mr. "+this.accHolderName+" Rs "+dp+" is deposited in your A/C number "+this.accNumber);
			System.out.println("Available balance Rs "+this.balance);
	  }
	 public void display(){
		 System.out.println("Account details :");
		 System.out.println("Account Type : Current");
		 System.out.println("A/C number : "+this.accNumber+" Holder Name : "+this.accHolderName+" Address : "+this.address);
		 System.out.println("Available balance : Rs "+this.balance);
		 System.out.println("Overdraft Limit : "+this.overdraftLimit);
		 System.out.println();
	 }
		
}
class SavingAccount extends Account{
	double rateOfInterest;
	SavingAccount(long number,String name,String adrs,double bal,double rate){
		super(number,name,adrs,bal);
		this.rateOfInterest=rate;
	}
	public void withdraw(double wd){
		if(wd>this.balance){
	    	System.out.println("You have not enough balance to withdraw this ammount "+wd);
	    	return;
	    }
		this.balance=balance-wd;
		System.out.println("Mr. "+this.accHolderName+" Rs "+wd+" is withdrawn from your A/C number "+this.accNumber);
		System.out.println("Available balance Rs "+this.balance);
	}
	public void deposit(double dp){
		this.balance=balance+dp;
		System.out.println("Mr. "+this.accHolderName+" Rs "+dp+" is deposited in your A/C number "+this.accNumber);
		System.out.println("Available balance Rs "+this.balance);
	}
	public void calculateAmmount(){
		this.balance+=(this.balance*this.rateOfInterest)/100.00;
	}
	public void display(){
		 this.calculateAmmount();
		 System.out.println("Account details :");
		 System.out.println("A/C Type : Saving");
		 System.out.println("A/C number : "+this.accNumber+" Holder Name : "+this.accHolderName+" Address : "+this.address);
		 System.out.println("Available balance : Rs "+this.balance);
		 System.out.println();
	 }
}

public class Banking {

	public static void main(String[] args) {
		SavingAccount obj1 = new SavingAccount(1234567890,"Suman Sana","Singur",10000,6.75);
    	CurrentAccount obj2= new CurrentAccount(1234567890,"Suman Sana","Singur",100000,50000);
    	obj1.display();
    	obj2.display();
    	obj1.withdraw(100000);

	}

}
