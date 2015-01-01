
// TODO: Auto-generated Javadoc
/**
 * The Class NoMoneyState.
 */
public class NoMoneyState extends BaseVendingMachineState implements IState {
	
	/** The messages. */
	public VendingMachineMessages messages = new VendingMachineMessages();
	
	/**
	 * Instantiates a new no money state.
	 *
	 * @param stateMachine the state machine
	 */
	NoMoneyState(VendingMachine stateMachine){
		
		super(stateMachine);
		
	}
	
	/* (non-Javadoc)
	 * @see IState#insertMoney()
	 */
	@Override
	public String insertMoney() {
		
		this.vendingMachine.currentlyInsertedMoney += 1.00;
		this.vendingMachine.state = this.vendingMachine.hasMoney;
		return messages.noMoneyInsert;
		
	}

	/* (non-Javadoc)
	 * @see IState#ejectMoney()
	 */
	@Override
	public String ejectMoney() {
		
		return messages.noMoneyEject;
		
	}

	/* (non-Javadoc)
	 * @see IState#vendItem(VendingMachineButton)
	 */
	@Override
	public String vendItem(VendingMachineButton button) {
		
		return messages.noMoneyVendItem + " " + 
			   this.vendingMachine.inventory.checkItemPrice(this.vendingMachine.buttons.getButtonItem(button));

	}

}
