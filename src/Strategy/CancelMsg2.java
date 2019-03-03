package Strategy;

/*
GasPump2:CancelMsg prints cancellation message
 */
public class CancelMsg2 extends CancelMsg 
{
    @Override
    public void cancelMsg() 
    {
        System.out.println("Cancelling transaction ... ");
    }
}
