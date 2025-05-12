// 8) Write a program to create a student class with attributes marks, gender, Email, name with appropriate data type. Create another class with student demo which will have main method. Declare array of student object with size 10. Initialize 10 elements of this array with new object. Write logic which will display the name of the student with marks greater than the overall average



class Student {
    int marks;
    String gender;
    String email;
    String name;

    Student(String name, int marks, String gender, String email) {
        this.name = name;
        this.marks = marks;
        this.gender = gender;
        this.email = email;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Alice", 85, "F", "alice@mail.com");
        
        students[9] = new Student("John", 78, "M", "john@mail.com");

        int total = 0;
        
        for (Student s : students) total += s.marks;
        double avg = total / 10.0;

        for (Student s : students) {
            if (s.marks > avg)
                System.out.println("Above Avg: " + s.name);
        }
    }
}
