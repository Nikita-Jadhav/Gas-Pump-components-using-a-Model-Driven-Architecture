package MDA;

/*
    State S8 
 */
class S8 extends State {

    S8(MDAEFSM model) {
        super(model);
    }
    /*
        Transition to State S3 and call DisplayMenu()
     */
    @Override
    void correctPin() {
        if (model.s == model.LS[8]) {
            model.s = model.LS[3];
             System.out.println("Pin number entered correct....Card Approved");
            model.getOP().DisplayMenu();
            
        }
    }

    /*
        Transition to State S0 and call WrongPinMsg()
     */
    @Override
    void incorrectPin() {
        if (model.s == model.LS[8]) {
            model.s = model.LS[0];
            model.getOP().WrongPinMsg();
        }
    }
}
