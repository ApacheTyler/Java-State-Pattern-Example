import java.util.HashMap;
import java.util.Map;


// TODO: Auto-generated Javadoc
/**
 * The Class ButtonToItemMap.
 */
public class ButtonToItemMap {
	
	/** The button map. */
	private Map<VendingMachineButton, Item> buttonMap;// = new HashMap<VendingMachineButton, Item>();
	
	/**
	 * Instantiates a new button to item map.
	 */
	public ButtonToItemMap(){
		
		buttonMap = new HashMap<VendingMachineButton, Item>();

	}

	/**
	 * Gets the button to item map.
	 *
	 * @return the button to item map
	 */
	public Map<VendingMachineButton, Item> getButtonToItemMap() {
		
		return this.buttonMap;
		
	}
	
	/**
	 * Adds an item to the button map.
	 *
	 * @param buttonKey the button key
	 * @param newItemValue the new item value
	 */
	public void addButtonAndItemToButtonMap(VendingMachineButton buttonKey, Item newItemValue){
				
		this.buttonMap.put(buttonKey, newItemValue);
		
	}
	
	/**
	 * Removes an item from the button map.
	 *
	 * @param buttonKeyToRemove the button key to remove
	 */
	public void removeButtonAndItem(VendingMachineButton buttonKeyToRemove){
		
		this.buttonMap.remove(buttonKeyToRemove);
		
	}
	
	/**
	 * Gets the item for a particular item.
	 *
	 * @param buttonKey the button key
	 * @return the button item
	 */
	public Item getButtonItem(VendingMachineButton buttonKey){
		
		Item itemToReturn = this.buttonMap.get(buttonKey);
		return itemToReturn;
		
	}
	

}
