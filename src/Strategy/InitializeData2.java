package Strategy;

import DataRepository.DataStore;

/*
GasPump2:InitializeData doesn't initilaise pricec & cash
 */
public class InitializeData2 extends InitializeData 
{

    public InitializeData2(DataStore data) {
     super(data);
    }
    @Override
    public void initializeData() 
    {
       
    }
}

