package model;

import java.util.ArrayList;

/**
 * @author      Cecilia La Place
 * @version     1.0
 * @since       1.0
 */
public class QuestionImpl implements QuestionsDAO{
    private ArrayList<Question> questions;

    /**
     * Constructor for QuestionImpl
     *
     * @param questions
     */
    public QuestionImpl(ArrayList<Question> questions) {
        this.questions = questions;
    }

    /**
     * Return question at location index
     *
     * @param loc
     * @return question content
     */
    public Question getQuestion(int loc) {
        return this.questions.get(loc);
    }

    /**
     * Get list of questions
     *
     * @return question content
     */
    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    /**
     * Set question at end of array
     *
     * @param question
     */
    public void setQuestion(Question question) {
        this.questions.add(question);
    }

    /**
     * Set question at location index (overload)
     *
     * @param question
     * @param loc
     */
    public void setQuestion(Question question, int loc) {
        this.questions.add(loc, question);
    }

    /**
     * Set list of questions
     *
     * @param questions
     */
    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
