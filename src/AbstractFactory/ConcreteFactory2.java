package AbstractFactory;

import DataRepository.DataStore;
import DataRepository.DataStore2;
import Strategy.CancelMsg;
import Strategy.CancelMsg2;
import Strategy.DisplayMenu;
import Strategy.DisplayMenu2;
import Strategy.EnterPinMsg;
import Strategy.EnterPinMsg2;
import Strategy.GasPumpedMsg;
import Strategy.GasPumpedMsg2;
import Strategy.InitializeData;
import Strategy.InitializeData2;
import Strategy.PayMsg;
import Strategy.PayMsg2;
import Strategy.PrintReceipt;
import Strategy.PrintReceipt2;
import Strategy.PumpGasUnit;
import Strategy.PumpGasUnit2;
import Strategy.ReadyMsg;
import Strategy.ReadyMsg2;
import Strategy.RejectMsg;
import Strategy.RejectMsg2;
import Strategy.ReturnCash;
import Strategy.ReturnCash2;
import Strategy.SetInitialValues;
import Strategy.SetInitialValues2;
import Strategy.SetPrice;
import Strategy.SetPrice2;
import Strategy.StopMsg;
import Strategy.StopMsg2;
import Strategy.StoreCash;
import Strategy.StoreCash2;
import Strategy.StorePin;
import Strategy.StorePin2;
import Strategy.StorePrices;
import Strategy.StorePrices2;
import Strategy.WrongPinMsg;
import Strategy.WrongPinMsg2;
/*
    This class is the factory that produces the necessary driver objects for GasPump2
    Output processor will call the methods provided by this class in order to bind
    GasPump2 specific actions.
*/
public class ConcreteFactory2 extends AbstractFactory {
    private DataStore data;
    public ConcreteFactory2() {
        // Create DataStore object
        data  = new DataStore2();
    }
    /*
        Returns the shared data structure
     */
    @Override
    public DataStore getDataObj() {
        return this.data;
    }

    /*
        Returns the CancelMsg class to display cancel message
     */
    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg2();
    }

    /*
        Returns the DisplayMenu class to display menu for GasPump2
     */
    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu2(this.data);
    }

    /*
        Returns the GasPumpedMsg class that displays the unit of gas has been pumped
     */
    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg2(this.data);
    }

    /*
        Returns the Payment prompt message
     */
    @Override
    public PayMsg getPayMsg() {
        return new PayMsg2();
    }

    /*
        Returns the PrintReceipt class for printing receipt
     */
    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt2(this.data);
    }

    /*
        Returns the PumpGasUnit class which is responsible to "pumping" a unit of gas for GasPump2
     */
    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit2(this.data);
    }

    /*
        Returns the ReadyMsg class which tells user to start pumping
     */
    @Override
    public ReadyMsg getReadyMsg() {
        return new ReadyMsg2(this.data);
    }

    /*
        Returns the RejectMsg class for GasPump2 does not support credit card as payment so action strategy method will have an empty body
     */
    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg2();
    }

    /*
        Returns the ReturnCash action will display return cash along with any cash which is to be returned
     */
    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash2(this.data);
    }

    /*
        Returns the SetInitialValues class 
    */
    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues2(this.data);
    }

    /*
        Returns the SetPrice class for setting the price of gas
    */
    @Override
    public SetPrice getSetPrice() {
        return new SetPrice2(this.data);
    }

    /*
        Returns the StopMsg class which displays GasPump has stopped
     */
    @Override
    public StopMsg getStopMsg() {
        return new StopMsg2();
    }

    /*
        Returns the StoreCash class which provides the appropriate action for storing cash
        on GasPump2.
     */
    @Override
    public StoreCash getStoreCash() {
        return new StoreCash2(this.data);
    }

    /*
        Returns the StorePrices class which stores temporary data
     */
    @Override
    public StorePrices getStorePrices() {
        return new StorePrices2(this.data);
    }
    
    @Override
    public StorePin getStorePin() {
        return new StorePin2(this.data);
    }
    @Override
    public EnterPinMsg getEnterPinMsg() {
        return new EnterPinMsg2(this.data);
    }
    @Override
    public WrongPinMsg getWrongPinMsg() {
       return new WrongPinMsg2();
    }
    @Override
    public InitializeData getInitializeData() {
       return new InitializeData2(this.data);
    }

}
