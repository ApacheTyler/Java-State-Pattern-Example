

// TODO: Auto-generated Javadoc
/**
 * The Class VendingMachine.
 */
public class VendingMachine {
	
	/** The inventory. */
	protected InventoryManager inventory;
	
	/** The buttons. */
	protected ButtonToItemMap buttons;
	
	/** The no money. */
	protected IState noMoney;
	
	/** The has money. */
	protected IState hasMoney;
	
	/** The state. */
	protected IState state;
	
	/** The currently inserted money. */
	protected Double currentlyInsertedMoney = 0.00;
	
	/** The money stored in vending machine. */
	protected Double moneyStoredInVendingMachine = 0.00;
	
	/** The instance data. */
	protected VendingMachineItemsInstanceData instanceData = new VendingMachineItemsInstanceData();
	
	/**
	 * Instantiates a new vending machine.
	 */
	VendingMachine(){
		
		this.inventory = instanceData.configureInventoryInstance();
		this.buttons = instanceData.configureButtonMapInstace();
		this.noMoney = new NoMoneyState(this);
		this.hasMoney = new HasMoneyState(this);
		this.state = this.noMoney;
		
	}
	
	/**
	 * Claim inserted money.
	 *
	 * @param itemPrice the item price
	 */
	public void claimInsertedMoney(Double itemPrice){
		
		this.moneyStoredInVendingMachine += (this.currentlyInsertedMoney - this.currentlyInsertedMoney) + itemPrice;
		
	}
	
	/**
	 * Collect inserted money.
	 */
	public void collectInsertedMoney(){
		
		this.moneyStoredInVendingMachine = 0.0;
		
	}
	
	/**
	 * Insert.
	 *
	 * @return the string
	 */
	public String insert(){
		
		return this.state.insertMoney();
		
	}
	
	/**
	 * Eject.
	 *
	 * @return the string
	 */
	public String eject(){
		
		return this.state.ejectMoney();
		
	}
	
	/**
	 * Vend item.
	 *
	 * @param button the button
	 * @return the string
	 */
	public String vendItem(VendingMachineButton button){
		
		return this.state.vendItem(button);
		
	}
}
