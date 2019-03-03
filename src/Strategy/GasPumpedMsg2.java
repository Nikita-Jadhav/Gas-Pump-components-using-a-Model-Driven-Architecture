package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore2;
/*
GasPump2:GasPumpedMsg prints a message that gasoline has been pumped
 */
public class GasPumpedMsg2 extends GasPumpedMsg
{
    public GasPumpedMsg2(DataStore data)
    {
        super(data);
    }
    /*
        Print a a message that 1 liter of gasoline has been pumped
        along with total number of liters pumped.
     */
    @Override
    public void gasPumpedMsg() 
    {
        DataStore2 d = (DataStore2) data;
        System.out.println("Pumped 1 liter of " + d.gasType + " gasoline");
        System.out.println("Total # of liters pumped: " + d.L);
    }
}
