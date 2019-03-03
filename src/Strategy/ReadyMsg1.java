package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore1;
/*
GasPump1:ReadyMsg prints a ready message
 */
public class ReadyMsg1 extends ReadyMsg
{
    public ReadyMsg1(DataStore data) 
    {
        super(data);
    }
    /*
        display message GasPump is ready to dispense 1 gallon of selected gasline
     */
    @Override
    public void readyMsg()
    {
        System.out.println("\nReady to Dispense Gas");
        DataStore1 d = (DataStore1) data;
        System.out.println("Select (9) to dispense 1 gallon of " + d.gasType + " gasoline");
        System.out.println("Otherwise, select (s) to stop");
    }
}
