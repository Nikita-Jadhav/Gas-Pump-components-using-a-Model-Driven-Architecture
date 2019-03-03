package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore2;

/* 
 * GasPump2: SetPrice updates the values of Rprice, Sprice and Pprice based on a, b and c respectively
 */
public class SetPrice2 extends SetPrice 
{

    public SetPrice2(DataStore data)
    {
        super(data);
    }
    /*
        Set the price per gallon for this transaction according to the type of gas which was selected to be pumped
        g = 1: Regular gas
        g = 2: Super gas
        g = 3: Premium gas
    */
    @Override
    public void setPrice(int g, int M)
    {
        DataStore2 d = (DataStore2) data;
        if (g == 1 )
        { 
            // Regular selected
            d.price = d.Rprice;
            d.gasType = "Regular";
        }
        else if (g == 2) 
        {
            // Super selected
            d.price = d.Sprice;
            d.gasType = "Super";
        } 
        else if (g == 3)
        { 
            // Premium selected
            d.price = d.Pprice;
            d.gasType = "Premium";
        }
        System.out.println(d.gasType + " gasoline selected @ price of $" + d.price + "/liter");
        System.out.println("Select (7) to start the pump");
    }
}
