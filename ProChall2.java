import java.util.Scanner;
/**
 * This ProChall 2 class will ask me to enter my first, middle, and last name in different rows. Then generate two rows with my fully name combined, and a row with my first intials listed.
 * Step 1: Importing
 * Step 2: Variable Declaration
 * Step 3: Initialize Scanner
 * Step 4: Input
 * Step 5: Extract Initials
 * Step 6: Output Full Name
 * Step 7: Output Initials
 * 
 * @author Lorence Sacco Salerno
 * @version 1.2.0.26
 * Feb 21, 2026
 */

public class ProChall2
{
    public static void main(String[] args)
    {
        // Step 2 – Variable Declarations
        String firstName, middleName, lastName;   // Strings for names
        char firstInit, middleInit, lastInit;     // Chars for initials
        Scanner keyboard;                         // Scanner reference variable

        // Step 3 – Initialize Scanner
        keyboard = new Scanner(System.in);

        // Step 4 – Input
        System.out.print("Enter your first name: ");
        firstName = keyboard.next();

        System.out.print("Enter your middle name: ");
        middleName = keyboard.next();

        System.out.print("Enter your last name: ");
        lastName = keyboard.next();

        // Step 5 – Extract Initials
        firstInit = firstName.charAt(0);
        middleInit = middleName.charAt(0);
        lastInit = lastName.charAt(0);

        // Step 7 – Output Full Name
        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);

        // Step 8 – Output Initials
        System.out.println("My initials are: " + firstInit + middleInit + lastInit);
    }
}
