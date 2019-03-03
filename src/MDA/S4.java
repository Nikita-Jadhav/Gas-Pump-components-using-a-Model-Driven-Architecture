package MDA;

/*
    State S4 
 */
class S4 extends State {

    S4(MDAEFSM model) {
        super(model);
    }

    /*
        Transition to State S5 and call SetInitialValues() and ReadyMsg() 
     */
    @Override
    void startPump() {
        if ((model.s == model.LS[4])) 
        {
            model.s = model.LS[5];
            model.getOP().SetInitialValues();
            model.getOP().ReadyMsg();
        }
    }
}
