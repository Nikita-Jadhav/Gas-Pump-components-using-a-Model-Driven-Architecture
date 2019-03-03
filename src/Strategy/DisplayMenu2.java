package Strategy;

import DataRepository.DataStore;
import DataRepository.DataStore2;

/*
GasPump2:DisplayMenu prints the main menu
 */
public class DisplayMenu2 extends DisplayMenu 
{
    public DisplayMenu2(DataStore data) 
    {
        super(data);
    }
    @Override
    public void displayMenu() 
    {
        DataStore2 d = (DataStore2) data;
        System.out.println("Please select gas type: ");
        System.out.println(
                "(3) Regular [$" + d.Rprice + "/liter] " +
                        "\n(4) Super [$" + d.Sprice + "/liter] " +
                        "\n(5) Premium [$" + d.Pprice + "/liter]");
        System.out.println("Otherwise, select (6) to cancel");
    }
}
