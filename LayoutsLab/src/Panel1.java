


import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

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
	
	private final int RADIO_BUTTON_AMOUNT = 7;
	private final int PADDING = 5;
	
//Members ----------------------------------------------------------------- //
	
	JLabel mTitle;
	JRadioButton[] mRBs;
	ButtonGroup mBGroup;
	JPanel mTitlePane;
	JPanel mDesignPane;
	
//Constructors ------------------------------------------------------------ //
	
	public Panel1(){
		super();
		
		//create compounds and panes
		mTitlePane = new JPanel();
		mDesignPane = new JPanel();
		
		mRBs = new JRadioButton[RADIO_BUTTON_AMOUNT];
		mBGroup = new ButtonGroup();
		
		for(int i = 0; i < RADIO_BUTTON_AMOUNT; ++i){
			mRBs[i] = new JRadioButton("");
			mBGroup.add(mRBs[i]);
		}
		
		mTitle = new JLabel(LABEL_TEXT);
		
		this.setupContent();
		
	}
	
//Private Methods --------------------------------------------------------- //
	
	private void setupContent(){
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		//add title components
		mTitlePane.setLayout(new FlowLayout(FlowLayout.CENTER, PADDING, PADDING));
		mTitlePane.add(mTitle);
		
		//add design components
		mDesignPane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 2;
		c.gridy = 0;
		mDesignPane.add(mRBs[0], c);
		
		c.gridy = 1;
		mDesignPane.add(mRBs[1], c);
		
		c.gridx = 0;
		c.gridy = 2;
		mDesignPane.add(mRBs[2], c);
		
		c.gridx = 1;
		mDesignPane.add(mRBs[3], c);
		
		c.gridx = 2;
		mDesignPane.add(mRBs[4], c);
		
		c.gridx = 3;
		mDesignPane.add(mRBs[5], c);
		
		c.gridx = 4;
		mDesignPane.add(mRBs[6], c);
		
		//workaround for BoxLayout using inexistent MaxSize in JPanel
		mTitlePane.setMaximumSize(mTitlePane.getPreferredSize());
		mDesignPane.setMaximumSize(mDesignPane.getPreferredSize());
		
		//add panes to main panel
		this.add(mTitlePane, 0);
		this.add(mDesignPane, 1);
	}
	
}
