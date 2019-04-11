package view;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author Archana Madhavan,Harika Kolli,narenkumarkonchada
 * @version 1.1
 * @since 04/03/2019
 * 
 */

public class StudentUI {

    JFrame studentApp = new JFrame();
    public StudentUI(){

        studentApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentApp.setSize(800, 600);
        studentApp.setTitle("Student Quiz Taker");
        StudentSelectQuiz studentSelectQuiz = new StudentSelectQuiz(this);
        studentApp.setContentPane(studentSelectQuiz);
        studentApp.pack();
        studentApp.setLocationRelativeTo(null);
        studentApp.setVisible(true);
    }

    public void startQuizPage() {
        StartQuizPanel startQuizPanel = new StartQuizPanel(this);
        studentApp.setContentPane(startQuizPanel);
        studentApp.revalidate();
    }

    public void openAttemptQuizPage() {
        AttemptQuestionPanel attemptQuestionPanel = new AttemptQuestionPanel(this);
        studentApp.setContentPane(attemptQuestionPanel);
        studentApp.revalidate();
    }

    public static void main(String[] args){

        new StudentUI();
    }
}
