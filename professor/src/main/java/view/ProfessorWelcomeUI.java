package main.java.view;

import javax.swing.*;

public class ProfessorWelcomeUI {
    private JLabel inputQuiz;
    private JTextField quizTitle;
    private JPanel welcomeProfessorPanel;
    private JButton createQuiz;

    public JLabel getInputQuiz() {
        return inputQuiz;
    }

    public void setInputQuiz(JLabel inputQuiz) {
        this.inputQuiz = inputQuiz;
    }

    public JTextField getQuizTitle() {
        return quizTitle;
    }

    public void setQuizTitle(JTextField quizTitle) {
        this.quizTitle = quizTitle;
    }

    public JPanel getWelcomeProfessorPanel() {
        return welcomeProfessorPanel;
    }

    public void setWelcomeProfessorPanel(JPanel welcomeProfessorPanel) {
        this.welcomeProfessorPanel = welcomeProfessorPanel;
    }

    public JButton getCreateQuiz() {
        return createQuiz;
    }

    public void setCreateQuiz(JButton createQuiz) {
        this.createQuiz = createQuiz;
    }

    public void invalidateElements(){
        quizTitle.setText("");
    }
}
