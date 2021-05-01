
public class Fruit { //parent class
	
		private String name;//declare
		
	public Fruit(String name) {
		this.name=name;
		
		System.out.println(this.name);
	}  
		public String name() {
			return name;
		}
		//overriding
		public String toString() { 
			return "it's "+name+" season";
		}
		
		  }
		


