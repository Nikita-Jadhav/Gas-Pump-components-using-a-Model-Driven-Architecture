package Output;

import AbstractFactory.AbstractFactory;
import DataRepository.DataStore;
import Strategy.CancelMsg;
import Strategy.DisplayMenu;
import Strategy.GasPumpedMsg;
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
import Strategy.StorePrices;
import Strategy.EnterPinMsg;
import Strategy.InitializeData;
import Strategy.StorePin;
import Strategy.WrongPinMsg;
/*
    Output processor for the Gas Pump
   
 */
public class Output {
    private CancelMsg cancelMsg;
    private DisplayMenu displayMenu;
    private GasPumpedMsg gasPumpedMsg;
    private PayMsg payMsg;
    private PrintReceipt printReceipt;
    private PumpGasUnit pumpGasUnit;
    private ReadyMsg readyMsg;
    private RejectMsg rejectMsg;
    private ReturnCash returnCash;
    private SetInitialValues setInitialValues;
    private SetPrice setPrice;
    private StopMsg stopMsg;
    private StoreCash storeCash;
    private StorePrices storePrices;
    private DataStore data;
    private EnterPinMsg enterPinMsg;
    private InitializeData initializeData;
    private StorePin storePin;
    private WrongPinMsg wrongPinMsg;

    public Output(AbstractFactory af) {
        this.cancelMsg = af.getCancelMsg();
        this.displayMenu = af.getDisplayMenu();
        this.gasPumpedMsg = af.getGasPumpedMsg();
        this.payMsg = af.getPayMsg();
        this.printReceipt = af.getPrintReceipt();
        this.pumpGasUnit = af.getPumpGasUnit();
        this.readyMsg = af.getReadyMsg();
        this.rejectMsg = af.getRejectMsg();
        this.returnCash = af.getReturnCash();
        this.setInitialValues = af.getSetInitialValues();
        this.setPrice = af.getSetPrice();
        this.stopMsg = af.getStopMsg();
        this.storeCash = af.getStoreCash();
        this.storePrices = af.getStorePrices();
        this.storePin = af.getStorePin();
        this.enterPinMsg = af.getEnterPinMsg();
        this.initializeData = af.getInitializeData();
        this.wrongPinMsg = af.getWrongPinMsg();
    }

    /*
     *  Meta-actions (implemented using Strategy pattern)
     */

    public void CancelMsg() {
        this.cancelMsg.cancelMsg();
    }

    public void DisplayMenu() {
        this.displayMenu.displayMenu();
    }

    public void GasPumpedMsg() {
        this.gasPumpedMsg.gasPumpedMsg();
    }

    public void PayMsg() {
        this.payMsg.payMsg();
    }

    public void PrintReceipt() {
        this.printReceipt.printReceipt();
    }

    public void PumpGasUnit() {
        this.pumpGasUnit.pumpGasUnit();
    }

    public void ReadyMsg() {
        this.readyMsg.readyMsg();
    }

    public void RejectMsg() {
        this.rejectMsg.rejectMsg();
    }

    public void ReturnCash() {
        this.returnCash.returnCash();
    }

    public void SetInitialValues() {
        this.setInitialValues.setInitialValues();
    }

    public void SetPrice(int g, int M) {
        this.setPrice.setPrice(g,M);
    }

    public void StopMsg() {
        this.stopMsg.stopMsg();
    }

    public void StoreCash() {
        this.storeCash.storeCash();
    }

    public void StorePin() {
        this.storePin.storePin();
    }
    public void StorePrices() {
        this.storePrices.storePrices();
    }
    public void EnterPinMsg() {
        this.enterPinMsg.enterPinMsg();
    }
    public void WrongPinMsg() {
        this.wrongPinMsg.wrongPinMsg();
    }
    public void InitializeData() {
        this.initializeData.initializeData();
    }

}
