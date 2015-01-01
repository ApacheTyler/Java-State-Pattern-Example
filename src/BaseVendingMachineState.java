
// TODO: Auto-generated Javadoc
/**
 * @author Tyler
 * 
 * The Class BaseVendingMachineState.
 */
public abstract class BaseVendingMachineState {
	
	/** The vending machine. */
	protected VendingMachine vendingMachine;
	
	/**
	 * Instantiates a new base vending machine state.
	 *
	 * @param superVendingMachine the super vending machine
	 */
	BaseVendingMachineState(VendingMachine superVendingMachine){
		this.vendingMachine = superVendingMachine;
	}
	
}
