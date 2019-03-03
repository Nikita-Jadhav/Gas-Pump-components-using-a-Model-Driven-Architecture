package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore1;
/*
GasPump1:DisplayMenu prints the main menu
 */
public class DisplayMenu1 extends DisplayMenu
{
    public DisplayMenu1(DataStore data) 
    {
        super(data);
    }
    /*
        Print a menu and display "credit card approved" message
    */
    @Override
    public void displayMenu() 
    {
        DataStore1 d = (DataStore1) data;
        
        System.out.println("Please select gas type:");
        System.out.println(
                "(5) Regular [$" + d.Rprice + "/gal] " +
                        "\n(6) Diesel [$" + d.Sprice + "/gal]");
        System.out.println("Otherwise, select (7) to cancel");
    }
}
