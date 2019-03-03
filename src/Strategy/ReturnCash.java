package Strategy;
import DataRepository.DataStore;
/*
    Abstract ReturnCash action strategy
 */
public abstract class ReturnCash 
{
    DataStore data;
    /*public ReturnCash() 
    {
    }*/
    public ReturnCash(DataStore data)
    {
        this.data = data;
    }
    public abstract void returnCash();
}
