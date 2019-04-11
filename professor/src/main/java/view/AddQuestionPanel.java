package main.java.view;

import javax.swing.*;
import java.awt.*;

public class AddQuestionPanel {
    private JPanel questionPanel;
    private JLabel questionLabel;
    private JTextArea questionInput;
    private JRadioButton optionSelector1;
    private JRadioButton optionSelector2;
    private JRadioButton optionSelector4;
    private JRadioButton optionSelector3;
    private ButtonGroup group;
    private JTextField optionInput1;
    private JTextField optionInput2;
    private JTextField optionInput3;
    private JTextField optionInput4;
    private JButton saveQuiz;
    private JButton addQuestion;
    private JLabel optionLabel;

    public AddQuestionPanel() {
        group = new ButtonGroup();
        group.add(optionSelector1);
        group.add(optionSelector2);
        group.add(optionSelector3);
        group.add(optionSelector4);
    }

    public JPanel getQuestionPanel() {
        return questionPanel;
    }

    public void setQuestionPanel(JPanel questionPanel) {
        this.questionPanel = questionPanel;
    }

    public JLabel getQuestionLabel() {
        return questionLabel;
    }

    public void setQuestionLabel(JLabel questionLabel) {
        this.questionLabel = questionLabel;
    }

    public JTextArea getQuestionInput() {
        return questionInput;
    }

    public void setQuestionInput(JTextArea questionInput) {
        this.questionInput = questionInput;
    }

    public JRadioButton getOptionSelector1() {
        return optionSelector1;
    }

    public void setOptionSelector1(JRadioButton optionSelector1) {
        this.optionSelector1 = optionSelector1;
    }

    public JRadioButton getOptionSelector2() {
        return optionSelector2;
    }

    public void setOptionSelector2(JRadioButton optionSelector2) {
        this.optionSelector2 = optionSelector2;
    }

    public JRadioButton getOptionSelector4() {
        return optionSelector4;
    }

    public void setOptionSelector4(JRadioButton optionSelector4) {
        this.optionSelector4 = optionSelector4;
    }

    public JRadioButton getOptionSelector3() {
        return optionSelector3;
    }

    public void setOptionSelector3(JRadioButton optionSelector3) {
        this.optionSelector3 = optionSelector3;
    }

    public JTextField getOptionInput1() {
        return optionInput1;
    }

    public void setOptionInput1(JTextField optionInput1) {
        this.optionInput1 = optionInput1;
    }

    public JTextField getOptionInput2() {
        return optionInput2;
    }

    public void setOptionInput2(JTextField optionInput2) {
        this.optionInput2 = optionInput2;
    }

    public JTextField getOptionInput3() {
        return optionInput3;
    }

    public void setOptionInput3(JTextField optionInput3) {
        this.optionInput3 = optionInput3;
    }

    public JTextField getOptionInput4() {
        return optionInput4;
    }

    public void setOptionInput4(JTextField optionInput4) {
        this.optionInput4 = optionInput4;
    }

    public JButton getSaveQuiz() {
        return saveQuiz;
    }

    public void setSaveQuiz(JButton saveQuiz) {
        this.saveQuiz = saveQuiz;
    }

    public JButton getAddQuestion() {
        return addQuestion;
    }

    public void setAddQuestion(JButton addQuestion) {
        this.addQuestion = addQuestion;
    }

    public JLabel getOptionLabel() {
        return optionLabel;
    }

    public void setOptionLabel(JLabel optionLabel) {
        this.optionLabel = optionLabel;
    }

    public void invalidateElements(){
        questionInput.setText("");
        optionInput1.setText("");
        optionInput2.setText("");
        optionInput3.setText("");
        optionInput4.setText("");
        optionInput1.setForeground(Color.BLACK);
        optionInput2.setForeground(Color.BLACK);
        optionInput3.setForeground(Color.BLACK);
        optionInput4.setForeground(Color.BLACK);
        group.clearSelection();
    }
}
