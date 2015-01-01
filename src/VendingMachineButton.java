
// TODO: Auto-generated Javadoc
/**
 * The Class VendingMachineButton.
 */
public class VendingMachineButton {
	
	/** The button name. */
	private String buttonName;
	
	/**
	 * Instantiates a new vending machine button.
	 *
	 * @param nme the nme
	 */
	public VendingMachineButton(String nme){
		
		this.buttonName = nme;
		
	}
	
	/**
	 * Gets the button name.
	 *
	 * @return the button name
	 */
	public String getButtonName(){
		
		return this.buttonName;
		
	}
	
	/**
	 * Make button.
	 *
	 * @param nme the nme
	 * @return the vending machine button
	 */
	public VendingMachineButton makeButton(String nme){
		
		VendingMachineButton newButton;
		newButton = new VendingMachineButton(nme);
		return newButton;
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		
		return this.buttonName;
		
	}
	
	
	
}
