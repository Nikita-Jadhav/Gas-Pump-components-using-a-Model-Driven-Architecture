package MDA;

/*
    State S1
 */
class S1 extends State {

    S1(MDAEFSM model) {
        super(model);
    }
    /*
        creditcard:
            Transition to State S2
   
        cash:
            Transition to State S3
            Call StoreCash() and DisplayMenu()
        
        debit:
            Transition to State S8
            Call EnterPinMsg() and StorePin()
     */
    @Override
    void payType(int t) 
    {
        if ((t == 1) && (model.s == model.LS[1])) 
        {
            model.s = model.LS[2];
            model.M=1;
        } 
        else if ((t == 2) && (model.s == model.LS[1])) 
        {
            model.s = model.LS[3];
            model.getOP().StoreCash();
            model.getOP().DisplayMenu();
            model.M=0;
        }
        else if((t == 3) && (model.s == model.LS[1]))
        {
            model.s = model.LS[8];
            model.getOP().EnterPinMsg();
            model.getOP().StorePin();
            model.M=1;
        }
    }
}
