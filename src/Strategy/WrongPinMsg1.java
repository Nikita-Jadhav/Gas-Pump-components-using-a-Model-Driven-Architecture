package Strategy;

import DataRepository.DataStore;

public class WrongPinMsg1 extends WrongPinMsg
{
    
    @Override
    public void wrongPinMsg() {
        System.out.println("Pin Number entered is wrong!!!");
    }
}
