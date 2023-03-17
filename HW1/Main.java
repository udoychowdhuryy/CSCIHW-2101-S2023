package HW1;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Pyramid class and call the Output method (see Pyramid.java for more info)
        System.out.println("\n");
        Pyramid.Output();



        // Create an instance of the Adlibs class and call the story method (see Adlibs.java for more info)
        System.out.println("\n");
        Adlibs a = new Adlibs();
        System.out.println(a.story("John", 20, "blue"));



        // Create an instance of the Replace class and call the charReplace method (see Replace.java for more info)
        System.out.println("\n");
        Replace r = new Replace();
        System.out.println(r.charReplace("I like tacos", 4, 'v')); 
    }
}