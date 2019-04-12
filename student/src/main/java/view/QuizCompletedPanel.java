package view;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;

/**
 *
 * Displays after a quiz is completed.
 *
 * @author Siva Pranav Mandadi, David Lahtinen
 * @version 1.1
 * 
 */


//call the constructor for the panel
public class QuizCompletedPanel extends JPanel{
    private StudentUI student;
	public QuizCompletedPanel(StudentUI studentFrame){
        super();
        student = studentFrame;
		JLabel label = new JLabel("Quiz has been completed");
        add(label);
		setOpaque(true);
		setVisible(true);
	}
}