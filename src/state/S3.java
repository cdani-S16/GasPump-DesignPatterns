package state;
import mainDriver.Driver;

public class S3 extends state {
	
	
	public S3(state s) {
		super(s);
	
	}
	
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
		
		if (Driver.gasPumpType == 1){
		outputobject.CancelMsg();
		MDAEFSM.mdaefsmState = (MDAEFSM.getS0State());
		}
		else if(Driver.gasPumpType == 2){
			outputobject.CancelMsg();
			outputobject.ReturnCash();
			MDAEFSM.mdaefsmState = (MDAEFSM.getS0State());
		}

	}

	@Override
	public void Approved() {
		

	}

	@Override
	public void SelectGas(int g) {
		
		outputobject.SetPrice();
		MDAEFSM.mdaefsmState = (MDAEFSM.getS4State());

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
		

	}

	@Override
	public void NoReceipt() {
		

	}

	@Override
	public void ReturnCash() {
		
		
	}

	


}
