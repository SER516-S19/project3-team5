package view;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.*;


/**
 * Class that provides UI for student to attempt quiz
 * @author Archana Madhavan
 * @version 
 * @since
 *
 */
public class AttemptQuestionPanel extends JPanel{
	JPanel questionPanel=new JPanel();
	AttemptQuestionPanel() {
		super();
        setLayout(new BorderLayout());
        addQuestionTextPane(); 
	}
	
	private void addQuestionTextPane()
    {
		questionPanel.setLayout(new BoxLayout(questionPanel, BoxLayout.Y_AXIS));
		questionPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    	//#30 Create Label to show question Content
    	JLabel questionTextLabel=new JLabel("This is a question for a student to answer to choose");
    	questionTextLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
    	questionPanel.add(questionTextLabel);
    	add(questionPanel, BorderLayout.CENTER);
    }
}
