// Lessons

// Import
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Store/Input
        System.out.println("Please enter four names:");
        String nameOne = scan.nextLine();
        String nameTwo = scan.nextLine();
        String nameThree = scan.nextLine();
        String nameFour = scan.nextLine();

        // Output
        System.out.printf("%s %s %s %s" + nameFour, nameTwo, nameThree, nameOne);

        scan.close();
    }
}