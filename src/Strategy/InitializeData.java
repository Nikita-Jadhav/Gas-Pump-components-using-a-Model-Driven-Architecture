package Strategy;
import DataRepository.DataStore;
/*
    Abstract InitializeData action strategy
 */
public abstract class InitializeData 
{
    DataStore data;
    public InitializeData(DataStore data) 
    {
        this.data = data;
    }
    public abstract void initializeData();
}

