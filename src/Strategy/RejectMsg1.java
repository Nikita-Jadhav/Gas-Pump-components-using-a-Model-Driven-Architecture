package Strategy;
/*
GasPump1:RejectMsg prints credit card rejection message
 */
public class RejectMsg1 extends RejectMsg 
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
