package day6.StaticVariable;

public class EmployeeExecute {
	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		Employee e = new Employee("Ashwin", 123);
		System.out.println(e);
		
		e = new Employee("Chandru", 321);
		System.out.println(e);
	}

}
