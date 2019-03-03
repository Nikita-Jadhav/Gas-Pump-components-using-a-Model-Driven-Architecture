package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore2;
/*
GasPump2:StoreCash updates the shared data structure with the inserted cash amount
    during each transaction
 */
public class StoreCash2 extends StoreCash 
{
    public StoreCash2(DataStore data) 
    {
        super(data);
    }
    /*
        Read the temporarily cash information and store it in the cash attribute of the shared data structure.
        print the amount of cash that was inserted
     */
    @Override
    public void storeCash()
    {
        DataStore2 d = (DataStore2) data;
        d.cash = d.temp_cash;
        System.out.println("Inserted/Deposited Sum of cash: $" + d.cash);
    }
}