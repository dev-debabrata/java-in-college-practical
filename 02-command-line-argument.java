// 2) show the usage of command line argument args


public class CommandLineArgs {
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("Argument: " + arg);
        }
    }
}
