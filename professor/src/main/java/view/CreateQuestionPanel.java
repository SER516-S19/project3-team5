package main.java.view;

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
 * @author narenkumarkonchada, Koushik Kotamraju, Cecilia La Place, David Lahtinen
 * @version 1.2
 * @since 04/02/2019
 */
public class CreateQuestionPanel extends JPanel {

    private final int ANSWERLENGTH = 4;
    private final int SAVEQUIZ = 0;
    private final int SAVEQUES = 1;

    /**
     * Creates the question, answer, and save panels.
     */
    public CreateQuestionPanel() {
        super();
        this.setLayout(new BorderLayout());
        JPanel questionPanel = makeQuestion();
        JPanel savePanel = makeSave();

        JScrollPane answersPanel = new JScrollPane();
        //TODO: show answer text for task#22
        CreateAnswerPanel answerPanels[] = new CreateAnswerPanel[ANSWERLENGTH];
        ButtonGroup answerGroup = new ButtonGroup();

        for (int i = 0; i < ANSWERLENGTH; i++){
            answerPanels[i] = new CreateAnswerPanel();
            answerGroup.add(answerPanels[i].getRadioButton());
            if (i == 0){
                answerPanels[i].getRadioButton().setSelected(true);
            }
            questionPanel.add(answerPanels[i]);
        }

        this.add(questionPanel, BorderLayout.NORTH);
        this.add(answersPanel, BorderLayout.CENTER);
        this.add(savePanel, BorderLayout.SOUTH);
    }

    /**
     * Creates the question entry field
     * @return questionPanel
     */
    public JPanel makeQuestion(){
        JPanel questionPanel = new JPanel();
        questionPanel.setPreferredSize(new Dimension(700, 300));

        JLabel labelName = new JLabel("QUESTION: ");
        JTextArea textArea = new JTextArea(5, 50);

        labelName.setLabelFor(textArea);
        questionPanel.add(labelName);
        questionPanel.add(textArea);
        return questionPanel;
    }

    /**
     * Creates the save panel
     * @return savePanel
     */
    public JPanel makeSave(){
        JPanel savePanel = new JPanel();
        JFrame parent = new JFrame();
        savePanel.setLayout(new GridLayout(2, 2));
        savePanel.setPreferredSize(new Dimension(400, 100));

        //TODO: add quiz name text field from task#8

        JButton saveQuizBtn = makeSaveButton(SAVEQUIZ);
        JButton saveQuestionBtn = makeSaveButton(SAVEQUES);

        saveQuizBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(parent, "Do you want to Save the file?");
            }
        });

        saveQuestionBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        savePanel.add(saveQuizBtn);
        savePanel.add(saveQuestionBtn);
        return savePanel;
    }

    /**
     * Creates custom save buttons
     * @return saveBtn
     */
    public JButton makeSaveButton(int btnType){
        String name = "";
        Color btnColor = null;
        if (btnType == SAVEQUIZ){
            name = "Save Quiz";
            btnColor = Color.RED;
        }
        else if (btnType == SAVEQUES){
            name = "Save Question";
            btnColor = Color.GREEN;
        }
        else{
            return null; // throw exception
        }
        // Create custom button
        JButton saveBtn = new JButton(name);
        saveBtn.setBounds(50, 100, 95, 30);
        saveBtn.setLayout(null);
        saveBtn.setVisible(true);
        saveBtn.setBackground(btnColor);
        saveBtn.setOpaque(true);
        saveBtn.setBorderPainted(false);
        return saveBtn;
    }
}
