package Encapsulation;

public class StudentDemo {

    public static void main(String[] args) {
        Student ob = new Student();
        ob.setId(101);
        ob.setName("Ashwin");
        System.out.println("Student Details - ID: " + ob.getId() + ", Name: " + ob.getName());
    }
}
