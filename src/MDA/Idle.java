package MDA;
/*
    Idle State
 */
class Idle extends State {

    Idle(MDAEFSM model) {
        super(model);
    }

    /*
        Transit to State S0 and call the StorePrices()
     */
    @Override
    void activate() {
        if (model.s == model.LS[9]) {
            model.s = model.LS[0];
            model.getOP().StorePrices();
        }
    }
}
