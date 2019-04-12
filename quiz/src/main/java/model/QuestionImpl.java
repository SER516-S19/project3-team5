package main.java.model;

import java.util.ArrayList;

/**
 * @author      Cecilia La Place, Aravinda Sai Kondamari
 * @version     1.0
 * @since       1.0
 */
public class QuestionImpl implements QuestionsDAO{
    private ArrayList<Question> questions;

    /**
     * Default constructor
     */
    public QuestionImpl() {
    }

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
     * Get size of list of questions
     *
     * @return size
     */
    public int getSize(){
        return this.questions.size();
    }
    /**
     * Set question at location index (overload)
     *
     * @param question
     * @param loc
     */
    public void setQuestion(Question question, int loc) {
        if(questions == null){
            questions = new ArrayList<>();
        }
        this.questions.add(loc, question);
    }

    /**
     * Add question to questions list
     *
     * @param question
     */
    public void setQuestion(Question question) {
        if(questions == null){
            questions = new ArrayList<>();
        }
        this.questions.add(question);
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
