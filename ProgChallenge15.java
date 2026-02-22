import java.util.Scanner;
/**
 * This ProChall 15 class will generate the number total amount paid for number of shares purchase, and gather commissiong total. 
 * Step 1: Importing
 * Step 2: Variable Declaration
 * Step 3: Constant Declarations
 * Step 4: Initialize Scanner
 * Step 5: Input
 * Step 6: Operations
 * Step 7: Output
 * 
 * @author Lorence Sacco Salerno
 * @version 1.2.0.26
 * Feb 21, 2026
 */
public class ProgChallenge15
{
    public static void main(String[] args)
    {
        // Step 2 – Variable Declarations
        double pricePerShare;     // Price of a single share
        int numberOfShares;       // Number of shares purchased
        double commissionAmount;  // Commission on the transaction
        double totalPaid;         // Total cost including commission
        Scanner keyboard;         // Scanner reference variable

        // Step 3 – Constant Declarations
        final double COMMISSION_RATE = 0.02;  // 2% commission

        // Step 4 – Initialize Scanner
        keyboard = new Scanner(System.in);

        // Step 5 – Input
        System.out.print("Enter the price per share: ");
        pricePerShare = keyboard.nextDouble();

        System.out.print("Enter the number of shares purchased: ");
        numberOfShares = keyboard.nextInt();

        // Step 6 – Operations
        commissionAmount = (pricePerShare * numberOfShares) * COMMISSION_RATE;
        totalPaid = (pricePerShare * numberOfShares) + commissionAmount;

        // Step 7 – Output
        System.out.println("Commission amount: $" + commissionAmount + " Total paid: $" + totalPaid);
    }
}
