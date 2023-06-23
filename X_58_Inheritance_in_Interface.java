interface sampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends sampleInterface {
    void meth3();

    void meth4();
}

class MySample implements childSampleInterface {
    public void meth1() {
        System.out.println("Im meth1!!!");
    }

    public void meth2() {
        System.out.println("Im meth2!!!");
    }

    public void meth3() {
        System.out.println("Im meth3!!!");
    }

    public void meth4() {
        System.out.println("Im meth4!!!");
    }

}

public class X_58_Inheritance_in_Interface {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
       // obj.meth1();
       // obj.meth2();
        obj.meth3();


    }

}
