class Recipe{

public void getIncredients(){
System.out.println("Here you can get the incredients of what you're cooking");
}
public void getInstructions(){
System.out.println("The instructions of the making the recipe's would be in this function");}

}

class PastaRecipe extends Recipe{
public void getIncredients(){
System.out.println("For preparing pasta, you need a pasta first. Take it");}

public void getInstructions(){System.out.println("Boil the pasta and add masala and serve it");}
}

class CakeRecipe extends Recipe{

public void getIncredients(){System.out.println("Incredients of cake");}

public void getInstructions(){System.out.println("Instructions of making cake");}

}


class SaladRecipe extends Recipe{

public void getIncredients(){System.out.println("Incredients of Salad");}

public void getInstructions(){System.out.println("Instructions of making salad");}}


class HybridRecipe{

public static void main(String[] args){
PastaRecipe pr = new PastaRecipe();
CakeRecipe cr = new CakeRecipe();
SaladRecipe sr = new SaladRecipe();
pr.getIncredients();
pr.getInstructions();

cr.getIncredients();
cr.getInstructions();

sr.getIncredients();
sr.getInstructions();
}}