package Strategy;

import DataRepository.DataStore;
import DataRepository.DataStore2;

/*
    GasPump2 PumpGasUnit action for pumping a liter of gas
 */
public class PumpGasUnit2 extends PumpGasUnit {

    public PumpGasUnit2(DataStore data) {
        super(data);
    }
    /*
    Read and update attributes corresponding to pumping a liter of gas
 */ 
    
    @Override
    public void pumpGasUnit() {
        DataStore2 d = (DataStore2) data;

        d.L++;
        d.total = d.price * d.L;
    }
}
