// 4) take two no. As input and perform bitwise AND and OR


import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
    }
}
