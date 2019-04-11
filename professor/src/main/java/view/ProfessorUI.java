package main.java.view;

import main.java.controller.ProfessorController;
import main.java.model.QuestionImpl;

import javax.swing.*;

/**
 * Class to create Professor UI Frame and add all panels in the frame
 * @author Aravinda Sai Kondamari
 * @version 1.1
 * @since 04/02/2019
 *
 */
public class ProfessorUI{

    public static void main(String[] args) {
        new ProfessorController(new JFrame(), new ProfessorWelcomeUI(), new AddQuestionPanel(), new QuestionImpl());
    }
}