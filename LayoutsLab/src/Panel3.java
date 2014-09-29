


import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
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
	
	private final String NEXT = "Next";
	private final String LAST = "Last";
	private final int PADDING = 5;
	
//Members ----------------------------------------------------------------- //
	
	JLabel mTitle;
	JButton mNext;
	JButton mLast;
	JPanel mCardPane;
	
//Constructors ------------------------------------------------------------ //
	
	public Panel3(){
		super();
		
		//create components
		mTitle = new JLabel(LABEL_TEXT);
		mNext = new JButton(NEXT);
		mLast = new JButton(LAST);
		mCardPane = new JPanel();
		
		this.setupComponents();
		
	}
	
//Private Methods --------------------------------------------------------- //
	
	private void setupComponents(){
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//setup title pane
		JPanel titlePane = new JPanel(new FlowLayout(FlowLayout.CENTER, PADDING, PADDING));
		titlePane.add(mTitle);
		
		//setup button pane
		JPanel buttonPane = new JPanel(new FlowLayout(FlowLayout.CENTER, PADDING, PADDING));
		
		ActionListener l = new ControlListener();
		mLast.addActionListener(l);
		mNext.addActionListener(l);
		
		buttonPane.add(mLast);
		buttonPane.add(mNext);
		
		//setup cardPanel
		mCardPane.setLayout(new CardLayout(PADDING, PADDING));
		
		JLabel l1 = new JLabel("Card 1", JLabel.CENTER);
		JLabel l2 = new JLabel("Card 2", JLabel.CENTER);
		JLabel l3 = new JLabel("Card 3", JLabel.CENTER);
		mCardPane.add(l1);
		mCardPane.add(l2);
		mCardPane.add(l3);
		
		//add all the components together
		this.add(titlePane);
		this.add(buttonPane);
		this.add(mCardPane);
		
		
	}

// Private Listeners ------------------------------------------------------- //
	
	/**
	 * ActionListener which controls the cardPanel
	 */
	class ControlListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(mNext)){
				((CardLayout) mCardPane.getLayout()).next(mCardPane);
				
			}else if(e.getSource().equals(mLast)){
				((CardLayout) mCardPane.getLayout()).previous(mCardPane);
			}
		}
		
	}
	
}
