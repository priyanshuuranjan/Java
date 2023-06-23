//1
abstract class Pen {
    abstract void write();

    abstract void refiles();

}

// 2
class FountinPen extends Pen {
    void write() {
        System.out.println("Write!!!");
    }

    void refiles() {
        System.out.println("Refiles!!!");
    }

    void changeNib() {
        System.out.println("Changing the nib...");
    }
}

class Monkey {
    void jump() {
        System.out.println("Jumping!!!");
    }

    void bite() {
        System.out.println("Biting!!!");
    }

}

interface BasicAnimal {
    void eat();

    void sleep();

}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Hello sir !!!");
    }

    @Override
    public void eat() {
        System.out.println("Eating !!!");

    }

    @Override
    public void sleep() {
        System.out.println("Sleeping!!!");

    }

}

abstract class TelePhonee {
    abstract void lift();

    abstract void disconnect();

}

class SmartTelephone extends TelePhonee {

    void lift() {
        System.out.println("lifting!!!");

    }

    void disconnect() {
        System.out.println("Disconecting!!!");

    }

}

public class X_60_PS11 {
    public static void main(String[] args) {
        FountinPen p = new FountinPen();
        p.changeNib();
        p.refiles();
        // 3
        Human alpha = new Human();
        alpha.sleep();
        // 5
        Monkey m1 = new Human();
        // m1.sleep(); --> Cannot use speak method because the reference is monkey which
        // does not have speak method
        m1.jump();
        m1.bite();
        BasicAnimal lovish = new Human();
        // lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();
        // 4
        TelePhonee RealMe = new SmartTelephone();
        RealMe.lift();
        // RealMe.sleep(); this is not possible because we call different method

    }
}
