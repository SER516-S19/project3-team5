package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author      Koushik Kotamraju, Cecilia La Place
 * @version     1.0
 * @since       1.0
 */
public class CreateAnswerPanel extends JPanel {
    private JRadioButton answerRadioButton;
    private JTextField answerTextBox;
    private final int WIDTH = 500;
    private final int HEIGHT = 24;

    /**
     * Constructor creating the radio button and text box for answers
     */
    CreateAnswerPanel() {
        super();
        this.answerRadioButton = new JRadioButton();
        this.answerTextBox = new JTextField();
        this.answerTextBox.setPreferredSize( new Dimension(WIDTH, HEIGHT) );
        this.setLayout(new FlowLayout());
        this.add(this.answerRadioButton);
        this.add(this.answerTextBox);

        this.answerRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleEvent();
            }
        });
    }

    private void handleEvent() {
        //System.out.println(answerRadioButton.getText() + " is selected, the customized text is " + answerTextBox.getText());
    }

    /**
     * Retrieves the radio button instance
     * @return answerRadioButton
     */
    public JRadioButton getRadioButton(){
        return this.answerRadioButton;
    }

    /**
     * Retrieves the text field instance
     * @return answerTextBox
     */
    public JTextField getTextField(){
        return this.answerTextBox;
    }

    /**
     * Sets the radio button instance to selected
     */
    public void setSelected(){
        this.answerRadioButton.setSelected(true);
    }

}