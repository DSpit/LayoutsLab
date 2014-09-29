


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
	
	private JPanel mainPanel;
	private JButton mNext;
	private JButton mLast;
	
// Constructors ------------------------------------------------------------ //
	
	public MainFrame(){
		super(TITLE);
		
		//start set up of the main frame variables
		this.setPreferredSize(FRAME_DIMEN);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		//setup the frame content
		mainPanel = new JPanel();
		mNext = new JButton("Next");
		mLast = new JButton("Last");
		this.setupContent();
		
		//finish setting up the main frame variables
		this.setVisible(true);
		this.pack();
	}
	
// Private Methods --------------------------------------------------------- //
	
	private void setupContent(){
		
		this.setLayout(new BorderLayout());
		
		//titlePane
		JPanel titlePane = new JPanel(new FlowLayout(FlowLayout.CENTER));
		titlePane.setBackground(Color.BLUE);
		JLabel masthead = new JLabel("BoringBook");
		masthead.setForeground(Color.WHITE);
		titlePane.add(masthead);
		
		
		//add panels to the frame
		mainPanel.add(new Panel1("Boring Card 1"));
		mainPanel.add(new Panel1("Boring Card 2"));
		mainPanel.add(new Panel1("Boring Card 4?"));
		
		//setup mainPanel
		mainPanel.setLayout(new CardLayout());
		
		//setup controlButtons
		ActionListener l = new ControlListener();
		mNext.addActionListener(l);
		mLast.addActionListener(l);
		
		//set Layout
		this.add(mainPanel, BorderLayout.CENTER);
		this.add(titlePane, BorderLayout.NORTH);
		this.add(mNext, BorderLayout.EAST);
		this.add(mLast, BorderLayout.WEST);
	}
	
// Private Listeners ------------------------------------------------------- //
	
	class ControlListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource().equals(mNext)){
				((CardLayout)mainPanel.getLayout()).next(mainPanel);
				
			}else if(e.getSource().equals(mLast)){
				((CardLayout)mainPanel.getLayout()).previous(mainPanel);
				
			}
		}
		
	}
	
// MAIN -------------------------------------------------------------------- //
	
	public static void main(String[] args){
		
		new MainFrame();
	}
}
