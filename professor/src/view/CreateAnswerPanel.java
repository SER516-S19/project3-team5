package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAnswerPanel extends JPanel {
    JRadioButton jRadioButton;
    JTextField jTextField;

    CreateAnswerPanel() {
        jRadioButton = new JRadioButton();
        jTextField = new JTextField();
        jTextField.setPreferredSize( new Dimension(500 , 24 ) );
        this.setLayout(new FlowLayout());
        this.add(jRadioButton);
        this.add(jTextField);

        jRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleEvent();
            }
        });
    }

    private void handleEvent() {
        System.out.println(jRadioButton.getText() + " is selected, the customized text is " + jTextField.getText());
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

////        CreateAnswerPanel createAnswerPanel1 = new CreateAnswerPanel("Apple");
////        CreateAnswerPanel createAnswerPanel2 = new CreateAnswerPanel("Banana");
////        CreateAnswerPanel createAnswerPanel3 = new CreateAnswerPanel("Pear");
////        ButtonGroup buttonGroup = new ButtonGroup();
////        buttonGroup.add(createAnswerPanel1.jRadioButton);
////        buttonGroup.add(createAnswerPanel2.jRadioButton);
////        buttonGroup.add(createAnswerPanel3.jRadioButton);
//
//        jFrame.setLayout(new GridLayout(3, 1, 5, 5));
//        jFrame.add(createAnswerPanel1);
//        jFrame.add(createAnswerPanel2);
//        jFrame.add(createAnswerPanel3);
//        jFrame.pack();
//        jFrame.setVisible(true);
    }
}