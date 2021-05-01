

public class main {

	public static void main(String[] args) {
		Fruit b=new Fruit("Fruit");
        System.out.println(b);
        System.out.println();
        
		Apple a=new Apple("Apple","September-November");
		
        System.out.println(a);
        System.out.println();
        
        redApple c=new redApple("Red Apple","October",2,7,"Red");
        c.variety();
        c.variety("Empire");
        c.variety("Fuji","Gala");
        c.nutrition();
        c.nutrition(16.6);
        c.nutrition(0.2,2.3);
        c.calories(16.6, 0.2);
        System.out.println(c);
        System.out.println();
        
        greenApple d=new greenApple("Green Apple","November",4,8,"Green");
        d.variety();
        d.variety("Granny Smith");
        d.variety("Ginger Gold","Lodi");
        d.nutrition();
        d.nutrition(14.8);
        d.nutrition(0.5,3.1);
        d.calories(14.8, 0.5);
        System.out.println(d);
        
	}

}


	
