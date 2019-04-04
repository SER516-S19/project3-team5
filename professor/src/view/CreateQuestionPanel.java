package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * Class CreateQuestionPanel to create Quiz by Professor
 *
 * @author narenkumarkonchada
 * @version 1.1
 * @since 04/02/2019
 */
public class CreateQuestionPanel extends JPanel {

    public CreateQuestionPanel() {
        super();
        setLayout(new BorderLayout());
        JPanel questionPanel = new JPanel();
        questionPanel.setPreferredSize(new Dimension(600, 200));

        JLabel labelName = new JLabel("QUESTION: ");
        JTextField textFieldName = new JTextField(60);
        labelName.setLabelFor(textFieldName);
        questionPanel.add(labelName);
        questionPanel.add(textFieldName);
        add(questionPanel, BorderLayout.NORTH);

        JScrollPane answersPanel = new JScrollPane();
        //TODO: create checkboxes from task#21
        CreateAnswerPanel option1 = new CreateAnswerPanel();
        CreateAnswerPanel option2 = new CreateAnswerPanel();
        CreateAnswerPanel option3 = new CreateAnswerPanel();
        CreateAnswerPanel option4 = new CreateAnswerPanel();
        ButtonGroup answerGroup = new ButtonGroup();
        answerGroup.add(option1.jRadioButton);
        answerGroup.add(option2.jRadioButton);
        answerGroup.add(option3.jRadioButton);

        //TODO: show answer text for task#22
        add(answersPanel, BorderLayout.CENTER);
        questionPanel.add(option1);
        questionPanel.add(option2);
        questionPanel.add(option3);
        questionPanel.add(option4);
        JPanel buttonsAndQuizNamePane = new JPanel();
        buttonsAndQuizNamePane.setLayout(new GridLayout(2, 2));
        buttonsAndQuizNamePane.setPreferredSize(new Dimension(600, 75));
        //TODO: add add answer button from task#18
        //TODO: add save question button from task#17
        //TODO: add quiz name text field from task#8

        JButton saveQuizButton = new JButton("Save Quiz");
        saveQuizButton.setBounds(50, 100, 95, 30);
        buttonsAndQuizNamePane.add(saveQuizButton);
        saveQuizButton.setLayout(null);
        saveQuizButton.setVisible(true);
        saveQuizButton.setBackground(Color.RED);
        saveQuizButton.setOpaque(true);
        saveQuizButton.setBorderPainted(false);
        saveQuizButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonsAndQuizNamePane.add(saveQuizButton);
        add(buttonsAndQuizNamePane, BorderLayout.SOUTH);
        JButton saveQuestion = new JButton("Save Question");
        saveQuestion.setBounds(50, 100, 95, 30);
        buttonsAndQuizNamePane.add(saveQuestion);
        saveQuestion.setLayout(null);
        saveQuestion.setVisible(true);
        saveQuestion.setBackground(Color.GREEN);
        saveQuestion.setOpaque(true);
        saveQuestion.setBorderPainted(false);
        saveQuestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonsAndQuizNamePane.add(saveQuestion);
        add(buttonsAndQuizNamePane, BorderLayout.SOUTH);
    }
}
