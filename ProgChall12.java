import java.util.Scanner;
/**
 * This ProChall 12 class will print out my selected city and specific characters. 
 * 1) Variable Declarations
 * 2) Initialize Scanner
 * 3) String Operations
 * 4) Output
 * 
 * @author Lorence Sacco Salerno
 * @version 1.2.1.26
 * Feb 22, 2026
 */
public class ProgChall12
{
    public static void main(String[] args)
    {
        // Variable Declarations
        String city;  int length;  char firstChar;            

        // Initialize Scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a city: ");
        city = keyboard.nextLine(); 

        // String Operations
        length = city.length();         
        firstChar = city.charAt(0);     

        // Output
        System.out.println("The city entered has: " + length + " chars");
        System.out.println("In upper case: " + city.toUpperCase());
        System.out.println("In lower case: " + city.toLowerCase());
        System.out.println("First character: " + firstChar);
    }
}
