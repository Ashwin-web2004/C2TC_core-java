package day8.InterfaceExample;

public class InterfaceExecutor {
	public static void main(String args[]) {
		Coder code = new Student();
		System.out.println("Am printing the Student class by implementing the Coder interface");
		code.rules();
		System.out.println("\nAm printing the Trainer class by implementing the Coder interface");
		code = new Trainer();
		code.rules();
	}

}
