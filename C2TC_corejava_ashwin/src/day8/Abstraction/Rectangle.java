package day8.Abstraction;

class Rectangle extends Shape {
    private float length;
    private float breadth;

    // Default constructor
    public Rectangle() {
        this.length = 1.0f;
        this.breadth = 1.0f;
    }

    // Parameterized constructor
    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calArea() {
        area = length * breadth;
    }

    @Override
    public void show() {
        System.out.println("Rectangle Area: " + area);
    }
}