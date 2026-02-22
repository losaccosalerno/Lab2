import java.util.Scanner;
/**
 * This ProChall 13 class will calculate the total amount spent during a meal, by adding the tip, and tax cost to figure out the total.
 * Step 1: Import
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
public class ProgChallenge13
{
    public static void main(String[] args)
    {
        // Step 2 – Variable Declarations
        double mealAmount;    // Stores the meal amount entered
        double taxAmount;     // Stores the calculated tax
        double tipAmount;     // Stores the calculated tip
        double totalAmount;   // Stores total cost including tax and tip
        Scanner keyboard;     // Scanner reference variable

        // Step 3 – Constant Declarations
        final double TAX_RATE = 0.0675;   // 6.75% tax
        final double TIP_RATE = 0.20;     // 20% tip

        // Step 4 – Initialize Scanner
        keyboard = new Scanner(System.in);

        // Step 5 – Input
        System.out.print("Enter meal amount: $");
        mealAmount = keyboard.nextDouble();

        // Step 6 – Operations
        taxAmount = mealAmount * TAX_RATE;
        tipAmount = mealAmount * TIP_RATE;
        totalAmount = mealAmount + taxAmount + tipAmount;

        // Step 7 – Output
        System.out.printf("The tax is: $%,.2f\n", taxAmount);
        System.out.printf("The tip is: $%,.2f\n", tipAmount);
        System.out.printf("The meal cost with tax and tip is: $%,.2f\n", totalAmount);
    }
}