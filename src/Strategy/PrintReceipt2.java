package Strategy;

import DataRepository.DataStore;
import DataRepository.DataStore2;


// generating and printing receipt for GasPump2
 
public class PrintReceipt2 extends PrintReceipt 
{
    public PrintReceipt2(DataStore data)
    {
        super(data);
    }    
    @Override
    public void printReceipt()
    {
        System.out.println("\nFollowing is the Receipt");
        DataStore2 d = (DataStore2) data;
        System.out.println(d.L + " liters of " + d.gasType + " gas @ $" + d.price + "/liter");
        System.out.println("Cash inserted: $" + d.cash);
        System.out.println("Total: $" + (float) d.total);
    }
}
