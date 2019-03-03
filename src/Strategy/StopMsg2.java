package Strategy;

/*
GasPump2:StopMsg displays a message stating that the pump2 is stopping
 */
public class StopMsg2 extends StopMsg {

    @Override
    public void stopMsg() {
        System.out.println("Stopping the Pump ...");
    }
}
