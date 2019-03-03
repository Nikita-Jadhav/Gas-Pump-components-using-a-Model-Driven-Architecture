package MDA;

/*
    State S6 
 */
class S6 extends State {

    S6(MDAEFSM model) {
        super(model);
    }

    /*
        Transition to State S0 and call PrintReceipt() and ReturnCash()
     */
    @Override
    void receipt() {
        if (model.s == model.LS[6]) {
            model.s = model.LS[0];
            model.getOP().PrintReceipt();
            model.getOP().ReturnCash();
        }
    }

    /*
        Transition to State S0 and call ReturnCash()
     */
    @Override
    void noReceipt() {
        if (model.s == model.LS[6]) {
            model.s = model.LS[0];
            model.getOP().ReturnCash();
        }
    }
}
