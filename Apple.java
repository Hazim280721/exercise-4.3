

public class Apple  extends Fruit {//subclass from fruit class
	private String season;
	  public Apple(String name, String season) {
		  super(name);
		  this.season=season;
	  } 
		  
	public String season() {
		return this.season;
	}
	
	 //overriding 
	public String toString() {
		return "Fruiting in "+season;
	}
	

	 
}
