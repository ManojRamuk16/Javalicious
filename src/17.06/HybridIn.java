class GrandMother{
public void showGM(){
System.out.println("You're in the grandmother class");
System.out.println("She is a grandmother of mine");}
}

class Mother extends GrandMother{

public void showM(){
System.out.println("You're in Mother class");
System.out.println("She is my mother");
}
}

class Son extends Mother{

public void showS(){
System.out.println("You're in son class");
System.out.println("I'm the son");}
}

class Daughter extends Mother{


public void ShowD(){System.out.println("You're in Daughter class");
System.out.println("I'm the Daughter");
}
}

public class HybridIn{
public static void main(String[] args){
Daughter objD = new Daughter();
objD.showGM();
objD.showM();
objD.ShowD();
}}