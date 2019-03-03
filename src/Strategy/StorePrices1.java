package Strategy;

import DataRepository.DataStore;
import DataRepository.DataStore1;

/*
    GasPump1 StorePrices action stores the "a" and "b" price parameters specified by
    method "Activate" of the InputProcessor for GasPump1
 */
public class StorePrices1 extends StorePrices 
{
    public StorePrices1(DataStore data) 
    {
        super(data);
    }
    /*
        Read the temporary variables "a" and "b"
        & Initialize the gas prices
     */
    @Override
    public void storePrices() 
    {
        DataStore1 d = (DataStore1) data;
        d.Rprice = d.a;
        d.Sprice = d.b;
        System.out.println("GasPump1 triggered successfully!!!");
    }
}
