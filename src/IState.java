



// TODO: Auto-generated Javadoc
/**
 * The Interface IState.
 */
public interface IState {
	
	/**
	 * Insert money.
	 *
	 * @return the string
	 */
	public String insertMoney();
	
	/**
	 * Eject money.
	 *
	 * @return the string
	 */
	public String ejectMoney();
	
	/**
	 * Vend item.
	 *
	 * @param button the button
	 * @return the string
	 */
	public String vendItem(VendingMachineButton button);
	
}
