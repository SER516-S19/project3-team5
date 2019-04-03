package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Class CreateQuestionPanel to create Quiz by Professor
 * @author narenkumarkonchada
 * @version 1.1
 * @since 04/02/2019
 *
 */
public class CreateQuestionPanel extends JPanel{
	
    public CreateQuestionPanel(){
        super();
        setLayout(new BorderLayout());
        JPanel questionPanel = new JPanel();
        questionPanel.setPreferredSize(new Dimension(600, 75));
        //TODO: add Create Question Text Field from task#10
        add(questionPanel, BorderLayout.NORTH);

        JScrollPane answersPanel = new JScrollPane();
        //TODO: create checkboxes from task#21
        //TODO: show answer text for task#22
        add(answersPanel, BorderLayout.CENTER);

        JPanel buttonsAndQuizNamePane = new JPanel();
        buttonsAndQuizNamePane.setLayout(new GridLayout(2, 2));
        buttonsAndQuizNamePane.setPreferredSize(new Dimension(600, 75));
        //TODO: add add answer button from task#18
        //TODO: add save question button from task#17
        //TODO: add quiz name text field from task#8
        
        JButton saveQuizButton = new JButton("Save Quiz");  
        saveQuizButton.setBounds(50,100,95,30);   
        buttonsAndQuizNamePane.add(saveQuizButton);  
        saveQuizButton.setLayout(null);  
        saveQuizButton.setVisible(true);
        saveQuizButton.setBackground(Color.RED);
        saveQuizButton.setOpaque(true);
        saveQuizButton.setBorderPainted(false);
        saveQuizButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        add(buttonsAndQuizNamePane, BorderLayout.SOUTH);
    }
}
