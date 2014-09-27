


import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The second JPanel. Contains all the components that are supposed to be in
 * the second panel.
 *
 * @author David Boivin (Spit)
 */
@SuppressWarnings("serial")
public class Panel2 extends JPanel {
	
//Constants --------------------------------------------------------------- //
	
	public final String LABEL_TEXT = "Panel 2";
	
//Members ----------------------------------------------------------------- //
	
	JLabel mTitle;
	
//Constructors ------------------------------------------------------------ //
	
	public Panel2(){
		super();
		
		//create components
		mTitle = new JLabel(LABEL_TEXT);
		
		//add components
		this.add(mTitle);
	}
	
//Private Methods --------------------------------------------------------- //
	
	
	
}
