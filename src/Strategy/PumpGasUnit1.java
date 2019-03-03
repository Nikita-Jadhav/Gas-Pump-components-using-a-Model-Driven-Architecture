package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore1;
/*
GasPump1:PumpGasUnit for pumping a gallon of gas
 */
public class PumpGasUnit1 extends PumpGasUnit 
{
    public PumpGasUnit1(DataStore data) 
    {
        super(data);
    }
    /*
        Read and update attributes corresponding to pumping a gallon of gas
     */
    @Override
    public void pumpGasUnit()
    {
        DataStore1 d = (DataStore1) data;
        d.G++;
        d.total = d.price * d.G;
    }
}
