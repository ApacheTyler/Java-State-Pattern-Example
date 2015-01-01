import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



// TODO: Auto-generated Javadoc
/**
 * The Class StockManager.
 */
public class StockManager {
		
	/** The Item stock map. */
	private Map<Item, Integer> ItemStockMap;// = new HashMap<VendingMachineButton, Item>();
	
	/** The default stock. */
	private final Integer defaultStock = 10;
	
	/**
	 * Instantiates a new stock manager.
	 */
	public StockManager(){
		
		ItemStockMap = new HashMap<Item, Integer>();
		
	}
	
	/**
	 * Decrement item stock.
	 *
	 * @param itemToDecrement the item to decrement
	 */
	public void decrementItemStock(Item itemToDecrement){
		
		Integer tmp = this.ItemStockMap.get(itemToDecrement);
		this.ItemStockMap.put(itemToDecrement, tmp - 1);
		
	}
	
	/**
	 * Gets the item stock map.
	 *
	 * @return the item stock map
	 */
	public Map<Item,Integer> getItemStockMap(){
		
		Map<Item, Integer> itemPriceMapToReturn = new HashMap<Item,Integer>();
		itemPriceMapToReturn = this.ItemStockMap;
		return itemPriceMapToReturn;
	}
	
	/**
	 * Gets the stock.
	 *
	 * @param itemToGetStockFor the item to get stock for
	 * @return the stock
	 */
	public int getStock(Item itemToGetStockFor){
		
		int stockOfItem = 0;
		stockOfItem = this.ItemStockMap.get(itemToGetStockFor);
		return stockOfItem;
		
	}
	
	/**
	 * Adds the item to stock map.
	 *
	 * @param newItem the new item
	 * @param stock the stock
	 */
	public void addItemToStockMap(Item newItem, Integer stock){
		
		this.ItemStockMap.put(newItem, stock);
		
	}
	
	/**
	 * Adds the item to stock map.
	 *
	 * @param newItem the new item
	 */
	public void addItemToStockMap(Item newItem){
		
		this.ItemStockMap.put(newItem, this.defaultStock);
		
	}
	
	/**
	 * Removes the item from stocke map.
	 *
	 * @param itemToRemove the item to remove
	 */
	public void removeItemFromStockeMap(Item itemToRemove){
		
		this.ItemStockMap.remove(itemToRemove);
		
	}
	
	/**
	 * Restock all items.
	 */
	public void restockAllItems(){
		
		Iterator<Item> allItems = this.ItemStockMap.keySet().iterator();
		while(allItems.hasNext()){
			this.ItemStockMap.put(allItems.next(), this.defaultStock);
		}
		
	}


	
}
