
/**
 * This is my Imprecision class.
 *
 * @author Lorence Sacco Salerno
 * @version 1.2.0.26
 * Feb 13, 2026
 */
public class Imprecision
{
    public static void main(String[] args)
    { 
    double x;
    double y;
    double z;
    
    x = 123456789E204;
    y = 1 / x;
    z = x * y; 
    
    System.out.println("The value of x is:" +x);
    System.out.println("The value of y is:" +y);
    System.out.println("The value of z (x*y)is:" +z);
    System.out.println("The value of 1-z is:" +(1-z));
    
    }
}