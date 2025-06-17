class BankAccount{

protected int Accno;
protected double balance;
public BankAccount(int Accno,double balance){
this.Accno = Accno;
this.balance = balance;
}
public void deposit(double amount){
	balance += amount;
	System.out.println("The deposit of " + amount + " is successful");
	getBalance();
}
public void withdraw(double amount){
	if (amount<balance){
	balance -= amount;
	System.out.println("The withdrawal of " + amount + " is successful");
	getBalance();
}else{
System.out.println("The withdrawal is unsuccessful due to insufficient balance");
}
}

public void getBalance(){
	System.out.println("The Balance of the Account Number " + Accno + " is "+ balance);
}
}

class SavingsAccount extends BankAccount{

public SavingsAccount(int Accno, double balance){
super(Accno,balance);
}

@Override
public void withdraw(double amount){
if(super.balance - amount <100){System.out.println("This is a Savings Account. The minimum balance should be more than 100. withdrawal failed.");
super.getBalance();
}else{
if(super.balance>amount){
super.balance -=amount;
super.getBalance();
}else{System.out.println("The withdrawal is unsuccessful due to insufficient balance");
super.getBalance();
}
}
}
}


public class SavingsBankAcc{

public static void main(String[] args){
BankAccount a1 = new BankAccount(1234,101.00);
a1.getBalance();
a1.withdraw(100);

SavingsAccount sa1 = new SavingsAccount(112,200);
sa1.withdraw(150);

}}