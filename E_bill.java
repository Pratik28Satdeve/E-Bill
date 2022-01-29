import java.io.*;
import java.util.*;

public class E_bill
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String name;
        int no,unit;
        double amt=0;
        
        System.out.println("Enter your name");
        name=in.nextLine();
        System.out.println("Enter consumer number");
        no=in.nextInt();
        System.out.println("Enter number of units consumed");
        unit=in.nextInt();
        
        if(unit<=100)
        {
            amt= unit*5.50;
        }
        else if((unit>100)&&(unit<=300))
        {
            amt = 100*5.50 + (unit-100)*6.50;
        }
        else if((unit>300)&&(unit<=600))
        {
            amt= 100*5.50 + 200*6.50 + (unit-300)*7.50;
        }
        else if(unit>600)
        {
            amt = 100*5.50 + 200*6.50 + 300 *7.50 + (unit-600)*8.50;
        }
        System.out.println("******MONEY RECEIPT*******");
        System.out.println("Consumer no.      = "+no);
        System.out.println("Consumer name     = "+name);
        System.out.println("Units comsumed    = "+unit);
        System.out.println("Amount to be paid = "+amt);
        
        
    }
}