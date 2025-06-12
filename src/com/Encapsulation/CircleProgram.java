//Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. 
//However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value

public class CircleProgram{
private double r;
double pi = 3.14;
public void setter(double radius){
this.r = radius;
}
public double getArea(){
return (pi * this.r*this.r);
}
public double getPerimeter(){
return (pi * this.r * 2);
}

public static void main(String[] args){
CircleProgram obj = new CircleProgram();
obj.setter(10);
System.out.println(obj.getArea());
System.out.println(obj.getPerimeter());
}
}