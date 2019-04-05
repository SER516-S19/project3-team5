package view;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GiveUpButton extends JButton {
    public GiveUpButton(){
        super("Give Up.");
        setBackground(Color.RED);
        setForeground(Color.WHITE);
        addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}