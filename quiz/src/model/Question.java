package model;

import java.util.ArrayList;

/**
 * @author      Koushik Kotamraju, Cecilia La Place
 * @version     1.0
 * @since       1.0
 */
public class Question {
    private String content;
    private ArrayList<String> choices;
    private String correctAnswer;

    /**
     * Constructor for Question
     *
     * @param content
     * @param choices
     * @param correctAnswer
     */
    public Question(String content, ArrayList<String> choices, String correctAnswer) {
        this.content = content;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Return question content
     *
     * @return question content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Return question choices
     *
     * @return list of choices
     */
    public ArrayList<String> getChoices() {
        return this.choices;
    }

    /**
     * Return correct answer for question
     *
     * @return correct answer
     */
    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

    /**
     * Set question content
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Set question's choices
     *
     * @param choices
     */
    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    /**
     * Set question's correct answer
     *
     * @param choices
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
