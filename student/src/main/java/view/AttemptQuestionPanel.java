package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * Class that provides UI for student to attempt quiz
 * @author Archana Madhavan, Harika Kolli
 * @version 1.1
 * @since 4/4/2019
 *
 */
public class AttemptQuestionPanel extends JPanel{
	private static final int SUBMIT = 0;
	private static final int GIVEUP = 1;
	private static final int ANSWERLENGTH = 4;
	private char answerOptions[]= {'A','B','C','D'};
	
	AttemptQuestionPanel() {
		super();
        this.setLayout(new BorderLayout());
        JPanel questionPanel = addQuestionLabelPanel();
        JPanel navigateButtonPanel = addnavigateButtonPanel();
        JScrollPane answersPanel = new JScrollPane();
        AnswerOptionsPanel optionPanels[]= new AnswerOptionsPanel[ANSWERLENGTH];
        ButtonGroup answerGroup = new ButtonGroup();
        
        //grouping radio buttons and adding labels to question panel.
        for (int i = 0; i < ANSWERLENGTH; i++){
        	optionPanels[i] = new AnswerOptionsPanel();
            answerGroup.add(optionPanels[i].getRadioButton());
            optionPanels[i].getRadioButton().setText(Character.toString(answerOptions[i]));
            questionPanel.add(optionPanels[i]);
        }
        
        this.add(questionPanel, BorderLayout.NORTH);
        this.add(answersPanel, BorderLayout.CENTER);
        this.add(navigateButtonPanel, BorderLayout.SOUTH);
	  
        
	}
	
	/**
     * Creates the navigate panel
     * @return navigateButtonPanel
     */
	private JPanel addQuestionLabelPanel()
    {
		
		JLabel questionTextLabel;
		JPanel questionPanel=new JPanel();
		questionPanel.setPreferredSize(new Dimension(700, 300));
    	questionTextLabel=new JLabel("This is a question for a student to answer to choose");
    	questionPanel.add(questionTextLabel);
    	return questionPanel;
    }
	
	/**
     * Creates the navigate panel
     * @return navigateButtonPanel
     */
	private JPanel addnavigateButtonPanel()
	{
		JPanel navigateButtonPanel = new JPanel();
		navigateButtonPanel.setLayout(new GridLayout(2, 2));
		navigateButtonPanel.setPreferredSize(new Dimension(400, 100));
		JButton giveUpButton=addNavigateButton(GIVEUP);
		JButton submitButton=addNavigateButton(SUBMIT);
		
		giveUpButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
		submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	try {
					controller.StudentController.updateQuizPage();
				} catch (Exception e1) {
					System.out.println("Exception has been occured on submit");
				}
            }
        });
		navigateButtonPanel.add(giveUpButton);
		navigateButtonPanel.add(submitButton);
        
    	return navigateButtonPanel;
	}
	    
    /**
     * Creates custom navigate buttons
     * @return navigateButton
     */
    public JButton addNavigateButton(int btnType){
        String name = "";
        Color btnColor = null;
        if (btnType == GIVEUP ){
            name = "Give Up";
            btnColor = Color.RED;
        }
        else if (btnType == SUBMIT){
            name = "Submit";
            btnColor = Color.GREEN;
        }
        else{
            return null; 
        }
       
        JButton navigateButton = new JButton(name);
        navigateButton.setBounds(50, 100, 95, 30);
        navigateButton.setLayout(null);
        navigateButton.setVisible(true);
        navigateButton.setBackground(btnColor);
        navigateButton.setOpaque(true);
        navigateButton.setBorderPainted(false);
        return navigateButton;
    }
		
}
