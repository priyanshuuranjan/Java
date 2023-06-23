/*
                Cheats Seats
                
Access Modifier	within class	within package	outside package by subclass only	outside package
public	Y	Y	Y	Y
protect	Y	Y	Y	N
Default	Y	Y	N	N
private	Y	N	N	N

*/
// same class k andar arg koi v modifires like public, default, protected, private
// modifire laga  ho to hm hmlog ishe same package me use kr skte hai  bina koi dikat k
class C1 {
    public int x = 5;
    protected int y = 45;
    int z = 71;
    private int a = 10;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(z);
    }

}

class c2 {

}

class c3 {

}

public class X_66_Access_Modifiers {
    public static void main(String[] args) {
        C1 c = new C1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);

        System.out.println(c.z);

        // System.out.println(c.a); same package me hm private modifire ka use nhi kr
        // skte
    }

}
