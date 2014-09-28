


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
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
	
	private final int H_PADDING = 140;
	private final int V_PADDING = 25;
	private final Dimension BUTTON_DIMEN = new Dimension(H_PADDING, 50);
	
//Members ----------------------------------------------------------------- //
	
	JLabel mTitle;
	JButton mButton1;
	JButton mButton2;
	JButton mButton3;
	JButton mButton4;
	
//Constructors ------------------------------------------------------------ //
	
	public Panel2(){
		super();
		
		//create components
		mTitle = new JLabel(LABEL_TEXT);
		
		mButton1 = new JButton("Button1");
		mButton1.setPreferredSize(BUTTON_DIMEN);
		mButton2 = new JButton("Button2");
		mButton2.setPreferredSize(BUTTON_DIMEN);
		mButton3 = new JButton("Button3");
		mButton3.setPreferredSize(BUTTON_DIMEN);
		mButton4 = new JButton("Button4");
		mButton4.setPreferredSize(BUTTON_DIMEN);
		
		this.setupContent();
	}
	
//Private Methods --------------------------------------------------------- //
	
	private void setupContent(){
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));
		titlePanel.add(mTitle);
		
		//create the button panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(2, 2, H_PADDING, V_PADDING));
		
		buttonPanel.add(mButton1);
		buttonPanel.add(mButton2);
		buttonPanel.add(mButton3);
		buttonPanel.add(mButton4);
		
		//workaround for BoxLayout size issue
		buttonPanel.setMaximumSize(buttonPanel.getPreferredSize());
		titlePanel.setMaximumSize(titlePanel.getPreferredSize());
		
		//add components to the panel
		this.add(titlePanel);
		this.add(buttonPanel);
	}
	
}
