package Strategy;

import DataRepository.DataStore;

/*
GasPump2:WrongPinMsg does not support since debit card is not used
 */
public class WrongPinMsg2 extends WrongPinMsg 
{
    /*
        GasPump2 does not support payment with debit card so no action
    */
    
    @Override
    public void wrongPinMsg()
    {

    }
}
