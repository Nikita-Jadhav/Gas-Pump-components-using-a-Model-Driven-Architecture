package Strategy;
/*
GasPump1:CancelMsg prints cancellation messsage
 */
public class CancelMsg1 extends CancelMsg 
{
    @Override
    public void cancelMsg()
    {
        System.out.println("Cancelling transaction ... ");
    }
}
