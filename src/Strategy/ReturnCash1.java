package Strategy;

import DataRepository.DataStore;

/*
GasPump1:ReturnCash does not support since cash not used
 */
public class ReturnCash1 extends ReturnCash 
{
    /*
        GasPump1 does not support payment with cash so no action
    */
    public ReturnCash1(DataStore data) 
    {
        super(data);
    }
    @Override
    public void returnCash()
    {

    }
}
