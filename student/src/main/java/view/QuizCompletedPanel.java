package view;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author Siva Pranav Mandadi,
 * @version 1.1
 * 
 */


//call the constructor for the panel
public class QuizCompletedPanel{
	public QuizCompletedPanel(JFrame studentFrame){
		super();
		JPanel quizcompletedpanel = new JPanel();
		JLabel label = new JLabel("Quiz has been completed");
        quizcompletedpanel.setSize(800, 600);
        quizcompletedpanel.add(label);



	}


}