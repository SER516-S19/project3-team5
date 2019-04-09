package view;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author Archana Madhavan,
 * @version 1.1
 * @since 04/03/2019
 * 
 */

public class StudentUI {
	
	
    public StudentUI(){

        JFrame studentApp = new JFrame();
        studentApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentApp.setSize(800, 600);
        studentApp.setTitle("Student Quiz Taker");
        //studentApp.add(new FileChooserPanel());
        studentApp.add(new AttemptQuestionPanel());
        studentApp.pack();
        studentApp.setLocationRelativeTo(null);
        studentApp.setVisible(true);
    }
    
    
    
    public static void main(String[] args){
        new StudentUI();
    }
}
