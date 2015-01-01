import javax.swing.JFrame;


// TODO: Auto-generated Javadoc
/**
 * The Class View.
 */
public class View extends JFrame{
	
	/** The vending machine content pane. */
	private VendingMachinePanel vendingMachineContentPane;
	
	/** The operator content pane. */
	private OperatorPanel operatorContentPane;
	
	/**
	 * Display.
	 *
	 * @param vendMach the vend mach
	 */
	public void display(VendingMachine vendMach){
	
	this.vendingMachineContentPane = new VendingMachinePanel();
	this.operatorContentPane = new OperatorPanel(vendMach);
		
	this.setVisible(true);
	this.setContentPane(vendingMachineContentPane);
	this.setSize(400,600);
	this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	this.setResizable(false);
	}
	
	/**
	 * Sets the operator pane.
	 *
	 * @param vendMach the new operator pane
	 */
	public void setOperatorPane(VendingMachine vendMach){
		this.operatorContentPane.updateOperatorPanel(vendMach);
		this.setVisible(true);
		this.setContentPane(operatorContentPane);
		this.setSize(400,600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	/**
	 * Sets the vending machine pane.
	 */
	public void setVendingMachinePane(){
		this.setVisible(true);
		this.setContentPane(vendingMachineContentPane);
		this.setSize(400,600);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	/**
	 * Gets the content vend mach pane.
	 *
	 * @return the content vend mach pane
	 */
	public VendingMachinePanel getContentVendMachPane(){
		
		return this.vendingMachineContentPane;
		
	}
	
	/**
	 * Gets the content operator pane.
	 *
	 * @return the content operator pane
	 */
	public OperatorPanel getContentOperatorPane(){
		
		return this.operatorContentPane;
		
	}

}
