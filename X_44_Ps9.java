class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) { // for constructor
        this.radius = radius;
        this.height = height;
    }

    /**
     * @return int return the radius
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return int return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * 3.142 * radius * radius + 2 * 3.14 * radius + 2 * 3.14 * radius * height;
    }

    public double Volume() {
        return 3.142 * radius * radius * height;
    }
}

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;

    }

}

public class X_44_Ps9 {
    public static void main(String[] args) {
        // question 1st
        Cylinder myCylinder = new Cylinder(9, 12); // question no 3
        myCylinder.setHeight(12);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // question 2nd
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.Volume());

        // question 3 third
        Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }

}
