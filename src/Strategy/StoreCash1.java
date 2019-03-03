package Strategy;

import DataRepository.DataStore;

/*
GasPump1:StoreCash not supported
 */
public class StoreCash1 extends StoreCash 
{
    /*
        GasPump1 does not bolster payment with cash, and so this method should never be invoked
        by GasPump1
    */
    public StoreCash1(DataStore data) 
    {
        super(data);
    }
    @Override
    public void storeCash() {

    }
}
