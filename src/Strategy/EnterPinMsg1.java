package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore1;

public class EnterPinMsg1 extends EnterPinMsg 
{
    public EnterPinMsg1(DataStore data) 
    {
        super(data);
    }
    
    @Override
    public void enterPinMsg() 
    {
        DataStore1 d = (DataStore1) data;
        System.out.println("Pin entered");
    }
}
