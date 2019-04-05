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
	JPanel quizPanel = new JPanel();
	AttemptQuestionPanel questionPane=new AttemptQuestionPanel();
    public StudentUI(){

        JFrame studentApp = new JFrame();
        studentApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentApp.setSize(800, 600);
        studentApp.setTitle("Student Quiz Taker");
                
        quizPanel.add(new GiveUpButton(), BorderLayout.CENTER);
        quizPanel.add(new SubmitButton(), BorderLayout.CENTER);
        studentApp.add(quizPanel, BorderLayout.CENTER);
        studentApp.add(questionPane,BorderLayout.CENTER);
        studentApp.setVisible(true);
    }
    
    
    
    public static void main(String[] args){
        new StudentUI();
    }
}
