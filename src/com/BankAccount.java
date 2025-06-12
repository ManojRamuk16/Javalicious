//Write a program to create a class called bank account with private instance variable - Account number and balance provide public getter and setter method to access and modify the data.

public class BankAccount{

private int accno;
private double balance;

public void setter(int accno, double balance){
this.accno = accno;
this.balance = balance;
}
public void getter(){
System.out.println("The balance of this Account "+this.accno+" is "+ this.balance);
}
public void update(double amount,String trans){
if(trans.equals("deposit")){
this.balance +=amount;
getter();
}else if(trans.equals("withdraw")){

this.balance -= amount;
getter();
}else{
getter();
}
}

public static void main(String[] args){
BankAccount act = new BankAccount();
act.setter(12345678,900000);
act.getter();
act.update(100000,"withdraw");
act.update(100,"deposit");
}
}