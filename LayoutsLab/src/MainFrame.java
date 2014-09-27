


import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * The main window frame, which contains all of the
 * GUI component.
 * 					   
 * @author David Boivin (Spit)
 */
@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	
// Constants --------------------------------------------------------------- //

	public static final String TITLE = "Layouts MainFrame";
	
	private final Dimension FRAME_DIMEN = new Dimension(500,500);
		
// Members ----------------------------------------------------------------- //
	
	
	
// Constructors ------------------------------------------------------------ //
	
	public MainFrame(){
		super(TITLE);
		
		//start set up of the main frame variables
		this.setPreferredSize(FRAME_DIMEN);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//setup the frame content
		this.setupContent();
		
		//finish setting up the main frame variables
		this.setVisible(true);
		//this.pack();
	}
	
// Private Methods --------------------------------------------------------- //
	
	private void setupContent(){
		
		//set Layout
		this.setLayout(null);
		
		//add panels to the frame
		this.add(new Panel1());
		this.add(new Panel2());
		this.add(new Panel3());
	}
	
// MAIN -------------------------------------------------------------------- //
	
	public static void main(String[] args){
		
		new MainFrame();
	}
}
