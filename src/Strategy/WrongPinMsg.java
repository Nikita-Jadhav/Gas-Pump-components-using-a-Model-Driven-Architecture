package Strategy;

import DataRepository.DataStore;

/*
    Abstract CancelMsg action strategy.
    
 */
public abstract class WrongPinMsg 
{
    DataStore data;
    public WrongPinMsg()
    {
       
    }
    public abstract void wrongPinMsg();
    
}