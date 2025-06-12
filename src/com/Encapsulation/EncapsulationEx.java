//package constructor;

public class EncapsulationEx{
private String name;

public String getName(){
	return name;
}

public void setName(String name){
	this.name = name;
}

public static void main(String[] args){
	EncapsulationEx obj = new EncapsulationEx();
	obj.setName("jonam");
	System.out.println(obj.getName());
}
}


