package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author      Koushik Kotamraju
 * @version     1.0
 * @since       1.0
 */
public class CreateAnswerPanel extends JPanel {
    JRadioButton answerRadioButton;
    JTextField answerTextBox;
    int width = 500;
    int height = 24;
    /**
     * Constructor creating the radio button and text box for answers
     */
    CreateAnswerPanel() {
        answerRadioButton = new JRadioButton();
        answerTextBox = new JTextField();
        answerTextBox.setPreferredSize( new Dimension(width ,height ) );
        this.setLayout(new FlowLayout());
        this.add(answerRadioButton);
        this.add(answerTextBox);

        answerRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleEvent();
            }
        });
    }

    private void handleEvent() {
        //System.out.println(answerRadioButton.getText() + " is selected, the customized text is " + answerTextBox.getText());
    }
}