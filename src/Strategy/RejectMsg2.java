package Strategy;
/*
GasPump2:RejectMsg prints credit card rejection message
 */
public class RejectMsg2 extends RejectMsg 
{
    /*
        display credit card rejected message
    */
    @Override
    public void rejectMsg() 
    {
        System.out.println("CREDIT CARD REJECTED");
        System.out.println("Cancelling transaction ...");
    }
}
