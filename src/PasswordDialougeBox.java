import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


// TODO: Auto-generated Javadoc
/**
 * The Class PasswordDialougeBox.
 */
public class PasswordDialougeBox extends JOptionPane {
	
	/** The password field. */
	JPasswordField passwordField;
	
	/** The text field. */
	JTextField textField;
	
	/**
	 * Prompt for password.
	 *
	 * @return the string
	 */
	public String promptForPassword(){
		
		this.textField = new JTextField();
		return (JOptionPane.showInputDialog("Password").toString());
		
	}
	
	/**
	 * Login.
	 *
	 * @return true, if successful
	 */
	public boolean login(){
		
		String userInput = promptForPassword();
		
		if(userInput.equals("security1#")){
			return true;
		}
		else{
			JOptionPane loginFailed = new JOptionPane();
			loginFailed.showMessageDialog(this, "LoginFailed");
			return false;
		}
		
	}

}
