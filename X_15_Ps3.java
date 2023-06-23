public class X_15_Ps3 {
    public static void main(String[] args) {
        String name = new String("HeLlO");
        String u = name.toLowerCase();
        System.out.println(u);

        // question 2
        String text = "to Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        // question 3
        String letter = "Dear <|name|>, Thanks A lot";
        letter = letter.replace("<|name|>", "Alpha");
        System.out.println(letter);

         // question 4
         String mystring = " this string only contains     double amd triple spaces";
         System.out.println(mystring.indexOf(" "));
         System.out.println(mystring.indexOf("  "));
         // quesstion 5
         
         String Letter = "Dear Alpha,\n\t This java course is nice\n. thanks" ;
         System.out.println(Letter);



    }

}