package Strategy;
import DataRepository.DataStore;
import DataRepository.DataStore1;
/*
GasPump1:SetPrice updates the values of Rprice and Sprice based on a and b respectively
 */
public class SetPrice1 extends SetPrice
{

    public SetPrice1(DataStore data)
    {
        super(data);
    }
/*
        Set the price per gallon for this transaction according to the type of gas which was selected to be pumped
        g = 1: Regular gas
        g = 4: Diesel gas
         */
    @Override
    public void setPrice(int g, int M) {
        DataStore1 d = (DataStore1) data;
        if (g == 1) 
        { 
            // Regular selected
            d.price = d.Rprice;
            d.gasType = "Regular";
            M=1;
        } 
        else if (g == 4) 
        {
            // Diesel selected
            d.price = d.Sprice;
            d.gasType = "Diesel";
            M=1;
        }
        System.out.println(d.gasType + " gasoline selected @ price of $" + d.price + "/gallon");
        System.out.println("Select (8) to start the pump");
    }
}
