package GasPump;

import AbstractFactory.AbstractFactory;
import DataRepository.DataStore;
import MDA.MDAEFSM;
import Output.Output;
/*
 * 
 * This class is inherited by GasPump1 and GasPump2 and they will call the superclass's constructor passing in its own ConcreteFactory
    as the AbstractFactory field. The ConcreteFactory class makes sure each returned object has the proper
    object references
*/
public abstract class GasPump {
    DataStore data;
    MDAEFSM model;
    GasPump(AbstractFactory af) {
        this.data = af.getDataObj();
        this.model = new MDAEFSM();
        this.model.setOP(new Output(af));
    }
    /*
        display menu corresponding to each GasPump
     */
    public abstract void printOperations();

}
