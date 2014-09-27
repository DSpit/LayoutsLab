


import java.awt.Dimension;

import javax.swing.JFrame;

/**
 *
 * @author David Boivin (Spit)
 */
public class MainFrame extends JFrame {
	
// Constants --------------------------------------------------------------- //
	
	public static final String TITLE = "Layouts MainFrame";
	
	private final Dimension FRAME_DIMEN = new Dimension(500,500);
	
// Members ----------------------------------------------------------------- //
	
	
	
// Constructors ------------------------------------------------------------ //
	
	public MainFrame(){
		super(TITLE);
		
		this.setPreferredSize(FRAME_DIMEN);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setVisible(true);
		//this.pack();
	}
	
// Private Methods --------------------------------------------------------- //
	
	
	
// MAIN -------------------------------------------------------------------- //
	
	public static void main(String[] args){
		
		new MainFrame();
	}
}
