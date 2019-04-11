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

    public void invalidateElements() {
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

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        questionPanel = new JPanel();
        questionPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(8, 5, new Insets(0, 0, 0, 0), -1, -1));
        questionPanel.setBorder(BorderFactory.createTitledBorder("Add Question"));
        questionLabel = new JLabel();
        questionLabel.setText("Enter the Question below:");
        questionLabel.setVerticalAlignment(1);
        questionPanel.add(questionLabel, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        optionInput1 = new JTextField();
        questionPanel.add(optionInput1, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        optionInput2 = new JTextField();
        questionPanel.add(optionInput2, new com.intellij.uiDesigner.core.GridConstraints(4, 1, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        optionInput3 = new JTextField();
        questionPanel.add(optionInput3, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        optionInput4 = new JTextField();
        questionPanel.add(optionInput4, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, -1), null, 0, false));
        optionSelector3 = new JRadioButton();
        optionSelector3.setText("");
        questionPanel.add(optionSelector3, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        optionSelector2 = new JRadioButton();
        optionSelector2.setText("");
        questionPanel.add(optionSelector2, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        optionSelector4 = new JRadioButton();
        optionSelector4.setSelected(false);
        optionSelector4.setText("");
        questionPanel.add(optionSelector4, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        optionSelector1 = new JRadioButton();
        optionSelector1.setEnabled(true);
        optionSelector1.setSelected(false);
        optionSelector1.setText("");
        questionPanel.add(optionSelector1, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        addQuestion = new JButton();
        addQuestion.setBackground(new Color(-8197072));
        addQuestion.setEnabled(true);
        addQuestion.setText("Add Question");
        questionPanel.add(addQuestion, new com.intellij.uiDesigner.core.GridConstraints(7, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        saveQuiz = new JButton();
        saveQuiz.setBackground(new Color(-15576084));
        saveQuiz.setForeground(new Color(-14869219));
        saveQuiz.setText("Save Quiz");
        questionPanel.add(saveQuiz, new com.intellij.uiDesigner.core.GridConstraints(7, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        questionInput = new JTextArea();
        questionPanel.add(questionInput, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 5, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
        optionLabel = new JLabel();
        optionLabel.setText("Enter the choices below and Select correct answer:");
        questionPanel.add(optionLabel, new com.intellij.uiDesigner.core.GridConstraints(2, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return questionPanel;
    }
}
