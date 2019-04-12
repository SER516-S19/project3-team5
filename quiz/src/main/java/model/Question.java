package main.java.model;

import java.util.ArrayList;

/**
 * @author      Koushik Kotamraju, Cecilia La Place, Aravinda Sai Kondamari
 * @version     1.0
 * @since       04/02/2019
 */
public class Question {
    private String title;
    private ArrayList<String> options;
    private String correctAnswer;

    /**
     * Default constructor
     */
    public Question() {
    }

    /**
     * Constructor for Question
     *
     * @param title
     * @param options
     * @param correctAnswer
     */
    public Question(String title, ArrayList<String> options, String correctAnswer) {
        this.title = title;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    /**
     * Return question content
     *
     * @return question content
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Return question choices
     *
     * @return list of choices
     */
    public ArrayList<String> getOptions() {
        return this.options;
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
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set question's choices
     *
     * @param choices
     */
    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    /**
     * Add Choice to Choice list
     */
    public void setOption(String option){
        if(options == null){
            options = new ArrayList<>();
        }
        options.add(option);
    }

    /**
     * Set question's correct answer
     *
     * @param correctAnswer
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
