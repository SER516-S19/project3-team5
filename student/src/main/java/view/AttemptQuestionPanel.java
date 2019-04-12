package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.util.ArrayList;
import main.java.model.Question;
import main.java.model.QuestionImpl;


/**
 * Class that provides UI for student to attempt quiz
 * @author Archana Madhavan, Harika Kolli,narenkumarkonchada, Cecilia La Place, David Lahtinen
 * @version 1.2
 * @since 4/11/2019
 *
 */
public class AttemptQuestionPanel extends JPanel{

	private static final int SUBMIT = 0;
	private static final int GIVEUP = 1;
	private static final int ANSWERLENGTH = 4;

    private int questionID = 0;

    private JRadioButton[] radioButtons;
    private JLabel questionLabel;
	
    private StudentUI student;
    private QuestionImpl questions;
    private boolean[] tracker;

	AttemptQuestionPanel(StudentUI student) {
		super();
		this.student = student;
        this.questions = this.student.getQuiz();
        this.student.studentApp.setSize(800, 600);
        this.student.studentApp.revalidate();
        this.student.studentApp.repaint();

        JScrollPane answersPanel = new JScrollPane();
        this.radioButtons = new JRadioButton[ANSWERLENGTH];
        ButtonGroup answerGroup = setRadioButtons();
        JPanel questionPanel = addQuestionLabelPanel();
        JPanel navigateButtonPanel = addNavigateButtonPanel();
        for (int i = 0; i < ANSWERLENGTH; i++){
            questionPanel.add(this.radioButtons[i]);
        }

        this.add(questionPanel, BorderLayout.NORTH);
        this.add(answersPanel, BorderLayout.CENTER);
        this.add(navigateButtonPanel, BorderLayout.SOUTH);
        
        // Must initialize correct answer tracker based on question size
        tracker = new boolean[this.questions.getSize()];
	}

    /**
     * Initializes the radio buttons and group
     * @return button group
     */
    private ButtonGroup setRadioButtons(){
        ButtonGroup group = new ButtonGroup();
        ArrayList<String> question = this.questions.getQuestion(this.questionID).getOptions();
        for (int i = 0; i < ANSWERLENGTH; i++){
            this.radioButtons[i] = new JRadioButton(question.get(i));
            group.add(this.radioButtons[i]);
        }
        return group;
    }
	
	/**
     * Creates the question panel
     * @return questionPanel
     */
	private JPanel addQuestionLabelPanel(){
		JPanel questionPanel = new JPanel();
		questionPanel.setPreferredSize(new Dimension(700, 300));
	    questionLabel = new JLabel();
        String question = this.questions.getQuestion(this.questionID).getTitle();
    	this.questionLabel.setText(question);
    	questionPanel.add(questionLabel);
    	return questionPanel;
    }

	/**
     * Creates the navigate panel
     * @return navigateButtonPanel
     */
	private JPanel addNavigateButtonPanel(){
		JPanel navigateButtonPanel = new JPanel();
		navigateButtonPanel.setLayout(new GridLayout(2, 2));
		navigateButtonPanel.setPreferredSize(new Dimension(400, 100));
		JButton giveUpButton = addNavigateButton(GIVEUP);
		JButton submitButton = addNavigateButton(SUBMIT);

		giveUpButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
		submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println(checkAnswer());
                if (checkAnswer()) {
                    student.endQuizPage();
                    return;
                }
                getValuestoUpdate();
            }
        });
		navigateButtonPanel.add(giveUpButton);
		navigateButtonPanel.add(submitButton);
        
    	return navigateButtonPanel;
	}

    /**
     * Check user submitted answer and overall questions answered
     */
    public boolean checkAnswer(){
        Question current = this.questions.getQuestion(this.questionID);
        for (int i = 0; i < ANSWERLENGTH; i++){
            if (radioButtons[i].isSelected()){
                if (radioButtons[i].getText().equals(current.getCorrectAnswer())){
                    tracker[questionID] = true;
                }
            }
        }
        for (int j = 0; j < this.questions.getSize(); j++){
            if(!tracker[j]){
                return false;
            }
        }
        return true;
    }

    /**
     * Action listener function to update labels and radio buttons
     */
	public void getValuestoUpdate(){
        try {
            do{
                this.questionID++;
                if (this.questionID >= this.questions.getSize()){
                    this.questionID = 0;
                }
            } while (this.tracker[questionID]);

            Question question = this.questions.getQuestion(this.questionID);
            String title = question.getTitle();
            this.questionLabel.setText(title);
            for (int i = 0; i < ANSWERLENGTH; i++){
                this.radioButtons[i].setText(question.getOptions().get(i));
            }
        } catch (Exception e1) {
            System.out.println(e1);
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
