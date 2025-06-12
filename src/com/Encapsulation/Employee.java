//Write a program using Encapsulation that binds employee id,employee name,employee location, the variable can be accessed within the same class using get and set.

public class Employee{
private int emp_id;
private String emp_name,emp_location;

public void getDetails(){
System.out.println("Employee name: "+this.emp_name);
System.out.println("Employee id: "+ this.emp_id);
System.out.println("Employee location: "+ this.emp_location);
}

public void setDetails(int id,String name,String location){
this.emp_id = id;
this.emp_name = name;
this.emp_location= location;
}

public static void main(String[] args){
Employee obj = new Employee();
obj.setDetails(1,"Ommala","Thevidiya street");
obj.getDetails();
Employee obj1 = new Employee();
obj1.setDetails(2,"Gotha","OOmbipalayam");
obj1.getDetails();
}
}

