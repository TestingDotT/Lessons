// Lessons

// Import
import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Store/Input
        System.out.println("Please enter the course name.");
        String courseName = scan.nextLine();

        System.out.println("Please enter the average time spent in a week for this course in minutes.");
        int averageTimeMin = scan.nextInt();

        System.out.println("Please enter the homework grades for this course.");
        int gradeOne = scan.nextInt();
        int gradeTwo = scan.nextInt();
        int gradeThree = scan.nextInt();
        int gradeFour = scan.nextInt();

        System.out.println("Please enter the quiz grades for this course.");
        double quizOne = scan.nextDouble();
        double quizTwo = scan.nextDouble();

        System.out.println("Please enter the final exam grade for this course.");
        double finalExamGrade = scan.nextDouble();

        // Output
        System.out.printf("%s", courseName);
    }
}