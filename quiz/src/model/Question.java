package model;

import java.util.ArrayList;

public class Question {
    private String title;
    private ArrayList<String> Options;
    private String correctAnswer;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getOptions() {
        return Options;
    }

    public void setOptions(ArrayList<String> options) {
        Options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Question(String title, ArrayList<String> options, String correctAnswer) {
        this.title = title;
        Options = options;
        this.correctAnswer = correctAnswer;
    }
}
