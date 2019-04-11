package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;

///*
// *       Created by IntelliJ IDEA.
//  *      User:Arch
//   *     Date:4/10/2019
//        Time:7:19PM
//        --%>

public class StartQuizPanel extends JPanel{
    private StudentUI student;
    public StartQuizPanel(StudentUI studentUI) {
        super();
        this.student = studentUI;
//        this.add(addStartButton());
        String name ="start quiz";
        JButton startButton = new JButton(name);
        startButton.setBounds(50, 100, 95, 30);
        startButton.setLayout(null);
        startButton.setVisible(true);
        startButton.setBackground(Color.RED);
        startButton.setOpaque(true);
        startButton.setBorderPainted(false);
        this.add(startButton);
        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
//                    AttemptQuestionPanel.getValuestoUpdate();
                    student.openAttemptQuizPage();

                }
                catch(Exception ae)
                {
                    ae.printStackTrace();
                }
            }
        });
    }




    /**
     * Creates custom start buttons
     * @return startButton
     */
//    public JButton addStartButton(){
//        String name ="start quiz";
//        Color btnColor = null;
//        btnColor = Color.RED;
//
//        JButton startButton = new JButton(name);
//        startButton.setBounds(50, 100, 95, 30);
//        startButton.setLayout(null);
//        startButton.setVisible(true);
//        startButton.setBackground(btnColor);
//        startButton.setOpaque(true);
//        startButton.setBorderPainted(false);
//        startButton.addActionListener(new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    AttemptQuestionPanel.getValuestoUpdate();
//                }
//                catch(Exception ae)
//                {
//                    ae.printStackTrace();
//                }
//            }
//        });
//        return startButton;
//    }

}
