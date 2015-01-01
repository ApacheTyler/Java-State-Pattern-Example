import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


// TODO: Auto-generated Javadoc
/**
 * The Class OperatorPanel.
 */
public class OperatorPanel extends JPanel{

	/** The caramel frapp lbl. */
	private JLabel caramelFrappLbl;
	
	/** The caramel mach lbl. */
	private JLabel caramelMachLbl;
	
	/** The iced coffee lbl. */
	private JLabel icedCoffeeLbl;
	
	/** The car apple spice lbl. */
	private JLabel carAppleSpiceLbl;
	
	/** The brewed coffee lbl. */
	private JLabel brewedCoffeeLbl;
	
	/** The coffee cake lbl. */
	private JLabel coffeeCakeLbl;
	
	/** The cake pop lbl. */
	private JLabel cakePopLbl;
	
	/** The water bottle lbl. */
	private JLabel waterBottleLbl;
	
	/** The stock lbl. */
	private JLabel stockLbl;
	
	/** The item lbl. */
	private JLabel itemLbl;
	
	/** The tot money lbl. */
	private JLabel totMoneyLbl;
	
	/** The restock btn. */
	private JButton restockBtn;
	
	/** The exit btn. */
	private JButton exitBtn;
	
	/** The collect btn. */
	private JButton collectBtn;
	
	/** The background. */
	private Image background;

	
	/**
	 * Instantiates a new operator panel.
	 *
	 * @param vendMach the vend mach
	 */
	OperatorPanel(VendingMachine vendMach)
	{
	setLayout(null);//Set layout for (null to add specific locations)
	setSize(400, 600);//Set size of actual app window
	
	this.caramelFrappLbl =  new JLabel();
	this.caramelFrappLbl.setText("Caramel Frappacino          " + vendMach.inventory.getItemStock(vendMach.instanceData.caramelFrapp));
	this.caramelFrappLbl.setLocation(16, 70);
	this.caramelFrappLbl.setSize(200, 30);
	this.caramelFrappLbl.setVisible(true);
	
	this.caramelMachLbl =   new JLabel("Caramel Machiato             " + vendMach.inventory.getItemStock(vendMach.instanceData.caramelMach));
	this.caramelMachLbl.setLocation(16, 110);
	this.caramelMachLbl.setSize(200, 30);
	
	this.icedCoffeeLbl =    new JLabel("Iced Coffee                       " + vendMach.inventory.getItemStock(vendMach.instanceData.icedCoffee));
	this.icedCoffeeLbl.setLocation(16, 150);
	this.icedCoffeeLbl.setSize(200, 30);

	this.carAppleSpiceLbl = new JLabel("Caramel Apple Spice         " + vendMach.inventory.getItemStock(vendMach.instanceData.carAppleSpice));
	this.carAppleSpiceLbl.setLocation(16, 190);
	this.carAppleSpiceLbl.setSize(200, 30);

	this.brewedCoffeeLbl =  new JLabel("Brewed Coffee                   " + vendMach.inventory.getItemStock(vendMach.instanceData.brewedCoffee));
	this.brewedCoffeeLbl.setLocation(16, 230);
	this.brewedCoffeeLbl.setSize(200, 30);
	
	this.coffeeCakeLbl =    new JLabel("Coffee Cake                      " + vendMach.inventory.getItemStock(vendMach.instanceData.coffeeCake));
	this.coffeeCakeLbl.setLocation(16, 270);
	this.coffeeCakeLbl.setSize(200, 30);
	
	this.cakePopLbl =       new JLabel("Cake Pop                          " + vendMach.inventory.getItemStock(vendMach.instanceData.cakePop));
	this.cakePopLbl.setLocation(16, 310);
	this.cakePopLbl.setSize(200, 30);
	
	this.waterBottleLbl =   new JLabel("Water Bottle                      " + vendMach.inventory.getItemStock(vendMach.instanceData.waterBottle));
	this.waterBottleLbl.setLocation(16, 350);
	this.waterBottleLbl.setSize(200, 30);
	
	this.stockLbl = new JLabel("Stock");
	this.stockLbl.setLocation(170, 30);
	this.stockLbl.setSize(200, 30);
	
	this.totMoneyLbl = new JLabel("Currently have " + vendMach.moneyStoredInVendingMachine + " collected");
	this.totMoneyLbl.setLocation(16, 410);
	this.totMoneyLbl.setSize(200, 30);
	
	restockBtn = new JButton();
	restockBtn.setText("Restock");
	restockBtn.setSize(130, 30);
	restockBtn.setLocation(10, 380);
	
	exitBtn = new JButton();
	exitBtn.setText("Exit Operator");
	exitBtn.setSize(130, 30);
	exitBtn.setLocation(10, 520);
	
	collectBtn = new JButton();
	collectBtn.setText("Collect Money");
	collectBtn.setSize(130, 30);
	collectBtn.setLocation(10, 450);
	
	add(this.caramelFrappLbl);
	add(this.caramelMachLbl);
	add(this.carAppleSpiceLbl);
	add(this.brewedCoffeeLbl);
	add(this.icedCoffeeLbl);
	add(this.cakePopLbl);
	add(this.coffeeCakeLbl);
	add(this.waterBottleLbl);
	add(this.stockLbl);
	add(this.collectBtn);
	add(this.totMoneyLbl);
	add(this.restockBtn);
	add(this.exitBtn);
 
	
	background = new ImageIcon("vendBackground.png").getImage();
		
	}
	
	/**
	 * Update operator panel.
	 *
	 * @param vendMach the vend mach
	 */
	public void updateOperatorPanel(VendingMachine vendMach)
	{
	
	this.caramelFrappLbl.setText("Caramel Frappacino          " + vendMach.inventory.getItemStock(vendMach.instanceData.caramelFrapp));
	
	this.caramelMachLbl.setText("Caramel Machiato             " + vendMach.inventory.getItemStock(vendMach.instanceData.caramelMach));
	
	this.icedCoffeeLbl.setText("Iced Coffee                       " + vendMach.inventory.getItemStock(vendMach.instanceData.icedCoffee));

	this.carAppleSpiceLbl.setText("Caramel Apple Spice         " + vendMach.inventory.getItemStock(vendMach.instanceData.carAppleSpice));

	this.brewedCoffeeLbl.setText("Brewed Coffee                   " + vendMach.inventory.getItemStock(vendMach.instanceData.brewedCoffee));

	this.coffeeCakeLbl.setText("Coffee Cake                      " + vendMach.inventory.getItemStock(vendMach.instanceData.coffeeCake));
	
	this.cakePopLbl.setText("Cake Pop                          " + vendMach.inventory.getItemStock(vendMach.instanceData.cakePop));

	this.waterBottleLbl.setText("Water Bottle                      " + vendMach.inventory.getItemStock(vendMach.instanceData.waterBottle));
	
	this.totMoneyLbl.setText("Currently have " + vendMach.moneyStoredInVendingMachine + " collected");

	}
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.drawImage(background, 0, 0, 400, 600, null);
	}
	
	/**
	 * Gets the exit button.
	 *
	 * @return the exit button
	 */
	public JButton getExitButton(){
		return this.exitBtn;
	}
	
	/**
	 * Gets the collect button.
	 *
	 * @return the collect button
	 */
	public JButton getCollectButton(){
		return this.collectBtn;
	}
	
	/**
	 * Gets the restock button.
	 *
	 * @return the restock button
	 */
	public JButton getRestockButton(){
		return this.restockBtn;
	}
	
}
