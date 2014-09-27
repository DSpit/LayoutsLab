


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

	public final String LABEL_TEXT = "Panel 1";
	
//Members ----------------------------------------------------------------- //
	
	JLabel mTitle;
	
//Constructors ------------------------------------------------------------ //
	
	public Panel1(){
		super();
		
		//create components
		mTitle = new JLabel(LABEL_TEXT);
		
		//add components
		this.add(mTitle);
		
	}
	
//Private Methods --------------------------------------------------------- //
	
	
	
}
