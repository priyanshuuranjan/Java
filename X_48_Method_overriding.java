class A {
    public int alpha() {
        return 5;
    }

    public void meth2() {
        System.out.println("Im method 2 of class A");
    }
}

class B extends A {
    @Override
    public void meth2() {
        System.out.println("Im method 2 of class B");
    }
}

public class X_48_Method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();

    }

}
