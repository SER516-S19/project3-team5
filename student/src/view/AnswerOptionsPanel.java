package view;
 
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 


/** Class that provides the answer choices in the quiz Panel
 * @author Archana Madhavan
 * @since 4/4/2019
 * @version 1.1
 *
 */
public class AnswerOptionsPanel extends JPanel {
	
	private static final int NO_OF_OPTIONS=4;
	private JRadioButton answerRadioButton;
    private JLabel optionLabel;
    private final int WIDTH = 500;
    private final int HEIGHT = 24;

    /**
     * Constructor creating the radio button and Label for answer choices
     */
    AnswerOptionsPanel() {
        super();
        this.answerRadioButton = new JRadioButton();
        this.optionLabel = new JLabel();
        this.optionLabel.setPreferredSize( new Dimension(WIDTH, HEIGHT) );
        this.setLayout(new FlowLayout());
        this.add(this.answerRadioButton);
        
        this.add(this.optionLabel);
        
        this.answerRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleEvent();
            }
        });
    }
    
/*
 *
 *     method to handle radio button events. Returns text of the radio button if pressed
*/
    private void handleEvent() {
       if( this.answerRadioButton.isSelected())
       {
    	   System.out.println(this.answerRadioButton.getText());
       }
       else
    	   System.out.println("No text");
    }

    /**
     * Retrieves the radio button instance
     * @return answerRadioButton
     */
    public JRadioButton getRadioButton(){
        return this.answerRadioButton;
    }

    /**
     * Retrieves the Label Text instance of the radio button
     * @return optionLabel
     */
     public JLabel setLabel(String optionText) {
    	 optionLabel.setText(optionText);
    	 return this.optionLabel;
     }
    
    /**
     * Sets the radio button instance to selected
     */
    public void setSelected(){
        this.answerRadioButton.setSelected(true);
    }

}
