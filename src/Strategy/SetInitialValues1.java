package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore1;
/*
GasPump1:SetInitialValues will initialize the value of G and total
 */
public class SetInitialValues1 extends SetInitialValues 
{
    public SetInitialValues1(DataStore data) 
    {
        super(data);
    }
    /*
        Set the number of gallons pumped and payment balance initially to zero for this transaction
     */
    @Override
    public void setInitialValues() 
    {
        DataStore1 d = (DataStore1) data;
        d.G = 0;
        d.total = 0;
    }
}
