package AbstractFactory;

import DataRepository.DataStore;
import DataRepository.DataStore1;
import Strategy.CancelMsg;
import Strategy.CancelMsg1;
import Strategy.DisplayMenu;
import Strategy.DisplayMenu1;
import Strategy.EnterPinMsg;
import Strategy.EnterPinMsg1;
import Strategy.GasPumpedMsg;
import Strategy.GasPumpedMsg1;
import Strategy.InitializeData;
import Strategy.InitializeData1;
import Strategy.PayMsg;
import Strategy.PayMsg1;
import Strategy.PrintReceipt;
import Strategy.PrintReceipt1;
import Strategy.PumpGasUnit;
import Strategy.PumpGasUnit1;
import Strategy.ReadyMsg;
import Strategy.ReadyMsg1;
import Strategy.RejectMsg;
import Strategy.RejectMsg1;
import Strategy.ReturnCash;
import Strategy.ReturnCash1;
import Strategy.SetInitialValues;
import Strategy.SetInitialValues1;
import Strategy.SetPrice;
import Strategy.SetPrice1;
import Strategy.StopMsg;
import Strategy.StopMsg1;
import Strategy.StoreCash;
import Strategy.StoreCash1;
import Strategy.StorePin;
import Strategy.StorePin1;
import Strategy.StorePrices;
import Strategy.StorePrices1;
import Strategy.WrongPinMsg;
import Strategy.WrongPinMsg1;
/*
    This class is the factory that produces the necessary driver objects for GasPump1
    Instantiates the proper action strategies with the shared data structure
    OutputProcessor object will be instantiated with an object of this class when it needs to
    display output for GasPump1. Output processor will call the methods provided by this class in order to bind
    GasPump1 specific actions.
 */
public class ConcreteFactory1 extends AbstractFactory {
    private DataStore data;

    public ConcreteFactory1() {
    // create DataStore object
        this.data  = new DataStore1();
    }
    // Returns the shared data structure
    @Override
    public DataStore getDataObj() {
        return this.data;
    }
    /*
        Returns the CancelMsg class
     */
    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg1();
    }
    /*
        Returns the DisplayMenu class
     */
    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu1(this.data);
    }
    /*
        Returns the GasPumpedMsg class
     */
    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg1(this.data);
    }

    /*
        Returns message to ask the user for Payment
     */
    @Override
    public PayMsg getPayMsg() {
        return new PayMsg1();
    }

    /*
        Returns the PrintReceipt class which is responsible to print receipt
     */
    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt1(this.data);
    }

    /*
        Returns the PumpGasUnit class which is used to "pumping" a unit of gas
     */
    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit1(this.data);
    }

    /*
        Returns the ReadyMsg class which prompts the user to start pumping gas
     */
    @Override
    public ReadyMsg getReadyMsg() {
        return new ReadyMsg1(this.data);
    }

    /*
        Returns the RejectMsg class and displays card rejected message
     */
    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg1();
    }

    /*
        Returns the ReturnCash but cash is not a supported payment
     */
    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash1(this.data);
    }

    /*
        Returns the SetInitialValues class for initializing
     */
    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues1(this.data);
    }

    /*
        Returns the SetPrice class to set the price of Gas
     */
    @Override
    public SetPrice getSetPrice() {
        return new SetPrice1(this.data);
    }

    /*
        Returns the StopMsg class which informs the user that gaspump stopped
     */
    @Override
    public StopMsg getStopMsg() {
     return new StopMsg1();
    }
    /*
        Returns the StoreCash action but as GasPump1 does not support cash as payment so will have an empty body for GasPump1
     */
    @Override
    public StoreCash getStoreCash() {
        return new StoreCash1(this.data);
    }
    /*
        Returns the StorePrices action for storing data
     */
    @Override
    public StorePrices getStorePrices() {
        return new StorePrices1(this.data);
    }
    @Override
    public StorePin getStorePin() {
        return new StorePin1(this.data);
    }
    @Override
    public EnterPinMsg getEnterPinMsg() {
        return new EnterPinMsg1(this.data);
    }
    @Override
    public WrongPinMsg getWrongPinMsg() {
       return new WrongPinMsg1();
    }
    @Override
    public InitializeData getInitializeData() {
       return new InitializeData1(this.data);
    }
}
