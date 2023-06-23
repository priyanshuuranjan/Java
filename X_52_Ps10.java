class Circle {
    public int radius;

    Circle() {
        System.out.println("I am non param of circle");
    }

    Circle(int r) {
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder extends Circle {
    public int height;

    Cylinder(int r, int h) {
        super(r);
        System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class X_52_Ps10 {
    public static void main(String[] args) {
        // Problem 1
        // Circle objC = new Circle(12);
        Cylinder obj = new Cylinder(12, 4);
    }
}