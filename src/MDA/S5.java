package MDA;

/*
    State S5 
 */
class S5 extends State {

    S5(MDAEFSM model) {
        super(model);
    }

    /*
      call PumpGasUnit() and GasPumpedMsg()
     */
    @Override
    void pump() {
        if (model.s == model.LS[5]) {
            // stay in the same state
            model.getOP().PumpGasUnit();
            model.getOP().GasPumpedMsg();
        }
    }

    /*
        Transition to State S6 and call StopMsg()
     */
    @Override
    void stopPump() {
        if (model.s == model.LS[5]) {
            model.s = model.LS[6];
            model.getOP().StopMsg();
            model.getOP().PrintReceipt();
        }
    }
    
}
