package Strategy;
import DataRepository.DataStore;
/*
    Abstract StoreCash action strategy
 */
public abstract class StoreCash 
{
    DataStore data;
    /*public StoreCash() 
    {
    }*/
    public StoreCash(DataStore data) 
    {
        this.data = data;
    }
    public abstract void storeCash();
}
