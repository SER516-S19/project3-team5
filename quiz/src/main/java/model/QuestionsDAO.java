package main.java.model;

import java.util.ArrayList;

/**
 * @author      Cecilia La Place
 * @version     1.0
 * @since       1.0
 */
public interface QuestionsDAO {

    /**
     * Return question at location index
     *
     * @param loc
     * @return question content
     */
    public Question getQuestion(int loc);

    /**
     * Get list of questions
     *
     * @return question content
     */
    public ArrayList<Question> getQuestions();

    /**
     * Get size of list of questions
     *
     * @return size
     */
    public int getSize();
    /**
     * Set question at end of array
     *
     * @param question
     */
    public void setQuestion(Question question);

    /**
     * Set question at location index (overload)
     *
     * @param question
     * @param loc
     */
    public void setQuestion(Question question, int loc);

    /**
     * Set list of questions
     *
     * @param questions
     */
    public void setQuestions(ArrayList<Question> questions);
}
