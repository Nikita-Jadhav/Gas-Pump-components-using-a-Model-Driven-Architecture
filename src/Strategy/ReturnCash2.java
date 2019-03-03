package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore2;
/*
GasPump2:ReturnCash returns the outstanding amount of cash
 */
public class ReturnCash2 extends ReturnCash {

    public ReturnCash2(DataStore data) 
    {
        super(data);
    }
    /*
        This method first reads the shared data structure to calculate the amount of cash to return
        If there is any amount greater than $0 that is owed to the user, print a message indicating so,
        and return the cash
        Then, reset the data structure "cash" attribute to 0
     */
    @Override
    public void returnCash() 
    {
        DataStore2 d = (DataStore2) data;
        float cash_return = d.cash - d.total;
        if (cash_return > 0) 
        {
            System.out.println("Cash to be returned: $" + cash_return);
            System.out.println("Returning $" + cash_return);
        } 
        else 
        {
            System.out.println("No cash to return");
        }
        d.cash = 0;
        System.out.println("Transaction completed");
    }
}
