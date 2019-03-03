package GasPump;
import AbstractFactory.AbstractFactory;
import DataRepository.DataStore1;
/*
    Processing input of GasPump1
 */
public class GasPump1 extends GasPump {
    public GasPump1(AbstractFactory af) {
        super(af);
    }
    /*
        display menu
     */
    @Override
    public void printOperations() {
        System.out.println(
                        "\nSelect operation: " +
                        "\n 0. Activate(float a, float b) " + "   1. Start " + "   2. PayDebit " + "   3. For Debit(Pin) "+"    4.ApproveDebit" +
                        "\n c. PayCredit " +"    a. ApproveCredit " + " r. Reject "+
                        "\n 5. Regular " + "     6. Diesel " +
                        "\n 7. Cancel " + "    8. StartPump " + "    9. PumpGallon " +
                        "\n 10. FullTank " + "   s. StopPump " + "   e. Exit "
        );
    }
    /*
        Check the input parameters and call the
        activate()
        a: price of Regular gas
        b: price of Diesel gas
     */
    public void Activate(float a, float b) {
        if (a > 0 && b > 0) {
            DataStore1 d = (DataStore1) this.data;
            d.a = a;
            d.b = b;
            model.activate();
        } 
        else {
            System.out.println("Failed! Price should be > $0");
        }
    }
    /*
        Call the start()
    */
    public void Start() {
        model.start();
    }
    /*
        Call the payType() and print a debit card authentication message
     */
    public void PayDebit() {
        model.payType(3);
    }
    /*
        Call the payType() and print a credit card authentication message
     */
    public void PayCredit() {
        model.payType(1);
    }
    /*
        Call the Pin() with x-input as the string
    */
    public void Pin(String x) {
       DataStore1 d = (DataStore1) data;
       d.temp_p=x;
       d.pin=d.temp_p;
    }
    /*
        Call the reject()
     */
    public void Reject() {
        model.reject();
    }
    /*
        Call the cancel() 
     */
    public void Cancel() {
        model.cancel();
    }
    /*
        Call the selectGas()and pass in 1 as the gas-type 
     */
    public void Regular() {
        model.selectGas(1,1);
    }
    /*
        Call the selectGas()and pass in 4 as the gas-type
     */
    public void Diesel() {
        model.selectGas(4,1);
    }
    /*
        Call the startPump() 
     */
    public void StartPump() {
        DataStore1 d = (DataStore1) data;
        model.Continue();
        if(d.price>0)
        {
        model.startPump();
        }
    }
    /*
        Call the pump()
     */
    public void PumpGallon() {
        model.pump();
    }
    /*
        Call the approve() for debit card
     */
    public void approve(String p)
    {
       DataStore1 d = (DataStore1) this.data;
       if(p.equals(d.pin))
       {
           model.correctPin();
       }
       else
       {
           model.incorrectPin();
       }
    }
    /*
        Call the approvec() for credit card
     */
    public void approvec()
    {
        model.approvec();
    }
    /*
        call the stopPump()
        GasPump1 always prints receipts.
     */
    public void StopPump() {
        model.stopPump();
    }
    /* 
    call the FullTank() and receipt()
    */
     public void FullTank() { 
        model.receipt();
    }
}
