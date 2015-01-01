
// TODO: Auto-generated Javadoc
/**
 * The Class TestCases.
 */
public class TestCases {
	
	/** The test vending machine. */
	VendingMachine testVendingMachine = new VendingMachine();
	
	/** The messages. */
	VendingMachineMessages messages= new VendingMachineMessages();
	
	/** The test data. */
	VendingMachineItemsInstanceData testData = new VendingMachineItemsInstanceData();
	
	/**
	 * Instantiates a new test cases.
	 */
	TestCases(){
		
	}
	
	/**
	 * Run all no money tests.
	 */
	public void runAllNoMoneyTests(){
		
		testVendNoMoney();
		testEjectNoMoney();
		testInsertNoMoney();
		
	}
	
	/**
	 * Test eject no money.
	 */
	public void testEjectNoMoney(){
		
		System.out.println();
		
		System.out.println("--Test Eject--No Money State--");
		System.out.println("Expected: " + messages.noMoneyEject);
		System.out.println("Actual:   " + this.testVendingMachine.eject());
		System.out.println("");
		System.out.println("Expected currently inserted money: 0.00");
		System.out.println("Actual currently inserted money: " + this.testVendingMachine.currentlyInsertedMoney);

		
		System.out.println();
		
	}
	
	/**
	 * Test insert no money.
	 */
	public void testInsertNoMoney(){
		
		System.out.println();
		
		System.out.println("--Test insert--No Money State--");
		System.out.println("Expected: " + messages.noMoneyInsert);
		System.out.println("Actual:   " + this.testVendingMachine.insert());
		System.out.println("");
		System.out.println("Expected currently inserted money: 1.00");
		System.out.println("Actual currently inserted money: " + this.testVendingMachine.currentlyInsertedMoney);

		System.out.println();
	}
	
	/**
	 * Test vend no money.
	 */
	public void testVendNoMoney(){
		
		System.out.println();
		
		System.out.println("--Test Vend--No Money State--");
		System.out.println("Expected: " + messages.noMoneyVendItem);
		System.out.println("Actual:   " + this.testVendingMachine.vendItem(this.testVendingMachine.instanceData.cakePopButton));
		System.out.println("");
		System.out.println("Expected currently inserted money: 0.00");
		System.out.println("Actual currently inserted money: " + this.testVendingMachine.currentlyInsertedMoney);

		System.out.println();
	}
	
	/**
	 * Run all has money tests.
	 */
	public void runAllHasMoneyTests(){
		
		testInsertHasMoney();
		testEjectHasMoney();
		testVendHasMoney();
		//testVendOutOfStockHasMoney();
		testVendInsufficentHasMoney();
		
	}
	
	/**
	 * Test insert has money.
	 */
	public void testInsertHasMoney(){
		
		System.out.println();
		
		System.out.println("--Test insert--Has Money State--");
		System.out.println("Expected: " + messages.hasMoneyInsert);
		System.out.println("Actual:   " + this.testVendingMachine.insert());
		System.out.println("");
		System.out.println("Expected currently inserted money: 2.00");
		System.out.println("Actual currently inserted money: " + this.testVendingMachine.currentlyInsertedMoney);

		System.out.println();
	}
	
	/**
	 * Test eject has money.
	 */
	public void testEjectHasMoney(){
		
		System.out.println();
		
		System.out.println("--Test Eject--Has Money State--");
		System.out.println("Expected: " + messages.hasMoneyEject);
		System.out.println("Actual:   " + this.testVendingMachine.eject());
		System.out.println("");
		System.out.println("Expected currently inserted money: 0.00");
		System.out.println("Actual currently inserted money: " + this.testVendingMachine.currentlyInsertedMoney);

		
		System.out.println();
		
	}
	
	/**
	 * Test vend has money.
	 */
	public void testVendHasMoney(){
		
		System.out.println();
		
		this.testVendingMachine.insert();
		
		System.out.println("--Test Vend--Has Money State--");
		System.out.println("Expected: " + messages.hasMoneyVendItem);
		System.out.println("Actual:   " + this.testVendingMachine.vendItem(this.testVendingMachine.instanceData.cakePopButton));
		System.out.println("");
		System.out.println("Expected currently inserted money: 0.00");
		System.out.println("Actual currently inserted money: " + this.testVendingMachine.currentlyInsertedMoney);
		System.out.println("");
		System.out.println(this.testVendingMachine.instanceData.configuredInventoryToString(this.testVendingMachine.inventory));

		System.out.println();
	}
	
	/**
	 * Test vend out of stock has money.
	 */
	public void testVendOutOfStockHasMoney(){
		
		this.testVendingMachine.insert();
		//testInsertHasMoney();
		//testInsertHasMoney();
		//testInsertHasMoney();
		//testEjectHasMoney();
		//this.testVendingMachine.insert();
		//testEjectHasMoney();
		//testEjectHasMoney();
		this.testVendingMachine.insert();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		//testInsertHasMoney();
		testVendHasMoney();
		
	}
	
	/**
	 * Test vend insufficent has money.
	 */
	public void testVendInsufficentHasMoney(){
		
		System.out.println();
		
		this.testVendingMachine.insert();
		
		System.out.println("Expected: " + messages.hasMoneyFailedVend);
		System.out.println("Actual:   " + this.testVendingMachine.vendItem(this.testVendingMachine.instanceData.caramelMachButton));
		System.out.println("");
		System.out.println("Expected currently inserted 0.00");
		System.out.println("Acutal: " + this.testVendingMachine.currentlyInsertedMoney);
		
		System.out.println();
		
	}
	
	/**
	 * Test claim money.
	 */
	public void testClaimMoney(){
		
		this.testVendingMachine.insert();
		this.testVendingMachine.vendItem(this.testVendingMachine.instanceData.cakePopButton);
		System.out.println(this.testVendingMachine.inventory.getItemStock(this.testVendingMachine.instanceData.cakePop));
		System.out.println(this.testVendingMachine.currentlyInsertedMoney);
		System.out.println(this.testVendingMachine.moneyStoredInVendingMachine);
		
	}



	
}
