package Strategy;

import DataRepository.DataStore;
import DataRepository.DataStore2;

/*
    GasPump2 StorePrices action responsible for storing the "a", "b", "c"  price parameters specified by
    method "Activate" of the InputProcessor for GasPump2
 */
public class StorePrices2 extends StorePrices 
{

    public StorePrices2(DataStore data) 
    {
        super(data);
    }
    /*
        Read the temporary variables "a", "b", and "c"  
        & initialize the gas prices
     */
    @Override
    public void storePrices() 
    {
        DataStore2 d = (DataStore2) data;
        d.Rprice = d.a;
        d.Sprice = d.b;
        d.Pprice = d.c;
        System.out.println("GasPump2 triggered successfully!!!");
    }
}
