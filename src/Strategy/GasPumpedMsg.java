package Strategy;
import DataRepository.DataStore;
/*
    Abstract GasPumpedMsg action strategy
 */
public abstract class GasPumpedMsg
{
    DataStore data;
    public GasPumpedMsg(DataStore data)
    {
        this.data = data;
    }
    public abstract void gasPumpedMsg();
}
