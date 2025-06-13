public class Poly{
public int add(int a,int b){return a+b;}
public int add(int a,int b,int c){return a+b+c;}
public double add(double a, double b){return a+b;}
public String add(String a,String b){return a+b;}
public static void main(String[] args){
Poly obj = new Poly();
System.out.println(obj.add(20,30));
System.out.println(obj.add(10,20,30));
System.out.println(obj.add(12.2,12));
System.out.println(obj.add("K.Manoj","kumar"));
}
}