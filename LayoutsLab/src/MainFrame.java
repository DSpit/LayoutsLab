


import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * The main window frame, which contains all of the
 * GUI component.<br><br>
 * 
 * ------------------------------------------------------------------------
 * <br>			Question 4           			<br>            
 * 	Yay CardLayouts on Panel3				<br>
 * ------------------------------------------------------------------------
 * 					   
 * @author David Boivin (Spit)
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame {

// Constants --------------------------------------------------------------- //

	public static final String TITLE = "Layouts MainFrame";
	
	private final Dimension FRAME_DIMEN = new Dimension(500,500);
	
// Members ----------------------------------------------------------------- //
	
	private JPanel mainPanel;
	
// Constructors ------------------------------------------------------------ //
	
	public MainFrame(){
		super(TITLE);
		
		//start set up of the main frame variables
		this.setSize(FRAME_DIMEN);
		this.setPreferredSize(FRAME_DIMEN);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//setup the frame content
		mainPanel = new JPanel();
		this.setupContent();
		
		//finish setting up the main frame variables
		this.setVisible(true);
		this.pack();
	}
	
// Private Methods --------------------------------------------------------- //
	
	private void setupContent(){
		
		//setup mainPanel
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		//add panels to the frame
		mainPanel.add(new Panel1(), 0);
		mainPanel.add(new Panel2(), 1);
		mainPanel.add(new Panel3(), 2);
		
		//set Layout
		this.add(mainPanel);
	}
	
// MAIN -------------------------------------------------------------------- //
	
	public static void main(String[] args){
		
		new MainFrame();
	}
}
