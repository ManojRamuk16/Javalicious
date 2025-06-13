//Write a java program to implement constructor overloading with one parameter next with two parameter then three parameter.

public class ConstOverloading{
int a,b,c;
String s;
ConstOverloading(int num1){a = num1;}
ConstOverloading(int num1, int num2){ a= num1; b=num2;}
ConstOverloading(int num1, int num2, int num3){ a = num1; b=num2;c=num3;}

public void display(){
System.out.println(a+" <== A \n"+b+" <== B \n"+c+" <== C");
System.out.println(s);}

public static void main(String[] args){
	ConstOverloading a = new ConstOverloading(10);
	a.display();
	ConstOverloading b = new ConstOverloading(10,20);
	b.display();
	ConstOverloading c = new ConstOverloading(10,20,30);
	c.display();
}
}