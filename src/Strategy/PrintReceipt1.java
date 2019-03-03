package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore1;
    // generating and printing receipt for GasPump1
 
public class PrintReceipt1 extends PrintReceipt
{
    public PrintReceipt1(DataStore data)
    {
        super(data);
    }      
    @Override
    public void printReceipt()
    {
        System.out.println("\nFollowing is the Receipt");
        DataStore1 d = (DataStore1) data;
        System.out.println(d.G + " gallons of " + d.gasType + " gas @ $" + d.price + "/gallon");
        System.out.println("Total: $" + d.total);
    }
}
