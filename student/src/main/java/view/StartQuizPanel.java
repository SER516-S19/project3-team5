package view;

import javax.swing.*;
import java.awt.*;

///*
// *       Created by IntelliJ IDEA.
//  *      User:Arch
//   *     Date:4/10/2019
//        Time:7:19PM
//        --%>

public class StartQuizPanel extends JPanel {


    public StartQuizPanel() {
        super();

        this.add(addStartButton());
    }

    /**
     * Creates custom start buttons
     * @return startButton
     */
    public JButton addStartButton(){
        String name ="start quiz";
        Color btnColor = null;
        btnColor = Color.RED;

        JButton startButton = new JButton(name);
        startButton.setBounds(50, 100, 95, 30);
        startButton.setLayout(null);
        startButton.setVisible(true);
        startButton.setBackground(btnColor);
        startButton.setOpaque(true);
        startButton.setBorderPainted(false);
        return startButton;
    }

}
