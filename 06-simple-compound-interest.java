// 6)Enter Principal, time and rate.Calculate Simple and compound interest


import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble(), t = sc.nextDouble(), r = sc.nextDouble();
        double si = (p * t * r) / 100;
        double ci = p * Math.pow(1 + r / 100, t) - p;
        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
