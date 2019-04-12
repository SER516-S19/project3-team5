package view;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.*;
import main.java.model.Question;
import main.java.model.QuestionImpl;

/**
 *
 * @author Archana Madhavan,Harika Kolli,narenkumarkonchada
 * @version 1.1
 * @since 04/03/2019
 * 
 */
public class StudentUI {

    JFrame studentApp = new JFrame();
    private QuestionImpl quiz;

    /**
     *  Default Constructor
     */
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

    /**
     * Called for routing from Select Quiz to Start Quiz Page
     */
    public void startQuizPage() {
        StartQuizPanel startQuizPanel = new StartQuizPanel(this);
        studentApp.setContentPane(startQuizPanel);
        studentApp.revalidate();
    }
    /**
     * Called for routing from Start Quiz Page to Attempt Quiz Page
     */
    public void openAttemptQuizPage() {
        AttemptQuestionPanel attemptQuestionPanel = new AttemptQuestionPanel(this);
        studentApp.setContentPane(attemptQuestionPanel);
        studentApp.revalidate();
    }
    /**
     * Called for routing from Attempt Quiz Page to End Quiz Page
     */
    public void endQuizPage() {
        QuizCompletedPanel endQuizPanel = new QuizCompletedPanel(this);
        studentApp.setContentPane(endQuizPanel);
        studentApp.repaint();
        studentApp.revalidate();
    }

    /**
     *  Used for setting a quiz Object
     *
     * @param quiz - The quiz object
     */
    public void setQuiz(QuestionImpl quiz){
        this.quiz = quiz;
    }

    /**
     * Method for returing a quiz Object
     *
     * @return quiz Object
     */
    public QuestionImpl getQuiz(){
        return this.quiz;
    }

    /**
     *  Invoke the StudentUI Constructor
     * @param args
     */
    public static void main(String[] args){
        new StudentUI();
    }
}
