class Shape{

public double getPerimeter(){return 0.0;}

public double getArea(){return 0.0;}

}

class Circle extends Shape{
double radius,pi =3.14;
Circle(double r){radius =r;}

@Override
public double getPerimeter(){return 2 * pi * radius;}

public double getArea(){return pi * radius * radius;}
}


class CircleAP{
public static void main(String[] args){
Circle obj = new Circle(7);
System.out.println("Perimeter: " + obj.getPerimeter());
System.out.println("Area: " + obj.getArea());
}
}
