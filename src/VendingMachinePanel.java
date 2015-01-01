import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

// TODO: Auto-generated Javadoc
/**
 * The Class VendingMachinePanel.
 */
public class VendingMachinePanel extends JPanel{
	
	/** The caramel frapp button. */
	private JButton caramelFrappButton;
	
	/** The caramel mach button. */
	private JButton caramelMachButton;
	
	/** The iced coffee button. */
	private JButton icedCoffeeButton;
	
	/** The car apple spice button. */
	private JButton carAppleSpiceButton;
	
	/** The brewed coffee button. */
	private JButton brewedCoffeeButton;
	
	/** The coffee cake button. */
	private JButton coffeeCakeButton;
	
	/** The cake pop button. */
	private JButton cakePopButton;
	
	/** The water bottle button. */
	private JButton waterBottleButton;
	
	/** The operator. */
	private JButton operator;
	
	/** The insert. */
	private JButton insert;
	
	/** The eject. */
	private JButton eject;
	
	/** The message area title. */
	private TitledBorder messageAreaTitle;
	
	/** The insert eject bdr. */
	private TitledBorder insertEjectBdr;
	
	/** The vending machine message lbl. */
	private JLabel vendingMachineMessageLbl;
	
	/** The background. */
	private Image background;
	
	/**
	 * Instantiates a new vending machine panel.
	 */
	VendingMachinePanel()
	{
	
	setLayout(null);//Set layout for (null to add specific locations)
	setSize(400, 600);//Set size of actual app window
		
	this.caramelFrappButton = new JButton();//Create search button
	this.caramelFrappButton.setSize(130, 30);
	this.caramelFrappButton.setLocation(250, 80);
	this.caramelFrappButton.setText("Caramel Frapp");
	
	this.caramelMachButton = new JButton();//Create search button
	this.caramelMachButton.setSize(130, 30);
	this.caramelMachButton.setLocation(250, 120);
	this.caramelMachButton.setText("Caramel Mach");
	
	this.icedCoffeeButton = new JButton();//Create search button
	this.icedCoffeeButton.setSize(130, 30);
	this.icedCoffeeButton.setLocation(250, 160);
	this.icedCoffeeButton.setText("Iced Coffee");
	
	this.carAppleSpiceButton = new JButton();//Create search button
	this.carAppleSpiceButton.setSize(130, 30);
	this.carAppleSpiceButton.setLocation(250, 200);
	this.carAppleSpiceButton.setText("Cr.Apple Spice");
	
	this.brewedCoffeeButton = new JButton();//Create search button
	this.brewedCoffeeButton.setSize(130, 30);
	this.brewedCoffeeButton.setLocation(250, 240);
	this.brewedCoffeeButton.setText("Brewed Coffee");
	
	this.coffeeCakeButton = new JButton();//Create search button
	this.coffeeCakeButton.setSize(130, 30);
	this.coffeeCakeButton.setLocation(250, 280);
	this.coffeeCakeButton.setText("Coffee Cake");
	
	this.cakePopButton = new JButton();//Create search button
	this.cakePopButton.setSize(130, 30);
	this.cakePopButton.setLocation(250, 320);
	this.cakePopButton.setText("Cake Pop");
	
	this.waterBottleButton = new JButton();//Create search button
	this.waterBottleButton.setSize(130, 30);
	this.waterBottleButton.setLocation(250, 360);
	this.waterBottleButton.setText("Water Bottle");
	
	this.operator = new JButton();//Create search button
	this.operator.setSize(130, 30);
	this.operator.setLocation(130, 520);
	this.operator.setText("Operator");
	
	this.insert = new JButton();//Create search button
	this.insert.setSize(130, 30);
	this.insert.setLocation(16, 80);
	this.insert.setText("Insert $1.00");
	
	this.eject = new JButton();//Create search button
	this.eject.setSize(130, 30);
	this.eject.setLocation(16, 120);
	this.eject.setText("Eject Money");
	
	this.vendingMachineMessageLbl = new JLabel("Welcome To RAWWRBucks", SwingConstants.CENTER);
	this.vendingMachineMessageLbl.setVisible(true);
	this.vendingMachineMessageLbl.setSize(300, 60);

	
	Font boldFont = new Font(this.vendingMachineMessageLbl.getFont().getName(),Font.BOLD,this.vendingMachineMessageLbl.getFont().getSize());
	this.vendingMachineMessageLbl.setFont(boldFont);

	this.vendingMachineMessageLbl.setLocation(50, 460);
	
	this.messageAreaTitle = BorderFactory.createTitledBorder("Vending Machine Messages");
	this.vendingMachineMessageLbl.setBorder(this.messageAreaTitle);
		
	background = new ImageIcon("vendBackground.png").getImage();

	
	add(waterBottleButton);
	add(cakePopButton);
	add(coffeeCakeButton);
	add(brewedCoffeeButton);
	add(carAppleSpiceButton);
	add(icedCoffeeButton);
	add(caramelMachButton);
	add(caramelFrappButton);
	add(vendingMachineMessageLbl);
	add(insert);
	add(eject);
	add(operator);
	}
	
	/**
	 * Gets the CRF button.
	 *
	 * @return the CRF button
	 */
	public JButton getCRFButton(){
		
		return this.caramelFrappButton;
		
	}
	
	/**
	 * Gets the CAS button.
	 *
	 * @return the CAS button
	 */
	public JButton getCASButton(){
		
		return this.carAppleSpiceButton;
		
	}
	
	/**
	 * Gets the CM button.
	 *
	 * @return the CM button
	 */
	public JButton getCMButton(){
		
		return this.caramelMachButton;
		
	}
	
	/**
	 * Gets the IC button.
	 *
	 * @return the IC button
	 */
	public JButton getICButton(){
		
		return this.icedCoffeeButton;
		
	}
	
	/**
	 * Gets the b button.
	 *
	 * @return the b button
	 */
	public JButton getBButton(){
		
		return this.brewedCoffeeButton;
		
	}
	
	/**
	 * Gets the CK button.
	 *
	 * @return the CK button
	 */
	public JButton getCKButton(){
		
		return this.coffeeCakeButton;
		
	}
	
	/**
	 * Gets the CP button.
	 *
	 * @return the CP button
	 */
	public JButton getCPButton(){
		
		return this.cakePopButton;
		
	}
	
	/**
	 * Gets the WB button.
	 *
	 * @return the WB button
	 */
	public JButton getWBButton(){
		
		return this.waterBottleButton;
		
	}
	
	/**
	 * Gets the operator button.
	 *
	 * @return the operator button
	 */
	public JButton getOperatorButton(){
		
		return this.operator;
		
	}
	
	/**
	 * Gets the insert button.
	 *
	 * @return the insert button
	 */
	public JButton getInsertButton(){
		
		return this.insert;
		
	}
	
	/**
	 * Gets the eject button.
	 *
	 * @return the eject button
	 */
	public JButton getEjectButton(){
		
		return this.eject;
		
	}
	
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.drawImage(background, 0, 0, 400, 600, null);
	}
	
	/**
	 * Sets the vend mach message.
	 *
	 * @param newMessage the new vend mach message
	 */
	public void setVendMachMessage(String newMessage){
		
		this.vendingMachineMessageLbl.setText(newMessage);
		
	}

	
}
