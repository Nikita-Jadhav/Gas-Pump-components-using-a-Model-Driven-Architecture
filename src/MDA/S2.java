package MDA;

/*
    State S2
 */
class S2 extends State {

    S2(MDAEFSM model) {
        super(model);
    }

    /*
        Transition to State S3 and call DisplayMenu()
     */

    @Override
    void approvec() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[3];
            System.out.println("Paytype Approved");
            model.getOP().DisplayMenu();
            
        }
    }
    /*
        Transition to State S2 and call RejectMsg()
     */
    @Override
    void reject() {
        if (model.s == model.LS[2]) {
            model.s = model.LS[0];
            model.getOP().RejectMsg();
        }
    }
}
