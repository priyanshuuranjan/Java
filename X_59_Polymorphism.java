/*
polymorphism ka use hm ish liye krte hai kyo ki hm nhi chahte ushke alawa hm kishi ko kuch
use krne de faltu  ka koi hmshe kuch mangata hai mujhe ye chahiye to polymorphism k use se fix
kr denge jishshe oo uhi chizz use kr payega na ki dushra dushra kuch thats why we use this 
*/
interface MyCamera2 {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWifi2 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting... ");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Taking snap");
    }

    // public void record4KVideo(){
    // System.out.println("Taking snap and recoding in 4k");
    // }
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = { "Harry", "Prashanth", "Anjali5G" };
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    public void sampleMeth() {
        System.out.println("meth");
    }
}

public class X_59_Polymorphism {

    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
        // cam1.getNetworks(); not allowed to use bcz hm log camera mange hai use krne k
        // liye
        // cam1.getNetworks(); --> Not allowed
        // cam1.sampleMeth(); --> Not allowed

        cam1.record4KVideo();

        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(7979);
    }
}