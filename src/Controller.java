import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;


// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
public class Controller {
	
	/** The vending machine. */
	private VendingMachine vendingMachine;
	
	/** The main window. */
	private View mainWindow;
	
	/**
	 * Instantiates a new controller.
	 */
	Controller(){
		
		this.mainWindow = new View();
		this.vendingMachine = new VendingMachine();
		
	}
	
	/**
	 * Gets the vending machine.
	 *
	 * @return the vending machine
	 */
	public VendingMachine getVendingMachine(){
		
		return this.vendingMachine;
		
	}
	
	/**
	 * Register action listeners.
	 */
	public void registerActionListeners(){
		
		this.mainWindow.getContentVendMachPane().getCRFButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentVendMachPane().getCMButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentVendMachPane().getCASButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentVendMachPane().getCPButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentVendMachPane().getCKButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentVendMachPane().getBButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentVendMachPane().getICButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentVendMachPane().getWBButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentVendMachPane().getOperatorButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentVendMachPane().getInsertButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentVendMachPane().getEjectButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentOperatorPane().getExitButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentOperatorPane().getCollectButton().addActionListener(new ButtonClickHandler());
		this.mainWindow.getContentOperatorPane().getRestockButton().addActionListener(new ButtonClickHandler());
		
	}
	
	/**
	 * Execute run configuration.
	 */
	public void execute(){
		
		configure();
		
	}
	
	/**
	 * Configure.
	 */
	public void configure(){
		
		this.mainWindow.display(vendingMachine);
		registerActionListeners();
		
	}
	
	/**
	 * The Class ButtonClickHandler.
	 */
	private class ButtonClickHandler implements ActionListener{
				
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {	
		
			if(e.getSource() == mainWindow.getContentVendMachPane().getCRFButton()){
				
				mainWindow.getContentVendMachPane().setVendMachMessage(vendingMachine.vendItem(vendingMachine.instanceData.caramelFrappButton));
				
			}
			else if(e.getSource() == mainWindow.getContentVendMachPane().getCASButton()){
				
				mainWindow.getContentVendMachPane().setVendMachMessage(vendingMachine.vendItem(vendingMachine.instanceData.carAppleSpiceButton));
				
			}
			else if(e.getSource() == mainWindow.getContentVendMachPane().getCMButton()){
				
				mainWindow.getContentVendMachPane().setVendMachMessage(vendingMachine.vendItem(vendingMachine.instanceData.caramelMachButton));
				
			}
			else if(e.getSource() == mainWindow.getContentVendMachPane().getCPButton()){
				
				mainWindow.getContentVendMachPane().setVendMachMessage(vendingMachine.vendItem(vendingMachine.instanceData.cakePopButton));
				
			}
			else if(e.getSource() == mainWindow.getContentVendMachPane().getCKButton()){
				
				mainWindow.getContentVendMachPane().setVendMachMessage(vendingMachine.vendItem(vendingMachine.instanceData.coffeeCakeButton));
				
			}
			else if(e.getSource() == mainWindow.getContentVendMachPane().getICButton()){
				
				mainWindow.getContentVendMachPane().setVendMachMessage(vendingMachine.vendItem(vendingMachine.instanceData.icedCoffeeButton));
				
			}
			else if(e.getSource() == mainWindow.getContentVendMachPane().getBButton()){
				
				mainWindow.getContentVendMachPane().setVendMachMessage(vendingMachine.vendItem(vendingMachine.instanceData.brewedCoffeeButton));
				
			}
			else if(e.getSource() == mainWindow.getContentVendMachPane().getWBButton()){
				
				mainWindow.getContentVendMachPane().setVendMachMessage(vendingMachine.vendItem(vendingMachine.instanceData.waterBottleButton));
				
			}
			else if(e.getSource() == mainWindow.getContentVendMachPane().getInsertButton()){
				
				mainWindow.getContentVendMachPane().setVendMachMessage(vendingMachine.insert());
				
			}
			else if(e.getSource() == mainWindow.getContentVendMachPane().getEjectButton()){
				
				mainWindow.getContentVendMachPane().setVendMachMessage(vendingMachine.eject());
				
			}
			else if(e.getSource() == mainWindow.getContentVendMachPane().getOperatorButton()){
				
				PasswordDialougeBox prompt = new PasswordDialougeBox();
				if(prompt.login()){
				mainWindow.setOperatorPane(vendingMachine);
				}
				
			}
			else if(e.getSource() == mainWindow.getContentOperatorPane().getExitButton()){
				
				mainWindow.setVendingMachinePane();
				
			}
			else if (e.getSource() == mainWindow.getContentOperatorPane().getCollectButton()){
				
				vendingMachine.collectInsertedMoney();
				mainWindow.setOperatorPane(vendingMachine);
				
			}
			else if (e.getSource() == mainWindow.getContentOperatorPane().getRestockButton()){
				
				vendingMachine.inventory.restockAllItems();
				mainWindow.setOperatorPane(vendingMachine);
				
			}

		
		}
	
	}
	
}
