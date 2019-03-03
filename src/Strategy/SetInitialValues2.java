package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore2;
/*
GasPump2:SetInitialValues will initialize the values of L and total
 */
public class SetInitialValues2 extends SetInitialValues 
{
    public SetInitialValues2(DataStore data)
    {
        super(data);
    }
    /*
        Set the number of liters pumped and payment balance initially to zero for this transaction
     */
    @Override
    public void setInitialValues()
    {
        DataStore2 d = (DataStore2) data;
        d.L = 0;
        //d.total = 0;
    }
}
