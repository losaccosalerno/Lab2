import java.util.Scanner;
/**
 * This ProChall 13 class will calculate the total amount spent during a meal.
 * 1) Variable Declarations
 * 2) Scanner Object
 * 3) Input
 * 4) Output
 * 
 * @author Lorence Sacco Salerno
 * @version 1.2.1.26
 * Feb 22, 2026
 */
public class ProgChallenge13
{
    public static void main(String[] args)
    {
        // Variable Declarations
        double mealAmount, totalAmount, taxAmount, tipAmount;    
        final double TAX_RATE = 0.0675;  
        final double TIP_RATE = 0.20;   

        // Scanner Object
        Scanner keyboard = new Scanner(System.in);
        
        // Input
        System.out.print("Enter meal amount: $");
        mealAmount = keyboard.nextDouble();
        taxAmount = mealAmount * TAX_RATE;
        tipAmount = mealAmount * TIP_RATE;
        totalAmount = mealAmount + taxAmount + tipAmount;

        // Output
        System.out.printf("The tax is: $%,.2f\n", taxAmount);
        System.out.printf("The tip is: $%,.2f\n", tipAmount);
        System.out.printf("The meal cost with tax and tip is: $%,.2f\n", totalAmount);
    }
}