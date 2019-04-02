package view;
import java.awt.BorderLayout;
import javax.swing.*;

public class StudentUI {
    public StudentUI(){

        JFrame studentApp = new JFrame();
        studentApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentApp.setSize(800, 600);
        studentApp.setTitle("Student Quiz Taker");
        JPanel quizPanel = new JPanel();
        quizPanel.add(new GiveUpButton(), BorderLayout.CENTER);
        quizPanel.add(new SubmitButton(), BorderLayout.CENTER);
        studentApp.add(quizPanel, BorderLayout.CENTER);
        studentApp.setVisible(true);
    }

    public static void main(String[] args){
        new StudentUI();
    }
}
