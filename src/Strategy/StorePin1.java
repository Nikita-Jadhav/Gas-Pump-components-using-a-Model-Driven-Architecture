package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore1;
/*

 */
public class StorePin1 extends StorePin 
{
    public StorePin1(DataStore data) 
    {
        super(data);
    }
    
    @Override
    public void storePin()
    {
        DataStore1 d = (DataStore1) data;
        d.pin = d.temp_p;
        System.out.println("Pin stored: $" + d.pin);
    }
}
