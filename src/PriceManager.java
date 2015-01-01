import java.util.HashMap;
import java.util.Map;



// TODO: Auto-generated Javadoc
/**
 * The Class PriceManager.
 */
public class PriceManager {
	
	/** The Item price map. */
	private Map<Item, Double> ItemPriceMap;// = new HashMap<VendingMachineButton, Item>();
	
	/**
	 * Instantiates a new price manager.
	 */
	public PriceManager(){
		
		ItemPriceMap = new HashMap<Item, Double>();
		
	}
	
	/**
	 * Gets the item price map.
	 *
	 * @return the item price map
	 */
	public Map<Item,Double> getItemPriceMap(){
		
		Map<Item, Double> itemPriceMapToReturn = new HashMap<Item,Double>();
		itemPriceMapToReturn = this.ItemPriceMap;
		return itemPriceMapToReturn;
	}
	
	/**
	 * Gets the price.
	 *
	 * @param itemToGetPriceFor the item to get price for
	 * @return the price
	 */
	public double getPrice(Item itemToGetPriceFor){
		
		double priceOfItem = 0.0;
		priceOfItem = this.ItemPriceMap.get(itemToGetPriceFor);
		return priceOfItem;
		
	}
	
	/**
	 * Sets the price.
	 *
	 * @param itemToSetPriceFor the item to set price for
	 * @param newPrice the new price
	 */
	public void setPrice(Item itemToSetPriceFor, Double newPrice){
		
		this.ItemPriceMap.put(itemToSetPriceFor, newPrice);
		
	}
	
	/**
	 * Adds the item to price map.
	 *
	 * @param newItem the new item
	 * @param price the price
	 */
	public void addItemToPriceMap(Item newItem, Double price){
		
		this.ItemPriceMap.put(newItem, price);
		
	}
	
	/**
	 * Removes the item from price map.
	 *
	 * @param itemToRemove the item to remove
	 */
	public void removeItemFromPriceMap(Item itemToRemove){
		
		this.ItemPriceMap.remove(itemToRemove);
		
	}


}
