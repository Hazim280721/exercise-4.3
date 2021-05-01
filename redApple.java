

public class redApple extends Apple {//subclass from Apple class
	private double weight;
	private double price;
	private String color;         
	private String variety;
	private double nutrition;
    public redApple(String name,String season,double weight,double price,String color) {
	super(name,season);
	this.weight=weight;
	this.price=price;
	this.color=color;
}
    //overloading
    public String variety(){
 	   System.out.println("Variety: Rome");
 	return variety;
 	  
    }
    public String variety(String a){
 	   System.out.println("Variety: "+ a);
 	return a;
    }
    public String variety(String c,String d){
 	   System.out.println("Variety: "+ c+"\nVariety: "+d);
 		
 	   return c  ;
    }
    
    public double nutrition(){
    	System.out.println("\nNutrition Info:");
  	   System.out.println("Total Fat: "+0.2+" g");
  	return nutrition;
  	  
     }
     public double nutrition(double a){
  	   System.out.println("Total Carbs: "+ a+" g");
  	return a;
     }
     public double nutrition(double c,double d){
  	   System.out.println("Total Protein: "+ c+" g"+"\nTotal Fiber: "+d+" g");
  		
  	   return c  ;
     }
 public double calories(double a,double c) {
    	 double calories;
		  calories=(0.2*9)+(a*4)+(c*4);
		  System.out.println("Total Calories: "+ calories);
		  return calories;
     }
 
   public double weight() {
	   return this.weight;
   }
   public double price() {
	   return this.price;
   }
   public String color() {
	   return this.color;
   }
   public double totalPrice() {
	   return this.weight*this.price;
   }
   //overriding
   public String toString() {
	   return "\nFruiting in "+season()+"\nColor : "+color()+"\nWeight: "+weight+" KG"+
			   "\nPrice Per Kg: "+price+"\nTotal price : RM "+totalPrice();
   }
   
   
   
}


