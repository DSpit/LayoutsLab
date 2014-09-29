


import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The first JPanel. Contains all the components that are supposed to be in
 * the first panel
 *
 * @author David Boivin (Spit)
 */
@SuppressWarnings("serial")
public class Panel1 extends JPanel{
	
//Constants --------------------------------------------------------------- //

	
	
//Members ----------------------------------------------------------------- //
	
	JLabel mTitle;
	
//Constructors ------------------------------------------------------------ //
	
	public Panel1(String title){
		super();
		
		mTitle = new JLabel(title);
		
		this.add(mTitle);
	}
	
//Private Methods --------------------------------------------------------- //
	
	
	
}
