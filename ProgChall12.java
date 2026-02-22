import java.util.Scanner;
/**
 * This ProChall 12 class will print out my selected city and count of characters, then print uppercase, print lower case, and conduct character recognition. 
 * Step 1: Importing
 * Step 2: Variable Declaration
 * Step 3: Initialize Scanner
 * Step 4: Input
 * Step 5: String Operations
 * Step 6: Output
 * 
 * @author Lorence Sacco Salerno
 * @version 1.2.0.26
 * Feb 21, 2026
 */
public class ProgChall12
{
    public static void main(String[] args)
    {
        // Step 2 – Variable Declarations
        String city;           
        int length;            
        char firstChar;        
        Scanner keyboard;      

        // Step 3 – Initialize Scanner
        keyboard = new Scanner(System.in);

        // Step 4 – Input
        System.out.print("Enter a city: ");
        city = keyboard.nextLine();  // Reads the full city name

        // Step 5 – String Operations
        length = city.length();          // Number of characters
        firstChar = city.charAt(0);      // First character

        // Step 6 – Output
        System.out.println("The city entered has: " + length + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + firstChar);
    }
}
