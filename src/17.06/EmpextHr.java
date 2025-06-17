class Employee{
	public void work(){
	System.out.println("Here the work is assigned for Employees");
}
	public double getSalary(){return 30000.00;}
}

class HRManager extends Employee{

	public void work(){
	System.out.println("Here the work is assigned for Hr's");}
	
	public void addEmployee(){System.out.println("here the hr can add employees");}
}

public class EmpextHr{
public static void main(String[] args){

Employee emp = new Employee();
emp.work();
double salary = emp.getSalary();
System.out.println("The base salary for the employees are:" + salary);

HRManager hr = new HRManager();
hr.work();
hr.addEmployee();

}}
