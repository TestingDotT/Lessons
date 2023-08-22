// Lessons

// Import
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Store/Input
        System.out.println("Hi there. What is your name?");
        String name = scan.nextLine();
        System.out.println("What state do you live in?");
        String state = scan.nextLine();

        // Output
        System.out.printf("My name is %s. I live in %s.", name, state);

        /*
        // Store/Input
        System.out.println("Please enter four names:");
        String nameOne = scan.nextLine();
        String nameTwo = scan.nextLine();
        String nameThree = scan.nextLine();
        String nameFour = scan.nextLine();

        // Output
        System.out.printf("%s %s %s %s" + nameFour, nameTwo, nameThree, nameOne);

        scan.close();
         */
    }
}