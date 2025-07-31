package day8.Abstraction;

public class AbstractDemo {
	
	    public static void main(String[] args) {
	        // Using default constructors
	        Square sq = new Square();
	        Rectangle r1 = new Rectangle();
	        
	        sq.calArea();
	        sq.show();
	        
	        r1.calArea();
	        r1.show();

	        System.out.println("------------------------------------------------");

	        // Runtime Polymorphism
	        Shape shape;

	        shape = new Square(12.5f);
	        shape.calArea(); // Calls Square's calArea()
	        shape.show();    // Calls Square's show()

	        shape = new Rectangle(10, 20);
	        shape.calArea(); // Calls Rectangle's calArea()
	        shape.show();    // Calls Rectangle's show()
	    }
		
		
		
		
		

	}


