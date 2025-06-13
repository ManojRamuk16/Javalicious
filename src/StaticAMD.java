
//Write a java program to implement static method called add,multiply and divide to use both static and non static variable like a,b,c.[divide method - non static]
import java.util.Scanner;
public class StaticAMD{
static int a,b;
int c;
public int add(){return a+b;}
public int multiply(){return a*b;}
public double divide(){return b/c;}


public static void main(String[] args){
	Scanner s = new Scanner(System.in);	
	StaticAMD sa = new StaticAMD();
	System.out.println("Enter the values of a,b and c");
	StaticAMD.a = s.nextInt();
	StaticAMD.b = s.nextInt();
	sa.c = s.nextInt();
	System.out.println(sa.add());
System.out.println(sa.multiply());
System.out.println(sa.divide());
}
}