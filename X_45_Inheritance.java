class Base {
    int x;

    public int get() { // syntax for getter for X only
        return x;
    }

    public void set(int x) {
        System.out.println("I am in base and  setting x now"); // syntax for setter for X only
        this.x = x;
    }

    public void printMe() {
        System.out.println("Im am a constructor");
    }
}

// quizz
class Animal {
    int c;

    public int get() {
        return c;
    }

    public void set(int c) {
        this.c = c;
    }

}

class Dog extends Animal {
    int d;

    public int get() {
        return d;
    }

    public void set(int d) {
        this.d = d;
    }

}

class Derived extends Base { // isko likhte hi mera jitna data class base me hoga yha pe aa jayega
    int y;

    public int get() { // syntax for getter for Y only
        return y;
    }

    public void set(int y) { // syntax for setter for Y only
        this.y = y;
    }

}

public class X_45_Inheritance {

    public static void main(String[] args) {

        // creating an object of base class

        Base b = new Base();
        b.set(4);
        System.out.println(b.get());

        // creating an object of derived class
        Derived d = new Derived();
        d.set(45);
        System.out.println(d.get());
        // creating an object of Animal class // quizz
        Animal c = new Animal();
        c.set(10);
        System.out.println(c.get());
        // creating an object of Dog class // quizz
        Dog dd = new Dog();
        dd.set(100);
        System.out.println(dd.get());

    }

}
