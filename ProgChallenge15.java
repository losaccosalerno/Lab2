import java.util.Scanner;
/**
 * This ProChall 15 class will generate total amount paid for number of shares purchased.
 * 1) Variable Declarations
 * 2) Input
 * 3) Computations
 * 4) Output
 * 
 * @author Lorence Sacco Salerno
 * @version 1.2.1.26
 * @since Feb 22, 2026
 */
public class ProgChallenge15
{
    public static void main(String[] args)
    {
        //Variable Declarations
        double pricePerShare, shareAmount, commissionAmount, totalPaid;    
        int numberOfShares;                        
        final double COMMISSION_RATE = 0.02;

        // Input
        Scanner keyboard = new Scanner(System.in);        
        System.out.print("Enter the price per share: ");
        pricePerShare = keyboard.nextDouble();

        System.out.print("Enter the number of shares purchased: ");
        numberOfShares = keyboard.nextInt();

        // Computations
        shareAmount = (pricePerShare * numberOfShares);
        commissionAmount = (pricePerShare * numberOfShares) * COMMISSION_RATE;
        totalPaid = (pricePerShare * numberOfShares) + commissionAmount;
    
        // Output
        System.out.printf("Total cost of shares are: $%,.2f\nCommission cost is: $%,.2f\nTotal Cost is: $%,.2f", shareAmount, commissionAmount, totalPaid);
    }
}
