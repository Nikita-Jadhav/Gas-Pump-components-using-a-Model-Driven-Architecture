package MDA;

/*
    State S3
 */
class S3 extends State {

    S3(MDAEFSM model) {
        super(model);
    }

    /*
        Stay in state S3 and call SetPrice(g,M)
     */
    @Override
    void selectGas(int g,int M) {
        if (model.s == model.LS[3]) {
            model.getOP().SetPrice(g,M);
        }
    }

    /*
        Transition to State S0 and call CancelMsg() and ReturnCash()
     */
    @Override
    void cancel() {
        if (model.s == model.LS[3]) {
            model.s = model.LS[0];
            model.getOP().CancelMsg();
            model.getOP().ReturnCash();
        }
    }
    
    /*
        Transition to State S4
     */
    @Override
    void Continue() 
    {
        if (model.s == model.LS[3]) 
        {
            model.s = model.LS[4];
        }
    }
    
}
