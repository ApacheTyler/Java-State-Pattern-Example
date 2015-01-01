

// TODO: Auto-generated Javadoc
/**
 * The Class InventoryManager.
 */
public class InventoryManager {
	
	/** The stock. */
	StockManager stock;
	
	/** The price. */
	PriceManager price;
	
	/**
	 * Instantiates a new inventory manager.
	 */
	InventoryManager(){
		
		this.stock = new StockManager();
		this.price = new PriceManager();
		
	}
	
	/**
	 * Adds the item to inventory.
	 *
	 * @param itemToAdd the item to add
	 * @param price the price
	 */
	public void addItemToInventory(Item itemToAdd, Double price){
		this.stock.addItemToStockMap(itemToAdd);
		this.price.addItemToPriceMap(itemToAdd, price);
	}
	
	/**
	 * Removes the item from inventory.
	 *
	 * @param itemToRemove the item to remove
	 */
	public void removeItemFromInventory(Item itemToRemove){
		this.price.removeItemFromPriceMap(itemToRemove);
		this.stock.removeItemFromStockeMap(itemToRemove);
	}
	
	/**
	 * Gets the item stock.
	 *
	 * @param itemToGetStockFor the item to get stock for
	 * @return the item stock
	 */
	public int getItemStock(Item itemToGetStockFor){
		
		return this.stock.getStock(itemToGetStockFor);
		
	}
	
	/**
	 * Item in stock.
	 *
	 * @param itemToGetStockFor the item to get stock for
	 * @return true, if successful
	 */
	public boolean itemInStock(Item itemToGetStockFor){
		
		if(this.stock.getStock(itemToGetStockFor) > 0){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	/**
	 * Check item price.
	 *
	 * @param itemToGetPriceFor the item to get price for
	 * @return the double
	 */
	public double checkItemPrice(Item itemToGetPriceFor){
		
		double priceFound = 0.0;
		priceFound = this.price.getPrice(itemToGetPriceFor);
		return priceFound;
	
	}
	
	/**
	 * Restock all items.
	 */
	public void restockAllItems(){
		
		this.stock.restockAllItems();
		
	}
	
	/**
	 * Stock specific item.
	 *
	 * @param itemToStock the item to stock
	 */
	public void stockSpecificItem(Item itemToStock){
		
		this.stock.addItemToStockMap(itemToStock);
		
	}
	
	/**
	 * Change item price.
	 *
	 * @param itemToChangePriceOf the item to change price of
	 * @param newPrice the new price
	 */
	public void changeItemPrice(Item itemToChangePriceOf, Double newPrice){
		
		this.price.addItemToPriceMap(itemToChangePriceOf, newPrice);
		
	}
	
	/**
	 * Decrement stock.
	 *
	 * @param itemToVend the item to vend
	 */
	public void decrementStock(Item itemToVend){
		
		this.stock.decrementItemStock(itemToVend);
		
	}
	
	
	
}
