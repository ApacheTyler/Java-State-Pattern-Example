
// TODO: Auto-generated Javadoc
/**
 * The Class Item.
 */
public class Item {
		
	/** The name. */
	private String name;
	
	/**
	 * Instantiates a new item.
	 *
	 * @param nme the nme
	 */
	Item(String nme){
		
		this.name = nme;
		
	}
	
	/**
	 * Gets the item name.
	 *
	 * @return the item name
	 */
	public String getItemName(){
		
		String nameCopy = this.name;
		return nameCopy;
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		
		return this.name;
		
	}

}
