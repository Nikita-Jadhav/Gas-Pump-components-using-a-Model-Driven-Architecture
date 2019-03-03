package GasPump;
import AbstractFactory.AbstractFactory;
import DataRepository.DataStore2;
/*
    Processor input for GasPump2
 */
public class GasPump2 extends GasPump {
    public GasPump2(AbstractFactory af) {
        super(af);
    }
    /*
        display Menu
     */
    @Override
    public void printOperations() {
        System.out.println(
                        "\nSelect operation: " +
                        "\n 0. Activate(int a, int b, int c)" + "    1. PayCash " + 
                        "\n 2. PayCredit "+ "    a. Approve " + "    r. Reject " +       
                        "\n 3. Regular " + "    4. Super " + "    5. Premium " + "    6. Cancel " +
                        "\n 7. StartPump " + "    8. PumpLiter " + "    9. Stop " +
                        "\n p. PrintReceipt " + "     n. NoReceipt " + "    e. Quit the program ");
     } 
    /*
        Check the input parameters and call activate()
        
        a: price of Regular gas
        b: price of Super gas
        c: price of Premium gas
     */
    public void Activate(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            DataStore2 d = (DataStore2) data;
            d.a = a;
            d.b = b;
            d.c = c;
            model.activate();
        } else {
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
   
        call the payType()
     */
    public void PayCash(float cash) {
        if (cash > 0) {
            DataStore2 d = (DataStore2) data;
            d.temp_cash = cash;
            model.payType(2);
            d.M=0;
            
        } else {
            System.out.println("Cash should be > $0");
        }
    }
    /*
        Call the cancel() 
     */
    public void Cancel() {
        model.cancel();
    }
    /*
        Call the Reject() 
     */
    public void Reject() {
        model.reject();
    }
    /*
        Call the selectGas()and pass in 1 as the gas-type
     */
    public void Regular() {
        DataStore2 d = (DataStore2) data;
        if(d.M==1)
        {
        model.selectGas(1,1);
        }
        else
        model.selectGas(1, 0);
    }
    /*Call the selectGas()and pass in 2 as the gas-type
     */
    public void Super() {
       DataStore2 d = (DataStore2) data;
        if(d.M==1)
        {
        model.selectGas(2,1);
        }
        else
        model.selectGas(2, 0);
    }
    /*Call the selectGas()and pass in 3 as the gas-type
     */
    public void Premium() {
       DataStore2 d = (DataStore2) data;
        if(d.M==1)
        {
        model.selectGas(3,1);
        }
        else
        model.selectGas(3, 0);
    }
    /*
        Call the startPump() 
     */
    public void StartPump() {
        DataStore2 d = (DataStore2) data;
        model.Continue();
        if(d.M==1)
        {
            model.startPump();
            d.price= (float)(1.1 * d.price);
            d.L=0;
            //System.out.println("Price*****="+d.price+"Liters="+d.L);
        }
        else if(d.M==0)
        {
            model.startPump();
            d.L=0;
            //System.out.println("Price="+d.price+"Liters="+d.L);
        }
    }
    public void PayCredit() {
        DataStore2 d = (DataStore2) data;
            model.payType(1);
            d.M=1;
        }
    /*
        If there is not enough cash to pump another liter, print a message indicating as such,
        and call the stopPump() 

        Otherwise, call the pump()
     */
    public void PumpLiter() {
        DataStore2 d = (DataStore2) data;
        if ((d.M==0) && (d.cash < d.price * (d.L + 1))) 
        {
            System.out.println("Limited Balance");
            model.stopPump();
        } 
        else if((d.M==0) && (d.cash>=d.price * (d.L + 1))) 
        {
            model.pump();
            
        }
        else if((d.M==1))
        {
            model.pump();
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
        Call the approve() for debit card
     */
    public void approve()
    {
       DataStore2 d = (DataStore2) data;
        d.M=1;
    }
    /*
        Call the stopPump()
     */
    public void Stop() {
        model.stopPump();
    }
    /*
        Call the receipt()
     */
    public void Receipt() {
        model.receipt();
    }
    /*
        Call the noReceipt()
     */
    public void NoReceipt() {
        model.noReceipt();
    }
}
