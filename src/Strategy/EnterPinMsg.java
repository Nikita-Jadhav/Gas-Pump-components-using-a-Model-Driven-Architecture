package Strategy;
/*
    Abstract EnterPinMsg action strategy
 */
import DataRepository.DataStore;

public abstract class EnterPinMsg 
{
    DataStore data;
    public EnterPinMsg(DataStore data) 
    {
        this.data = data;
    }
    public abstract void enterPinMsg();
}

