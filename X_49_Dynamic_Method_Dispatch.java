class Phone {
    public void ShowTime() {
        System.out.println("The Time Is 7 am");
    }

    public void on() {
        System.out.println("Turing On The Phone....");
    }
}

class SmartPhone extends Phone {
    public void Music() {
        System.out.println("Playing Music...");
    }

    public void on() {
        System.out.println("Kindely Wait your Phone Were Starting ....");
    }
}

public class X_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        // Phone obj = new Phone(); // Allowed
        // SmartPhone smobj = new SmartPhone(); // Allowed
        // obj.name();

        Phone obj = new SmartPhone(); // Yes it is allowed
        // SmartPhone obj2 = new Phone(); // Not allowed

        obj.ShowTime();
        obj.on();
        // obj.music(); Not Allowed


    }

}
