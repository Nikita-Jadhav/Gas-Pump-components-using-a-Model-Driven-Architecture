package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore1;
/*
GasPump1:InitializeData will initialize the value of price and cash
 */
public class InitializeData1 extends InitializeData 
{
    public InitializeData1(DataStore data) 
    {
        super(data);
    }
    /*
        Set the price to zero for this transaction
    & cash can't be set since no cash transaction
     */
    @Override
    public void initializeData() 
    {
        DataStore1 d = (DataStore1) data;
        d.price = 0;
    }
}
