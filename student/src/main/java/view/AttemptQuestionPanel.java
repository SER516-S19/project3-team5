package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.*;


/**
 * Class that provides UI for student to attempt quiz
 * @author Archana Madhavan, Harika Kolli,narenkumarkonchada
 * @version 1.1
 * @since 4/4/2019
 *
 */
public class AttemptQuestionPanel extends JPanel{

    String questionTitle;
    public static int questionID = 0;
	private static final int SUBMIT = 0;
	private static final int GIVEUP = 1;
	private static final int ANSWERLENGTH = 4;
	private char answerOptions[]= {'A','B','C','D'};
	private StudentUI student;
	AttemptQuestionPanel(StudentUI student) {
		super();
		this.student = student;
        getValuestoUpdate();
        student.studentApp.revalidate();
        student.studentApp.repaint();
//        this.setLayout(new BorderLayout());
        JPanel questionPanel = addQuestionLabelPanel();
        JPanel navigateButtonPanel = addnavigateButtonPanel();

        JScrollPane answersPanel = new JScrollPane();
        AnswerOptionsPanel optionPanels[]= new AnswerOptionsPanel[ANSWERLENGTH];
        ButtonGroup answerGroup = new ButtonGroup();
        
        //grouping radio buttons and adding labels to question panel.
        for (int i = 0; i < ANSWERLENGTH; i++){
        	optionPanels[i] = new AnswerOptionsPanel();
            answerGroup.add(optionPanels[i].getRadioButton());
            //int count = i+1;
            optionPanels[i].getRadioButton().setText(answer.get(i));
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
	questionTextLabel=new JLabel();
	questionTextLabel.setText(questionTitle);
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
                student.openAttemptQuizPage();
            }
        });
		navigateButtonPanel.add(giveUpButton);
		navigateButtonPanel.add(submitButton);
        
    	return navigateButtonPanel;
	}
    ArrayList<String> answer = new ArrayList<>();

	public void getValuestoUpdate()
    {

        ArrayList<String> listNew = new ArrayList<>();
        try {
            Map<Integer,ArrayList> list = controller.StudentController.updateQuizPage();
            System.out.println(list);

            //for(int l=0;l<list.size();l++)
            //{
                ArrayList question = new ArrayList(list.get(questionID));

                    for(int k=0;k<question.size();k++)
                    {
                        if(k==0)
                        {
                            questionTitle = question.get(k).toString();
                        }
                        else if(k==1||k==2||k==3||k==4)
                        {
                            //answer panel
                            answer.add(question.get(k).toString());

                        }

                    }
                questionID++;
            //}
        } catch (Exception e1) {
            System.out.println("Exception has been occured on submit");
        }
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
