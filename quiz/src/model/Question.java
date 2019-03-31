package model;

import java.util.ArrayList;

public class Question {
    private String content;
    private ArrayList<String> choices;
    private String correctAnswer;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<String> getChoices() {
        return this.choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Question(String content, ArrayList<String> choices, String correctAnswer) {
        this.content = content;
        this.choices = choices;
        this.correctAnswer = correctAnswer;
    }
}
