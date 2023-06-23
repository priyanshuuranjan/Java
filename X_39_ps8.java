class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class CellPhone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating...");
    }

    public void callFriend() {
        System.out.println("Calling Mukul...");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class Rectangle {
    int length, breadth;

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}

class Tommy {
    public void hit() {
        System.out.println("Hitting the Ennemy");
    }

    public void run() {
        System.out.println("Runing the Ennemy");
    }

    public void fire() {
        System.out.println("firing the Ennemy");
    }

}

public class X_39_ps8 {
    public static void main(String[] args) {

        // Question 1

        Employee Alpha = new Employee(); // works as scanner object
        Alpha.setName("Brock lesner is best wrestler");
        Alpha.salary = 500;

        System.out.println(Alpha.getName());
        System.out.println(Alpha.getSalary());

        // Problem 2

        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();

        // Problem 3

        Square sq = new Square();
        sq.side = 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Question 4
        Rectangle rec = new Rectangle();
        rec.length = 11;
        rec.breadth = 14;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        // Question 5
        Tommy tm = new Tommy();
        tm.fire();
        tm.run();
        tm.hit();

    }

}
