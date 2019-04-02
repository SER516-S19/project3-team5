package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * @author narenkumarkonchada
 * @version 1.0
 * @since 04/02/2019
 */
public class saveQuizButton extends JButton{
	public saveQuizButton(){
        super("Save Quiz");  
        setVisible(true);
        setBackground(Color.RED);
        setOpaque(true);
        addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}
