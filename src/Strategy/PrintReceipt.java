package Strategy;
import DataRepository.DataStore;

 // Abstract for PrintReceipt
   
public abstract class PrintReceipt
{
    DataStore data;
    public PrintReceipt(DataStore data)
    {
        this.data = data;
    }
    public abstract void printReceipt();
}
