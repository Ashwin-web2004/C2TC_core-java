package day8.Abstraction;

class Square extends Shape {
    private float side;

    // Default constructor
    public Square() {
        this.side = 1.0f; // default value
    }

    // Parameterized constructor
    public Square(float side) {
        this.side = side;
    }

    @Override
    public void calArea() {
        area = side * side;
    }

    @Override
    public void show() {
        System.out.println("Square Area: " + area);
    }
}
