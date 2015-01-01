import java.text.DecimalFormat;


// TODO: Auto-generated Javadoc
/**
 * The Class HasMoneyState.
 */
public class HasMoneyState extends BaseVendingMachineState implements IState {
	
	/** The messages. */
	public VendingMachineMessages messages = new VendingMachineMessages();
	
	/**
	 * Instantiates a new checks for money state.
	 *
	 * @param stateMachine the state machine
	 */
	HasMoneyState(VendingMachine stateMachine){
		
		super(stateMachine);
		
	}
	
	/* (non-Javadoc)
	 * @see IState#insertMoney()
	 */
	@Override
	public String insertMoney() {
	    this.vendingMachine.currentlyInsertedMoney += 1.00;
	    Double currentlyInsertedMoney = this.vendingMachine.currentlyInsertedMoney;
	    DecimalFormat df = new DecimalFormat("#.##");
		return messages.hasMoneyInsert + df.format(currentlyInsertedMoney);
	}

	/* (non-Javadoc)
	 * @see IState#ejectMoney()
	 */
	@Override
	public String ejectMoney() {
		this.vendingMachine.currentlyInsertedMoney = 0.00;
		this.vendingMachine.state = this.vendingMachine.noMoney;
		return messages.hasMoneyEject;
	}

	/* (non-Javadoc)
	 * @see IState#vendItem(VendingMachineButton)
	 */
	@Override
	public String vendItem(VendingMachineButton button) {
		if(!(this.vendingMachine.inventory.itemInStock(this.vendingMachine.buttons.getButtonItem(button)))){//Out of stock
			this.vendingMachine.currentlyInsertedMoney = 0.00;
			this.vendingMachine.state = this.vendingMachine.noMoney;
			return messages.hasMoneyNotInStock;
		}
		else if(this.vendingMachine.currentlyInsertedMoney >= //Successful vend
		   this.vendingMachine.inventory.checkItemPrice(this.vendingMachine.buttons.getButtonItem(button)))
		{
			this.vendingMachine.inventory.decrementStock(this.vendingMachine.buttons.getButtonItem(button));
			this.vendingMachine.claimInsertedMoney(this.vendingMachine.inventory.checkItemPrice(this.vendingMachine.buttons.getButtonItem(button)));
			this.vendingMachine.currentlyInsertedMoney = 0.00;
			this.vendingMachine.state = this.vendingMachine.noMoney;
			return messages.hasMoneyVendItem + this.vendingMachine.buttons.getButtonItem(button).toString();
		}
		else{//Insufficient funds
			this.vendingMachine.currentlyInsertedMoney = 0.00;
			this.vendingMachine.state = this.vendingMachine.noMoney;
			return messages.hasMoneyFailedVend;
		}
	}

}
