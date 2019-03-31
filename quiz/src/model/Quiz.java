package model;

import java.util.ArrayList;

public class Quiz {
    private String quizName;
    private ArrayList<String> Questions;

    public Quiz(String quizName, ArrayList<String> questions) {
        this.quizName = quizName;
        Questions = questions;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public ArrayList<String> getQuestions() {
        return Questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        Questions = questions;
    }
}
