package day8.Abstraction;

class Shape {
    protected float area;

    // Abstract method would be better, but for now we define dummy methods
    public void calArea() {
        area = 0;
        System.out.println("Calculating area in Shape class");
    }

    public void show() {
        System.out.println("Area: " + area);
    }
}
