package day8.Interfaces.MarketInterface;

public class MarketInterfaceDemo {
	public static void main(String[] args) {
		Student s=new Student(101,"Neha",12000,"C++");
		if (s instanceof Registerable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
			

	}

}
