package MDA;

/*
    State superclass in the De-centralized State Design Pattern

    most state-subclasses would only ACTUALLY implement only 1 or 2 of the methods.
    The rest would have empty bodies and that is a waste of both coding space and memory space.

 */

public abstract class State {
    MDAEFSM model;
    public int M;

    public State(MDAEFSM model) {
        this.model = model;
    }

    void activate()         {notAllowed();}
    void start()            {notAllowed();}

    /*
        credit: t=1
        cash:   t=2
        debit:  t=3
     */
    void payType(int t)     {notAllowed();}
    void approve()          {notAllowed();}
    void approvec()          {notAllowed();}
    void reject()           {notAllowed();}
    /*
        Regular:    g=1
        Super:      g=2
        Premium:    g=3
        Diesel      g=4
     */
    void selectGas(int g, int M)   {notAllowed();}
    void cancel()           {notAllowed();}
    void startPump()        {notAllowed();}
    void pump()             {notAllowed();}
    void stopPump()         {notAllowed();}
    void receipt()          {notAllowed();}
    void noReceipt()        {notAllowed();}
    void correctPin()       {notAllowed();}
    void incorrectPin()     {notAllowed();}
    void Continue() {notAllowed();}

    /*
        Print a "not allowed" message
     */
    private void notAllowed() {
        System.out.println("OPERATION NOT ALLOWED IN THIS STATE");
    }
}
