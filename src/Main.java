// Lessons

// Import
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Store/Input
        System.out.println("Enter a name:");
        String name = scan.nextLine();

        // Check
        if (name.equals("Hello")) {
            // Output
            System.out.printf("%s is not a name", name);
            System.out.println("\t\t\t\t\t\nNot funny.");
        }
    }
}