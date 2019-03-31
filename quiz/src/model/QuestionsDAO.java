package model;

import java.util.ArrayList;

public interface QuestionsDAO {

    public Question getQuestion(int loc);

    public ArrayList<Question> getQuestions();

    public void setQuestion(Question question);

    public void setQuestion(Question question, int loc);

    public void setQuestions(ArrayList<Question> questions);
}
