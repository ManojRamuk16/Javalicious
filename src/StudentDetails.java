import java.util.Scanner;

public class  StudentDetails{
static int totalStudents =0;

int stud_id;
String name;
StudentDetails(int id,String nam){
stud_id = id;
name =nam;
totalStudents++;
}
public void display(){
System.out.println("Name: "+name+" \nId: " +stud_id + "\nPresent Count: " +totalStudents);
}

public static void main(String[] args){
StudentDetails	s1= new StudentDetails(1,"janani");
StudentDetails s2 = new StudentDetails(2,"harini");
StudentDetails s3 = new StudentDetails(3,"JeevaLatha");
s3.display();

}
}