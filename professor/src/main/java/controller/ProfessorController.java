package main.java.controller;

import main.java.model.Question;
import main.java.model.QuestionImpl;
import main.java.utilities.JsonUtility;
import main.java.view.AddQuestionPanel;
import main.java.view.ProfessorWelcomeUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Class to create Professor UI Frame and add all panels in the frame
 * @author narenkumarkonchada, Aravinda Sai Kondamari
 * @version 1.1
 * @since 04/02/2019
 *
 */
public class ProfessorController {

    private JFrame professorUI;
    private ProfessorWelcomeUI professorWelcomeUI;
    private AddQuestionPanel addQuestionPanel;
    private String quizTitle;
    private QuestionImpl quizQuestionnaire;

    public ProfessorController(JFrame professorUI, ProfessorWelcomeUI professorWelcomeUI,
                          AddQuestionPanel addQuestionPanel, QuestionImpl quizQuestionnaire) {
        this.professorUI = professorUI;
        this.professorWelcomeUI = professorWelcomeUI;
        this.addQuestionPanel = addQuestionPanel;
        this.quizQuestionnaire = quizQuestionnaire;

        //setup Frame UI
        professorUI.setTitle("Quiz Maker");
        professorUI.setPreferredSize(new Dimension(700, 500));
        professorUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        professorUI.setContentPane(professorWelcomeUI.getWelcomeProfessorPanel());

        //Display the Frame
        professorUI.pack();
        professorUI.setLocationRelativeTo(null);
        professorUI.setVisible(true);

        //ProfessorWelcomeUI Listener methods
        createQuizListener();

        //AddQuestionPanel Listener methods
        option1Listener();
        option2Listener();
        option3Listener();
        option4Listener();
        saveQuizListener();
        addQuestionListener();
    }

    private void createQuizListener(){
        professorWelcomeUI.getCreateQuiz().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quizTitle = professorWelcomeUI.getQuizTitle().getText();
                if(quizTitle == null || quizTitle.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter the quiz title.");
                }else{
                    quizQuestionnaire = new QuestionImpl();
                    professorUI.getContentPane().invalidate();
                    addQuestionPanel.invalidateElements();
                    professorUI.setContentPane(addQuestionPanel.getQuestionPanel());
                    professorUI.getContentPane().revalidate();
                }
            }
        });
    }

    private void option1Listener() {
        addQuestionPanel.getOptionSelector1().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addQuestionPanel.getOptionInput1().setForeground(Color.GREEN);
                addQuestionPanel.getOptionInput2().setForeground(Color.RED);
                addQuestionPanel.getOptionInput3().setForeground(Color.RED);
                addQuestionPanel.getOptionInput4().setForeground(Color.RED);
            }
        });
    }

    private void option2Listener() {
        addQuestionPanel.getOptionSelector2().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addQuestionPanel.getOptionInput1().setForeground(Color.RED);
                addQuestionPanel.getOptionInput2().setForeground(Color.GREEN);
                addQuestionPanel.getOptionInput3().setForeground(Color.RED);
                addQuestionPanel.getOptionInput4().setForeground(Color.RED);
            }
        });
    }

    private void option3Listener() {
        addQuestionPanel.getOptionSelector3().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addQuestionPanel.getOptionInput1().setForeground(Color.RED);
                addQuestionPanel.getOptionInput2().setForeground(Color.RED);
                addQuestionPanel.getOptionInput3().setForeground(Color.GREEN);
                addQuestionPanel.getOptionInput4().setForeground(Color.RED);
            }
        });
    }

    private void option4Listener() {
        addQuestionPanel.getOptionSelector4().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addQuestionPanel.getOptionInput1().setForeground(Color.RED);
                addQuestionPanel.getOptionInput2().setForeground(Color.RED);
                addQuestionPanel.getOptionInput3().setForeground(Color.RED);
                addQuestionPanel.getOptionInput4().setForeground(Color.GREEN);
            }
        });
    }

    private void saveQuizListener() {
        addQuestionPanel.getSaveQuiz().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String question = addQuestionPanel.getQuestionInput().getText();
                String option1 = addQuestionPanel.getOptionInput1().getText();
                String option2 = addQuestionPanel.getOptionInput2().getText();
                String option3 = addQuestionPanel.getOptionInput3().getText();
                String option4 = addQuestionPanel.getOptionInput4().getText();
                String correctAnswer = null;

                if(question == null || question.isEmpty()){
                    if(quizQuestionnaire.getQuestions() == null || quizQuestionnaire.getQuestions().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Questions can not be empty. " +
                                "Please enter atleast one question Question");
                    }else{
                        saveQuiz();
                    }
                }else if(checkOptionsEmpty(option1, option2, option3, option4)){
                    JOptionPane.showMessageDialog(null, "Options can not be empty." +
                            "Please fill for all the Options");
                }else if(selectedNothing()){
                    JOptionPane.showMessageDialog(null, "Please select the correct answer.");
                }else{
                    correctAnswer = getCorrectAnswer();
                    saveQuestion(question, option1, option2, option3, option4, correctAnswer);
                    saveQuiz();
                }
            }
        });
    }

    private void addQuestionListener() {
        addQuestionPanel.getAddQuestion().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String question = addQuestionPanel.getQuestionInput().getText();
                String option1 = addQuestionPanel.getOptionInput1().getText();
                String option2 = addQuestionPanel.getOptionInput2().getText();
                String option3 = addQuestionPanel.getOptionInput3().getText();
                String option4 = addQuestionPanel.getOptionInput4().getText();
                String correctAnswer = null;

                if(question == null || question.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Question can not be empty. " +
                            "Please enter the Question");
                }else if(checkOptionsEmpty(option1, option2, option3, option4)){
                    JOptionPane.showMessageDialog(null, "Options can not be empty." +
                            "Please fill for all the Options");
                }else if(selectedNothing()){
                    JOptionPane.showMessageDialog(null, "Please select the correct answer.");
                }else{
                    correctAnswer = getCorrectAnswer();
                    saveQuestion(question, option1, option2, option3, option4, correctAnswer);
                    professorUI.getContentPane().invalidate();
                    addQuestionPanel.invalidateElements();
                    professorUI.setContentPane(addQuestionPanel.getQuestionPanel());
                    professorUI.getContentPane().revalidate();
                }
            }
        });
    }

    private void saveQuiz(){
        JsonUtility.writeToJson(quizQuestionnaire, quizTitle);
        JOptionPane.showMessageDialog(null, "Quiz successfully created by name "
                + quizTitle + ".json");
        professorUI.getContentPane().invalidate();
        professorWelcomeUI.invalidateElements();
        professorUI.setContentPane(professorWelcomeUI.getWelcomeProfessorPanel());
        professorUI.getContentPane().revalidate();
    }

    private boolean checkOptionsEmpty(String option1, String option2, String option3, String option4){
        if(option1 == null || option1.isEmpty() || option2 == null || option2.isEmpty() ||
                option3 == null || option3.isEmpty() || option4 == null || option4.isEmpty()){
            return true;
        }
        return false;
    }

    private boolean selectedNothing(){
        if(!addQuestionPanel.getOptionSelector1().isSelected() && !addQuestionPanel.getOptionSelector2().isSelected()&&
                !addQuestionPanel.getOptionSelector3().isSelected() && !addQuestionPanel.getOptionSelector4().isSelected()){
            return true;
        }
        return false;
    }

    private String getCorrectAnswer(){
        String correctAnswer = null;
        if(addQuestionPanel.getOptionSelector1().isSelected()){
            correctAnswer = addQuestionPanel.getOptionInput1().getText();
        }else if(addQuestionPanel.getOptionSelector2().isSelected()){
            correctAnswer = addQuestionPanel.getOptionInput2().getText();
        }else if(addQuestionPanel.getOptionSelector3().isSelected()){
            correctAnswer = addQuestionPanel.getOptionInput3().getText();
        }else{
            correctAnswer = addQuestionPanel.getOptionInput4().getText();
        }
        return correctAnswer;
    }


    private void saveQuestion(String question, String option1, String option2, String option3,
                              String option4, String correctAnswer) {
        Question questionModel = new Question();
        questionModel.setTitle(question);
        questionModel.setOption(option1);
        questionModel.setOption(option2);
        questionModel.setOption(option3);
        questionModel.setOption(option4);
        questionModel.setCorrectAnswer(correctAnswer);
        quizQuestionnaire.setQuestion(questionModel);
    }

    public JFrame getProfessorUI() {
        return professorUI;
    }

    public void setProfessorUI(JFrame professorUI) {
        this.professorUI = professorUI;
    }

    public ProfessorWelcomeUI getProfessorWelcomeUI() {
        return professorWelcomeUI;
    }

    public void setProfessorWelcomeUI(ProfessorWelcomeUI professorWelcomeUI) {
        this.professorWelcomeUI = professorWelcomeUI;
    }

    public AddQuestionPanel getAddQuestionPanel() {
        return addQuestionPanel;
    }

    public void setAddQuestionPanel(AddQuestionPanel addQuestionPanel) {
        this.addQuestionPanel = addQuestionPanel;
    }
}
