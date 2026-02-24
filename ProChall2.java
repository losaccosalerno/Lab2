import java.util.Scanner;
/**
 * This ProChall2 will print my name and initials.
 * 1) Variable Declarations
 * 2) Input
 * 3) Extract Initials
 * 4) Output
 * 
 * @author Lorence Sacco Salerno
 * @version 1.2.1.26
 * Feb 22, 2026
 */

public class ProChall2
{
    public static void main(String[] args)
    {
        // Variable Declarations
        String firstName, middleName, lastName; 
        char firstInit, middleInit, lastInit;       

        // Input
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = keyboard.next();

        System.out.print("Enter your middle name: ");
        middleName = keyboard.next();

        System.out.print("Enter your last name: ");
        lastName = keyboard.next();

        // Extract Initials
        firstInit = firstName.charAt(0);
        middleInit = middleName.charAt(0);
        lastInit = lastName.charAt(0);

        // Output
        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: " + firstInit + middleInit + lastInit);
    }
}
