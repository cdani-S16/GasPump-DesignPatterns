package mainDriver;
import java.util.Scanner;

import abstractFactory.ConcreteFactory1;
import abstractFactory.ConcreteFactory2;
import gaspump.GasPump1;
import gaspump.GasPump2;
import output.Output;
import state.MDAEFSM;
import state.state;

/*
 * @author Chris Mathew Dani
 * A20372828
 * 
 */
public class Driver {

	public static int gasPumpType = 0;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("*************Gas pump menu: (Enter the number)**************");
		System.out.println("1. Gas Pump 1");
		System.out.println("2. Gas Pump 2");
		
		Scanner inpScan = new Scanner(System.in);
		int menuItem = inpScan.nextInt();
		if (menuItem == 1){
			
			gasPumpType= 1;	
			ConcreteFactory1 factory = new ConcreteFactory1();
			MDAEFSM mdaefsmObj = new MDAEFSM();
			state.outputobject = new Output(factory, factory.GetDataStore());
			
			GasPump1 gasPump1 = new GasPump1(mdaefsmObj, factory.GetDataStore());
			
			System.out.println("Gas pump 1 functionality:");
			
			while(true){
				
				System.out.println(" ************ Select the Operation #: ***************");
				System.out.println("Operations for Gas Pump 1");
				System.out.println("1 . Activate(float,float)");
				System.out.println("2 . Start() ");
				System.out.println("3 . PayCredit()");
				System.out.println("4 . Reject() ");
				System.out.println("5 . Cancel()");
				System.out.println("6 . Approved()");
				System.out.println("7 . Super()");
				System.out.println("8 . Regular()");
				System.out.println("9 . StartPump()");
				System.out.println("10. PumpGallon()");
				System.out.println("11. StopPump()");
				System.out.println(" Input: ");
				int menuItem1 = inpScan.nextInt();
		
			if (menuItem1 == 12)
				break;
					
			if (menuItem1 == 1){  
		
				//ACTIVATE
				System.out.println("\n  Operation:  Activate(float a,float b)");
				System.out.println("   Enter the Unit Price for the Super Gas");
				float superprice  =  inpScan.nextFloat();
				System.out.println("   Enter the Unit  Price for the Regular Gas");
				float regularprice = inpScan.nextFloat();
				gasPump1.Activate(superprice,regularprice);
			
			}
			else if (menuItem1 == 2){
				
				System.out.println("  Operation:  Start()");
				gasPump1.Start();
			}
			else if (menuItem1 == 3){
				
				//PayCredit
				System.out.println("  Operation:  PayCredit()");
				gasPump1.PayCredit();
			}
			else if (menuItem1 == 4)
			{
				//Reject;
				System.out.println("Operations  Reject()");
				gasPump1.Reject();
				
			}
			else if (menuItem1 ==5){
				//cancel
				System.out.println("Operations  Cancel()");
				gasPump1.Cancel();
				
			}
			else if (menuItem1 == 6){
				//approve
				System.out.println("Operations Approved()");
				gasPump1.Approved();
			}
			else if (menuItem1 == 7){
				//select regular gas
				System.out.println("  Operation:  Regular()");
				gasPump1.Regular();
			}
			else if (menuItem1 == 8){
				//selected super gas
				System.out.println("  Operation:  Super()");
				gasPump1.Super();
			}
			else if (menuItem1 == 9){
				//start pump
				System.out.println("  Operation:  StartPump()");
				gasPump1.StartPump();
			}
			else if (menuItem1 == 10){
				//pump gas 
				System.out.println("  Operation:  Pump()");
				gasPump1.Pump();
			}
			else if (menuItem1 == 11){
				//stop the pump
				System.out.println("  Operation:  StopPump()");
				gasPump1.StopPump();
			}
		}
		}
		else if (menuItem ==2)
		{
			gasPumpType= 2;	
			ConcreteFactory2 factory = new ConcreteFactory2();
			MDAEFSM mdaefsmObj = new MDAEFSM();
			state.outputobject = new Output(factory, factory.GetDataStore());
			
			GasPump2 gasPump2 = new GasPump2(mdaefsmObj, factory.GetDataStore());
			
			System.out.println("Gas pump 2");
			System.out.println("Operations for Gas Pump 2");

			while(true){
				System.out.println("  Select Operation: ");
				System.out.println("1 . Activate(int, int ,int)");
				System.out.println("2 . Start() ");
				System.out.println("3 . PayCash(int)");
				System.out.println("4 . Cancel()");
				System.out.println("5 . Premium()");
				System.out.println("6 . Regular()");
				System.out.println("7 . Super()  ");
				System.out.println("8 . StartPump()");
				System.out.println("9 . PumpLiter()");
				System.out.println("10. Stop()");
				System.out.println("11. Receipt()");
				System.out.println("12. NoReceipt()");

				int menuItem1 = inpScan.nextInt();

					
			if (menuItem1 == 1){  
		
				//ACTIVATE
				System.out.println("\n  Operation:  Activate(int a,int b,int c)");
				System.out.println("   Enter the Unit  Price for Premium Gas");
				int premiumprice  =  inpScan.nextInt();
				System.out.println("   Enter the Unit  Price for Super Gas");
				int superprice  =  inpScan.nextInt();
				System.out.println("   Enter the Unit  Price for Regular Gas");
				int regularprice = inpScan.nextInt();
				gasPump2.Activate(premiumprice,superprice,regularprice);

			}
			else if (menuItem1 == 2){
				
				System.out.println("  Operation:  Start()");
				gasPump2.Start();
			}
			
			else if (menuItem1 == 3){
				
				//PayCash
				System.out.println("  Operation:  PayCash()");
				System.out.println("Enter the amount of cash :");
				int cash = inpScan.nextInt();
				gasPump2.PayCash(cash);
			}
						
			else if (menuItem1 ==4){
				System.out.println("Operations  Cancel()");
				gasPump2.Cancel();
				//cancel
			}
			else if (menuItem1 == 5){
				//select regular gas
				System.out.println("  Operation:  Premium()");
				gasPump2.Premium();
			}
			
			else if (menuItem1 == 6){
				//select regular gas
				System.out.println("  Operation:  Regular()");
				gasPump2.Regular();
			}
			else if (menuItem1 == 7){
				//selected super gas
				System.out.println("  Operation:  Super()");
				gasPump2.Super();
			}
			else if (menuItem1 == 8){
				//start pump
				System.out.println("  Operation:  StartPump()");
				gasPump2.StartPump();
			}
			else if (menuItem1 == 9){
				//to pump gas
				System.out.println("  Operation:  Pump()");
				gasPump2.Pump();
			}
			else if (menuItem1 == 10){
				
				//stop pumping 
				System.out.println("  Operation:  StopPump()");
				gasPump2.StopPump();
			}
			else if (menuItem1 == 11){
				
				//generate and print receipt
				System.out.println("  Operation:  Receipt()");
				gasPump2.Receipt();;
			}
			else if (menuItem1 == 12){
				
				//don't take receipt
				System.out.println("  Operation:  NoReceipt()");
				gasPump2.NoReceipt();
			}
			
		}
		}
		else{
			
			//retry choosing gas pump
			System.out.println("Invalid option, try again ");
		}
		
		inpScan.close();
	}
		
	}
	

