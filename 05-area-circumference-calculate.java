// 5)Enter radias and calculate area and circumference



import java.util.Scanner;

public class CircleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("Area: " + Math.PI * r * r);
        System.out.println("Circumference: " + 2 * Math.PI * r);
    }
}
