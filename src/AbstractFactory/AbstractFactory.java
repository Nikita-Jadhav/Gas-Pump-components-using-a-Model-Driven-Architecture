package AbstractFactory;

import DataRepository.DataStore; 
import Strategy.CancelMsg;
import Strategy.DisplayMenu;
import Strategy.EnterPinMsg;
import Strategy.GasPumpedMsg;
import Strategy.InitializeData;
import Strategy.PayMsg;
import Strategy.PrintReceipt;
import Strategy.PumpGasUnit;
import Strategy.ReadyMsg;
import Strategy.RejectMsg;
import Strategy.ReturnCash;
import Strategy.SetInitialValues;
import Strategy.SetPrice;
import Strategy.StopMsg;
import Strategy.StoreCash;
import Strategy.StorePin;
import Strategy.StorePrices;
import Strategy.WrongPinMsg;

/*
 
 	takes all the ConcreteFactory classes in 1 AbstractFactory class
 	Consists of the methods that concreteFactory class needs to implement

 */
public abstract class AbstractFactory {

    public abstract DataStore getDataObj();

    public abstract CancelMsg getCancelMsg();

    public abstract DisplayMenu getDisplayMenu();

    public abstract GasPumpedMsg getGasPumpedMsg();

    public abstract PayMsg getPayMsg();

    public abstract PrintReceipt getPrintReceipt();

    public abstract PumpGasUnit getPumpGasUnit();

    public abstract ReadyMsg getReadyMsg();

    public abstract RejectMsg getRejectMsg();

    public abstract ReturnCash getReturnCash();

    public abstract SetInitialValues getSetInitialValues();

    public abstract SetPrice getSetPrice();

    public abstract StopMsg getStopMsg();

    public abstract StoreCash getStoreCash();

    public abstract StorePrices getStorePrices();
    
    public abstract WrongPinMsg getWrongPinMsg();
    
    public abstract EnterPinMsg getEnterPinMsg();
    
    public abstract InitializeData getInitializeData();
    
    public abstract StorePin getStorePin();
    

}