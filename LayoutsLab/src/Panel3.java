


import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The third JPanel. Contains all the components that are supposed to be in
 * the third panel.
 *
 * @author David Boivin (Spit)
 */
@SuppressWarnings("serial")
public class Panel3 extends JPanel {

//Constants --------------------------------------------------------------- //
	
	public final String LABEL_TEXT = "Panel 3";
	
//Members ----------------------------------------------------------------- //
	
	JLabel mTitle;
	
//Constructors ------------------------------------------------------------ //
	
	public Panel3(){
		super();
		
		//create components
		mTitle = new JLabel(LABEL_TEXT);
		
		//add components
		this.add(mTitle);
		
	}
	
//Private Methods --------------------------------------------------------- //
	
	
	
}
