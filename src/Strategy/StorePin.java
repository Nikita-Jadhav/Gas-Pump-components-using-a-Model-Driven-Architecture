package Strategy;
import DataRepository.DataStore;
/*
    Abstract StorePin action strategy
 */
public abstract class StorePin 
{
    DataStore data;
    public StorePin(DataStore data) 
    {
        this.data = data;
    }
    public abstract void storePin();
}
