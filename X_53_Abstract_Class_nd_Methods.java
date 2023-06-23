// abstract class waise class hai jishke help se dushri new class banegi!!!!!!!!
// abstract classka objecct nhi hota hm nhi bna skte ishka object
abstract class Parent2 {
    public Parent2() {
        System.out.println("Mai Parent2  ka constructor hu!!!!");
    }

    public void sayHello() {
        System.out.println("Hello!!!");
    }

    abstract public void greet1(); // ya to hm yha abstract ka use kr le ya override kr le

    abstract public void greet2();

}

class child2 extends Parent2 {
    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good AfterNoon!!!!");
    }

    abstract class child3 extends Parent2 {
        public void thank() {
            System.out.println("Thanku for cooming in!!!");
        }

    }

    /*
     * ye override ka syntax hai ya to hme abstract class bna lena hoga yha hme ishe
     * override krne honge
     * to yha hm ishaka abstract class hi bna rhe kyo ki oo easy hai hai smjhne me
     * 
     * @Override
     * public void greet1() {
     * // TODO Auto-generated method stub
     * 
     * }
     * 
     * @Override
     * public void greet2() {
     * // TODO Auto-generated method stub
     * 
     * }
     */
}

public class X_53_Abstract_Class_nd_Methods {
    public static void main(String[] args) {
        child2 c = new child2();
        // child3 c3 = new child3(); not possible bec abstract clss donot have object

    }

}
