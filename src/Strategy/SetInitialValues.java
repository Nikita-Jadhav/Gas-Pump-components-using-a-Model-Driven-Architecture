package Strategy;
import DataRepository.DataStore;
/*
    Abstract SetInitialValues action strategy
 */
public abstract class SetInitialValues 
{
    DataStore data;
    public SetInitialValues(DataStore data) 
    {
        this.data = data;
    }
    public abstract void setInitialValues();
}
