package state;

import mainDriver.Driver;

public class S6 extends state {

	public S6(state s) {
		super(s);
	}
	
	MDAEFSM state = null;

	
	@Override
	public void Activate() {
		

	}

	@Override
	public void Start() {
		

	}

	@Override
	public void PayCredit() {
		

	}

	@Override
	public void PayCash() {
		

	}

	@Override
	public void Reject() {
		

	}

	@Override
	public void Cancel() {
		

	}

	@Override
	public void Approved() {
		

	}

	@Override
	public void SelectGas(int g) {
		

	}

	@Override
	public void StartPump() {
		

	}

	@Override
	public void Pump() {
		

	}

	@Override
	public void StopPump() {
		
	}
	
	

	@Override
	public void Receipt() {

		if(Driver.gasPumpType == 1){
			outputobject.PrintReceiptMsg();
		}
		else if (Driver.gasPumpType ==2){
			outputobject.PrintReceiptMsg();
			outputobject.ReturnCash();
		}
		MDAEFSM.mdaefsmState = (state.getS0State());
	}

	@Override
	public void NoReceipt() {
		
		outputobject.ReturnCash();
		MDAEFSM.mdaefsmState = (state.getS0State());

	}

	@Override
	public void ReturnCash() {
		
		
	}

}
