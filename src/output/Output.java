package output;


import abstractFactory.AbstractFactory;
import dataStore.DataStore;
import strategy.CancelMsg;
import strategy.DisplayMenu;
import strategy.GasPumpedMsg;
import strategy.PayMsg;
import strategy.PrintReceiptMsg;
import strategy.PumpGasUnit;
import strategy.ReadyMsg;
import strategy.RejectMsg;
import strategy.SetInitialValues;
import strategy.SetPrice;
import strategy.StopMsg;
import strategy.StoreCash;
import strategy.StoreData;
import strategy.ReturnCash;

public class Output {

	AbstractFactory factoryInstance = null;
	DataStore dataStore = null;
	
	
	public Output(AbstractFactory factoryInstance, DataStore dataStore) {
		
		//Constructor to initialize the output object
		this.factoryInstance = factoryInstance;
		this.dataStore = dataStore;
	}
	
	public void StoreData() {
		
		//stored data process
		System.out.println("\nGas Pump activated ");
		StoreData storedata = factoryInstance.getStoreData();
		storedata.StoreData(dataStore);
	}
	
	public void PayMsg() {
		
		//payment message
		PayMsg paymsg = factoryInstance.getPayMsg();
		paymsg.PayMsg();
	}

	public void StoreCash() {
		//store cash 
		StoreCash storecash = factoryInstance.getStoreCash();
		storecash.StoreCash(dataStore);
		
	}

	public void DisplayMenu() {
		//display the menu
		DisplayMenu displaymenu = factoryInstance.getDisplayMenu();
		displaymenu.DisplayMenu();
		
	}

	public void RejectMsg() {
		//rejection message 
		RejectMsg rejectmsg = factoryInstance.getRejectMsg();
		rejectmsg.RejectMsg();
	}

	public void CancelMsg() {
		
		//cancellation message
		CancelMsg cancelmsg = factoryInstance.getCancelMsg();
		cancelmsg.cancelmsg();
		
		
	}

	public void SetPrice() {
		//set the price
		SetPrice setprice = factoryInstance.getSetPrice();
		setprice.SetPrice(dataStore);
		
	}

	public void SetInitialValues() {
		
		//setting initial values
		SetInitialValues setinitialvalues = factoryInstance.getSetInitialValues();
		setinitialvalues.SetInitialValues(dataStore);
		
	}

	public void ReadyMsg() {
		//ready message
		ReadyMsg readymsg = factoryInstance.getReadyMsg();
		readymsg.ReadyMsg();
		
	}

	public void PumpGasUnit() {
		//pump gas 
		PumpGasUnit pumpgasunit = factoryInstance.getPumpGasUnit();
		pumpgasunit.PumpGasUnit();
		
	}

	public void GasPumpedMsg() {
		
		//pumped message 
		GasPumpedMsg gaspumpedmsg = factoryInstance.getGasPumpedMsg();
		gaspumpedmsg.GasPumpedMsg(dataStore);
		
	}

	public void StopMsg() {
		
		//message to stop operation
		StopMsg stopmsg = factoryInstance.getStopMsg();
		stopmsg.StopMsg();
		
	}

	public void PrintReceiptMsg() {
		
		//printing the receipt
		System.out.println("\nReceipt: ");
		PrintReceiptMsg printreceiptmsg = factoryInstance.getPrintReceiptMsg();
		printreceiptmsg.PrintReceiptMsg(dataStore);
		
	}

	
	public void ReturnCash(){
		
		//return cash 
		ReturnCash returncash = factoryInstance.getReturnCash();
		returncash.ReturnCash(dataStore);
		
	}

}
