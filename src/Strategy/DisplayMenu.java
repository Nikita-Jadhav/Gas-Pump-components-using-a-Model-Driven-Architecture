package Strategy;
import DataRepository.DataStore;
/*
    Abstract DisplayMenu action strategy
 */
public abstract class DisplayMenu 
{
    DataStore data;
    public DisplayMenu(DataStore data) 
    {
        this.data = data;
    }
    public abstract void displayMenu();
}
