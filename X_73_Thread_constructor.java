class MyThr extends Thread {
    public MyThr(String name) {
        super(name);// calling a thread class constructor jo ki ek name leta hai
    }

    public void run() {
        int i=45;
        while (true) {
            System.out.println("im a Thraed!!!");
            i++; 
        }
    }
}

public class X_73_Thread_constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr( "Alpha");
        t.start();
        System.out.println("the id of the thread is " + t.getId());
    

    }

}
