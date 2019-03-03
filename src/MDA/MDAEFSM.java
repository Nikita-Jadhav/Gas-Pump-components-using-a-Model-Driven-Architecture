package MDA;
import Output.Output;
/*
    State classes are responsible for performing
        1) Actions
        2) State transitions
 */

public class MDAEFSM {
    protected State s;
    protected State[] LS;
    private Output op;
    public int M;

    public MDAEFSM() {
        // list of states in the EFSM
        LS = new State[10];

        // instantiate each state, passing in a reference to this VM class
        LS[9] = new Idle(this);
        LS[0] = new S0(this);
        LS[1] = new S1(this);
        LS[2] = new S2(this);
        LS[3] = new S3(this);
        LS[4] = new S4(this);
        LS[5] = new S5(this);
        LS[6] = new S6(this);
        LS[8] = new S8(this);

        s = LS[9]; // Initially in the Idle State
    }

    public Output getOP() {
        return op;
    }
 
    public void setOP(Output op) {
        this.op = op;
    }

    /*
        State operations
     */

    public void activate() {
        s.activate();
    }

    public void start() {
        s.start();
    }

    /*
        t = 1 represents credit card payment type
        t = 2 represents cash payment type
        t = 3 represents debit card payment type
     */
    public void payType(int t) {
        s.payType(t);
    }

    public void approve() {
        s.approve();
    }
    public void approvec()
    {
        s.approvec();
        s.M=1;
    }

    public void reject() {
        s.reject();
    }

    public void cancel() {
        s.cancel();
    }

    /*
        g = 1 represents Regular gas
        g = 2 represents Super gas
        g = 3 represents Premium gas
        g = 4 represents Diesel gas
     */
    public void selectGas(int g, int M) {
        s.selectGas(g,M);
    }

    public void startPump() {
        s.startPump();
    }

    public void pump() {
        s.pump();
    }

    public void stopPump() {
        s.stopPump();
    }

    public void receipt() {
        s.receipt();
    }

    public void noReceipt() {
        s.noReceipt();
    }
    public void Continue()
    {
        s.Continue();
    }
    public void correctPin()      
    {
        s.correctPin();
    }
    public void incorrectPin()     
    {
        s.incorrectPin();
    }
    


}
