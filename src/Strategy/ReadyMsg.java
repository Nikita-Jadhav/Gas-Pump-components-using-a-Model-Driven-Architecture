package Strategy;
import DataRepository.DataStore;
/*
    Abstract ReadyMsg action strategy
 */
public abstract class ReadyMsg
{
    DataStore data;
    public ReadyMsg(DataStore data)
    {
        this.data = data;
    }
    public abstract void readyMsg();
}
