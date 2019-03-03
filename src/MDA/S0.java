package MDA;

/*
    State S0
 */
class S0 extends State {

    S0(MDAEFSM model) {
        super(model);
    }

    /*
        Transit to State S1 and call the PayMsg()
     */
    @Override
    void start() {
        if (model.s == model.LS[0]) {
            model.s = model.LS[1];
            model.getOP().PayMsg();
            model.getOP().InitializeData();
            model.M=1;
        }
    }
}
