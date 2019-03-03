package Strategy;
import DataRepository.DataStore;
/*
    Abstract SetPrice action strategy
 */
public abstract class SetPrice 
{
    DataStore data;
    public SetPrice(DataStore data)
    {
        this.data = data;
    }
    public abstract void setPrice(int g, int M);
}
