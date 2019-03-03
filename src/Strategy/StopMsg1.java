package Strategy;

/*
GasPump1:StopMsg displays a message stating that the pump1 is stopping.
 */
public class StopMsg1 extends StopMsg 
{
    @Override
    public void stopMsg()
    {
        System.out.println("Stopping the pump ...");
    }
}
