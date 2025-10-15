package ie.rc;

public class HelloColors {
    // ANSI escape codes
    private static final String RESET = "\u001B[0m";
    private static final String RED   = "\u001B[31m";
    private static final String GREEN = "\u001B[32m";
    private static final String BLUE  = "\u001B[34m";

    public static void main(String[] args) {
        System.out.println(
            RED + "Hello" + RESET + " " +
            GREEN + "World" + RESET +
            BLUE + "!" + RESET
        );
        
        System.out.println(Ansi.red("HELLO"));
    }
}
