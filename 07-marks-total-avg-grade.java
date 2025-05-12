// 7)Enter 5 marks of a student. Calculate Total,Avg and grade according to the conditions 
// >=90 A
// >=70 B
// >=60 C
// >=50 D
// >=40 E
// <=40 F



import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double avg = total / 5.0;
        char grade;
        if (avg >= 90) grade = 'A';
        else if (avg >= 70) grade = 'B';
        else if (avg >= 60) grade = 'C';
        else if (avg >= 50) grade = 'D';
        else if (avg >= 40) grade = 'E';
        else grade = 'F';
        System.out.println("Total: " + total + ", Avg: " + avg + ", Grade: " + grade);
    }
}
