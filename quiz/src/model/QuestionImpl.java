package model;

import java.util.ArrayList;

public class QuestionImpl implements QuestionsDAO{
    private ArrayList<Question> questions;

    public QuestionImpl(String quizName, ArrayList<Question> questions) {
        this.questions = questions;
    }

    public Question getQuestion(int loc) {
        return this.questions.get(loc);
    }
    
    public ArrayList<Question> getQuestions() {
        return this.questions;
    }

    public void setQuestion(Question question) {
        this.questions.add(question);
    }

    public void setQuestion(Question question, int loc) {
        this.questions.add(loc, question);
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }
}
