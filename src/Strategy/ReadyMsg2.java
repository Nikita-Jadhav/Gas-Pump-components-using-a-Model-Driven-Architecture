package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore2;
/*
GasPump2:ReadyMsg print a ready message
 */
public class ReadyMsg2 extends ReadyMsg 
{
    public ReadyMsg2(DataStore data)
    {
        super(data);
    }
    /*
    display message GasPump is ready to dispense 1 liter of selected gasline
 */
    @Override
    public void readyMsg()
    {
        System.out.println("\nREADY TO DISPENSE FUEL");
        DataStore2 d = (DataStore2) data;
        System.out.println("Select (8) to dispense 1 liter of " + d.gasType + " gasoline");
        System.out.println("Otherwise, select (9) to stop");
    }
}
