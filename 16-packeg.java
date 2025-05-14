// 16) Write a program to create a package. 
//                                          I)Reference it in the same class and 
//                                          II)import it and access the methods




package mypack;

public class Utility {
    public static void greet() {
        System.out.println("Hello from package");
    }
}


// Reference in same class
package mypack;

public class TestSame {
    public static void main(String[] args) {
        Utility.greet();
    }
}


// Import in another file
import mypack.Utility;

public class TestImport {
    public static void main(String[] args) {
        Utility.greet();
    }
}
