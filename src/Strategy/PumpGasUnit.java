package Strategy;
import DataRepository.DataStore;
/*
    Abstract PumpGasUnit action strategy
 */
public abstract class PumpGasUnit
{
    DataStore data;
    public PumpGasUnit(DataStore data)
    {
        this.data = data;
    }
    public abstract void pumpGasUnit();
}
