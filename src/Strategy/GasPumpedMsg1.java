package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore1;
/*
GasPump1:GasPumpedMsg prints a message that gasoline has been pumped
 */
public class GasPumpedMsg1 extends GasPumpedMsg 
{
    public GasPumpedMsg1(DataStore data) 
    {
        super(data);
    }
    /*
        Print a message that 1 gallon of gasoline has been pumpped
        along with the total
     */
    @Override
    public void gasPumpedMsg() 
    {
        DataStore1 d = (DataStore1) data;
        System.out.println("Pumped 1 gallon of " + d.gasType + " gasoline");
        System.out.println("Total # of gallons pumped: " + d.G);
    }

}
