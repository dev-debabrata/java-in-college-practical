// 15) show the use of throw in exception handling



public class ThrowExample {
    static void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Not eligible");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
