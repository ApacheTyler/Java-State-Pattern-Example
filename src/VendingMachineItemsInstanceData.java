import java.util.Iterator;



// TODO: Auto-generated Javadoc
/**
 * The Class VendingMachineItemsInstanceData.
 */
public class VendingMachineItemsInstanceData {
	
	/** The caramel mach. */
	public final Item caramelMach = new Item("Caramel Machiato");
	
	/** The caramel mach button. */
	public final VendingMachineButton caramelMachButton = new VendingMachineButton("Caramel Machiato Button");
	
	/** The caramel mach price. */
	public final double caramelMachPrice = 2.00;
	
	/** The iced coffee. */
	public final Item icedCoffee = new Item("Iced Coffee");
	
	/** The iced coffee button. */
	public final VendingMachineButton icedCoffeeButton = new VendingMachineButton("Iced Coffee Button");
	
	/** The iced coffee price. */
	public final double icedCoffeePrice = 2.00;
	
	/** The caramel frapp. */
	public final Item caramelFrapp = new Item("Caramel Frappacino");
	
	/** The caramel frapp button. */
	public final VendingMachineButton caramelFrappButton = new VendingMachineButton("Caramel Frappacino Button");
	
	/** The caramel frapp price. */
	public final double caramelFrappPrice = 4.00;
	
	/** The car apple spice. */
	public final Item carAppleSpice = new Item("Caramel Apple Spice");
	
	/** The car apple spice button. */
	public final VendingMachineButton carAppleSpiceButton = new VendingMachineButton("Caramel Apple Spice Button");
	
	/** The car apple spice price. */
	public final double carAppleSpicePrice = 3.00;
	
	/** The brewed coffee. */
	public final Item brewedCoffee = new Item("Brewed Coffee");
	
	/** The brewed coffee button. */
	public final VendingMachineButton brewedCoffeeButton = new VendingMachineButton("Brewed Coffee Button");
	
	/** The brewed coffee price. */
	public final double brewedCoffeePrice = 1.00;
	
	/** The coffee cake. */
	public final Item coffeeCake = new Item("Coffee Cake");
	
	/** The coffee cake button. */
	public final VendingMachineButton coffeeCakeButton = new VendingMachineButton("Coffee Cake Button");
	
	/** The coffee cake price. */
	public final double coffeeCakePrice = 2.00;
	
	/** The cake pop. */
	public final Item cakePop = new Item("Cake Pop");
	
	/** The cake pop button. */
	public final VendingMachineButton cakePopButton = new VendingMachineButton("Cake Pop Button");
	
	/** The cake pop price. */
	public final double cakePopPrice = 1.00;
	
	/** The water bottle. */
	public final Item waterBottle = new Item ("Water Bottle");
	
	/** The water bottle button. */
	public final VendingMachineButton waterBottleButton = new VendingMachineButton("Water Bottle Button");
	
	/** The water bottle price. */
	public final double waterBottlePrice = 2.00;
	
	/**
	 * Configure inventory instance.
	 *
	 * @return the inventory manager
	 */
	public InventoryManager configureInventoryInstance(){
		
		InventoryManager inventoryManagerToConfigure = new InventoryManager();
		
		inventoryManagerToConfigure.addItemToInventory(this.caramelMach, this.caramelMachPrice);
		inventoryManagerToConfigure.addItemToInventory(this.icedCoffee, this.icedCoffeePrice);
		inventoryManagerToConfigure.addItemToInventory(this.caramelFrapp, this.caramelFrappPrice);
		inventoryManagerToConfigure.addItemToInventory(this.carAppleSpice, this.carAppleSpicePrice);
		inventoryManagerToConfigure.addItemToInventory(this.brewedCoffee, this.brewedCoffeePrice);
		inventoryManagerToConfigure.addItemToInventory(this.coffeeCake, this.coffeeCakePrice);
		inventoryManagerToConfigure.addItemToInventory(this.cakePop, this.cakePopPrice);
		inventoryManagerToConfigure.addItemToInventory(this.waterBottle, this.waterBottlePrice);
		
		return inventoryManagerToConfigure;
		
	}
	
	/**
	 * Configure button map instace.
	 *
	 * @return the button to item map
	 */
	public ButtonToItemMap configureButtonMapInstace(){
		
		ButtonToItemMap buttonItemConfiguration = new ButtonToItemMap();
		
		buttonItemConfiguration.addButtonAndItemToButtonMap(this.caramelMachButton, this.caramelMach);
		buttonItemConfiguration.addButtonAndItemToButtonMap(this.icedCoffeeButton, this.icedCoffee);
		buttonItemConfiguration.addButtonAndItemToButtonMap(this.caramelFrappButton, this.caramelFrapp);
		buttonItemConfiguration.addButtonAndItemToButtonMap(this.carAppleSpiceButton, this.carAppleSpice);
		buttonItemConfiguration.addButtonAndItemToButtonMap(this.brewedCoffeeButton, this.brewedCoffee);
		buttonItemConfiguration.addButtonAndItemToButtonMap(this.coffeeCakeButton, this.coffeeCake);
		buttonItemConfiguration.addButtonAndItemToButtonMap(this.cakePopButton, this.cakePop);
		buttonItemConfiguration.addButtonAndItemToButtonMap(this.waterBottleButton, this.waterBottle);
		
		return buttonItemConfiguration;
		
	}
	
	/**
	 * Configured inventory to string.
	 *
	 * @param imToString the im to string
	 * @return the string
	 */
	public String configuredInventoryToString(InventoryManager imToString){
		
		String toReturn = "Item\t Stock\t Price\t \n";
		Iterator<Item> StockIt = imToString.stock.getItemStockMap().keySet().iterator();
		Iterator<Item> PriceIt = imToString.price.getItemPriceMap().keySet().iterator();
		
		Item tmp;
		
		while(StockIt.hasNext()){
			
			tmp = StockIt.next();
			toReturn += tmp.getItemName() + "\t" + imToString.stock.getStock(tmp) + "\t" +
					   imToString.price.getPrice(tmp) + "\t\n";
			
		}
		
		System.out.println(toReturn);
		
		return toReturn;
	}
	
	/**
	 * Configured button to string.
	 *
	 * @param bTIMToString the b tim to string
	 * @return the string
	 */
	public String configuredButtonToString(ButtonToItemMap bTIMToString){
		
		String toReturn = "";
		Iterator<VendingMachineButton> StockIt = bTIMToString.getButtonToItemMap().keySet().iterator();
		
		VendingMachineButton tmp;
		
		while(StockIt.hasNext()){
			
			tmp = StockIt.next();
			toReturn += tmp.toString() + " -- " + bTIMToString.getButtonToItemMap().get(tmp).toString() + "\n";
			
		}
		
		System.out.println(toReturn);
		
		return toReturn;
	}


}
