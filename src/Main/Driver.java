package Main;

import AbstractFactory.*;
import GasPump.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Select the GasPump:");
        System.out.println("1.GasPump1");
        System.out.println("2.GasPump2");

        int pump_type;
        String input = "initial";
        String x = null;
        String p = null;
        try {
            pump_type = Integer.parseInt(scan.readLine());
            switch (pump_type) {
                case 1: {
                    ConcreteFactory1 cf1 = new ConcreteFactory1();
                    GasPump1 gp1 = new GasPump1(cf1);
                    System.out.println(
                            "GasPump-1 " +
                                    "\n Operations to Perform: " + "\n 0. Activate(float a, float b) " + "\n 1. Start " + "\n 2. PayDebit " + "\n 3. For Debit(Pin) " +"\n 4. ApproveDebit" + "\n c. PayCredit " +"\n a. ApproveCredit " +"\n r. Reject "
                                    + "\n 5. Regular " + "\n 6. Diesel " + "\n 7. Cancel " + "\n 8. StartPump " +
                                    "\n 9. PumpGallon " +"\n 10. FullTank " + "\n s. StopPump" + "\n e. Exit"
                    );
                    
                    while (!input.equals("e")) {
                        gp1.printOperations();
                        input = scan.readLine();
                        switch (input) {
                            case "0": 
                            {   // Activate function
                                System.out.println("GasPump has been activated");
                                float a, b;
                                System.out.println("Enter the price for the Regular Gas: ");
                                try 
                                {
                                    a = Float.parseFloat(scan.readLine());
                                    System.out.println("Enter the price for the Diesel Gas: ");
                                    b = Float.parseFloat(scan.readLine());
                                    gp1.Activate(a, b);
                                } 
                                catch (NumberFormatException e) 
                                {
                                    System.out.println("Please enter a valid number --> float");
                                }
                                break;
                            }
                            case "1": { // Start function
                                System.out.println(" GasPump has been started");
                                gp1.Start();
                                break;
                            }
                            case "2": { // PayDebit function
                                System.out.println("PayDebit for any purchase");
                                break;
                            }
                            case "3": { // Pin function
                                System.out.println("Enter the pin: ");
                                Scanner in = new Scanner(System.in);
                                x = in.nextLine();
                                gp1.Pin(x);
                                gp1.PayDebit();
                                break;
                            }
                            case "4": { // Approve function
                                System.out.println("Please enter the pin: ");
                                Scanner in = new Scanner(System.in);
                                p = in.nextLine();
                                gp1.approve(p);
                                break;
                            }
                            case "r": { // Reject function
                                System.out.println("PayType has been rejected");
                                gp1.Reject();
                                break;
                            }
                            case "5": { // Regular gas selected
                                System.out.println("Regular gas has been selected");
                                gp1.Regular();
                                break;
                            }
                            case "6": { // Diesel gas selected
                                System.out.println("Diesel gas has been selected");
                                gp1.Diesel();
                                break;
                            }
                            case "7": { // Cancel function
                                System.out.println("Process Cancelled");
                                gp1.Cancel();
                                break;
                            }
                            case "8": { // StartPump function
                                System.out.println("GasPump has started to dispense the gas");
                                gp1.StartPump();
                                break;
                            }
                            case "9": { // PumpGallon function
                                System.out.println("Gas Dispensed");
                                gp1.PumpGallon();
                                break;
                            }
                            case "c":{ //PayCredit function
                                System.out.println("PayCredit for any purchase");
                                gp1.PayCredit();
                                break;
                            }
                            case "a":{ //Approve credit card function
                                gp1.approvec();
                                break;
                            }
                            case "10": { // FullTank
                                System.out.println("Tank Full");
                                gp1.FullTank();
                                break;
                            }
                            case "s": { // StopPump
                                System.out.println("GasPump has been stopped");
                                gp1.StopPump();
                                break;
                            }
                            case "e": { // Exit
                                break;
                            }
                            default: { // selected operation other than the ones mentioned in menu
                                System.out.println("Make a valid selection '" + input + "'");
                                break;
                            }
                        }
                    } // end of while
                    System.out.println("Exiting from GasPump1");
                    break;
                } // end of GasPump1
                case 2: {
                    ConcreteFactory2 cf2 = new ConcreteFactory2();
                    GasPump2 gp2 = new GasPump2(cf2);
                    System.out.println(
                            "GasPump-2 " +
                                    "\n Operations to Perform: " + "\n 0. Activate (int a, int b, int c)" + "\n 1. PayCash" + "\n 2. PayCredit" +
                                    "\n a. Approve " + "\n r. Reject " + "\n 3. Regular " + "\n 4. Super " + "\n 5. Premium " + "\n 6. Cancel" + "\n 7. StartPump" +
                                    "\n 8. PumpLiter" + "\n 9. Stop " + "\n p. PrintReceipt" + "\n n. NoReceipt" + "\n e. Exit");
                    
                    while (!input.equals("e")) {
                        gp2.printOperations();
                        input = scan.readLine();
                        switch (input) {
                            case "0": { // Activate function
                                System.out.println("GasPump has been activated");
                                int a, b, c;
                                System.out.println("Enter the price for the Regular Gas ");
                                try {
                                    a = Integer.parseInt(scan.readLine());
                                    System.out.println("Enter the price for the Premium Gas ");
                                    b = Integer.parseInt(scan.readLine());
                                    System.out.println("Enter the price for the Super Gas ");
                                    c = Integer.parseInt(scan.readLine());
                                    gp2.Activate(a, b, c);
                                } catch (NumberFormatException e) {
                                    System.out.println("Please enter a valid number --> int");
                                }
                                break;
                            }
                            case "1": { // PayCash function
                               gp2.Start();
                                System.out.println("Insert cash amount");
                                try {
                                    float cash = Float.parseFloat(scan.readLine());
                                    gp2.PayCash(cash);
                                } catch (NumberFormatException e) {
                                    System.out.println("Please enter a valid number --> float");
                                }
                                break;
                            }
                            case "2":{ // PayCredit function
                                gp2.Start();
                                System.out.println("PayCredit for any purchase");
                                gp2.PayCredit();
                                break;
                            }
                            case "a":{ // Approve the credit card function
                                gp2.approvec();
                                break;
                            }
                            case "r": { // Reject function
                                System.out.println("PayType has been rejected");
                                gp2.Reject();
                                break;
                            }
                            case "3": { // Regular gas selected
                                System.out.println("Regular gas has been selected");
                                gp2.Regular();
                                break;
                            }
                            case "4": { // Super gas selected
                                System.out.println("Super gas has been selected");
                                gp2.Super();
                                break;
                            }
                            case "5": { // Premium gas selected
                                System.out.println("Premium gas has been selected");
                                gp2.Premium();
                                break;
                            }
                            case "6": { // Cancel function
                                System.out.println("Process has been cancelled");
                                gp2.Cancel();
                                break;
                            }
                            case "7": { // Start function
                                System.out.println("GasPump has been started");
                                gp2.StartPump();
                                break;
                            }
                            case "8": { // PumpLiter function
                                System.out.println("Gas has been dispensed");
                                gp2.PumpLiter();
                                break;
                            }
                            case "9": { // Stop function
                                System.out.println("GasPump has been stopped");
                                gp2.Stop();
                                break;
                            }
                            case "p": { // PrintReceipt
                                System.out.println("Printing the Receipt");
                                gp2.Receipt();
                                break;
                            }
                            case "n": { // NoReceipt
                                System.out.println("No Receipt has been selected");
                                gp2.NoReceipt();
                                break;
                            }
                            case "e": { // Exit
                                break;
                            }
                            default: { //selected operation other than the ones mentioned in menu
                            	System.out.println("Make a valid selection '" + input + "'");
                                break;
                            }
                        }
                    } // end of while
                    System.out.println("Exiting from GasPump2");
                    break;
                } // end of GasPump2
                default: {
                    System.out.println("Select a valid GasPump");
                    System.exit(1);
                }

            }
        } catch (IOException ioe) {
            System.out.println("Terminating Application");
            System.exit(1);
        }
    }
}